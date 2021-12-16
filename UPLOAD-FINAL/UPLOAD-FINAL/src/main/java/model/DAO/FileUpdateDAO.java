package model.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.fileupload.FileItem;

import utils.DBConnection;
import utils.FileUploadUtils;

public class FileUpdateDAO {
	public static void updateStatus(FileItem item, String status) {
		try {
			Connection con = DBConnection.getConnection();
			String query = "Update fileupload set status = '" + status + "' where path = '" + FileUploadUtils.getNewPath(item)	+ "'";
			Statement s = con.createStatement();
			s.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
