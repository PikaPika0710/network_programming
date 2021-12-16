package model.DAO;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.fileupload.FileItem;

import model.Bean.Account;
import model.Bean.FileUpload;
import utils.DBConnection;
import utils.FileUploadUtils;

public class FileUploadDAO {
	private static final String PATH = "D:/BACH KHOA/Nam III_Ki I/PBL4 - Nguyen Tan Khoi/UPLOAD-FINAL/src/main/webapp/Sources";

	private FileUploadDAO() {

	}

	public static boolean uploadFileToFolderDAO(FileItem fileItem, Account acc) {
		File folderUpload = new File(PATH);
		if (!folderUpload.exists()) {
			folderUpload.mkdirs();
		}

		boolean check = false;
		try {
			fileItem.write(new File(FileUploadUtils.getNewPath(fileItem)));
			check = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return check;
	}

	public static List<FileUpload> getAllUploadedFiles() throws SQLException {
		List<FileUpload> uploadedFiles = new ArrayList<FileUpload>();
		Connection con = DBConnection.getConnection();
		String query = "Select * from fileupload";
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(query);
		while (rs.next()) {
			String path = rs.getString("path");
			String name = rs.getString("name");
			String uploader = rs.getString("uploader");
			String status = rs.getString("status");
			FileUpload fu = new FileUpload(name, path, uploader, status);
			uploadedFiles.add(fu);
		}
		return uploadedFiles;
	}

	public static List<FileUpload> getAllUploadedFilesByUser(String user) throws SQLException {
		List<FileUpload> uploadedFiles = new ArrayList<FileUpload>();
		Connection con = DBConnection.getConnection();
		String query = "Select * from fileupload where uploader = '" + user + "'";
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(query);
		while (rs.next()) {
			String path = rs.getString("path");
			String name = rs.getString("name");
			String uploader = rs.getString("uploader");
			String status = rs.getString("status");
			FileUpload fu = new FileUpload(name, path, uploader, status);
			uploadedFiles.add(fu);
		}
		return uploadedFiles;
	}

}
