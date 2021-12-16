package model.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.fileupload.FileItem;

import model.Bean.Account;
import model.Bean.FileUpload;
import utils.DBConnection;
import utils.FileUploadUtils;

public class FileInsertDAO {

	public static boolean uploadFiletoDB(FileItem fileItem, Account acc, String status) throws SQLException {
		FileUpload fu = FileUploadUtils.getUploadedFile(fileItem, acc, status);
		Connection con = DBConnection.getConnection();
		Statement s;
		s = con.createStatement();
		String queryInsert = "Insert into fileupload(path, name, uploader, status) " + "values('" + fu.getPath() + "','"
				+ fu.getName() + "','" + fu.getUploader() + "','" + fu.getStatus() + "')";
		int row = s.executeUpdate(queryInsert);
		return row > 0;
	}

}
