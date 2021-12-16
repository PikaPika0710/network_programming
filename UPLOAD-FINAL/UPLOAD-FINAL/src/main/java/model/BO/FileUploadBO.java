package model.BO;


import java.sql.SQLException;
import java.util.List;

import org.apache.commons.fileupload.FileItem;

import model.Bean.Account;
import model.Bean.FileUpload;
import model.DAO.FileUploadDAO;

public class FileUploadBO {
	private FileUploadBO() {

	}

	public static boolean uploadFileToFolder(FileItem fileItem, Account ac) throws Exception {
		return FileUploadDAO.uploadFileToFolderDAO(fileItem, ac);
	}

	public static List<FileUpload> getAllUploadedFiles() throws SQLException {
		return FileUploadDAO.getAllUploadedFiles();
	}

	public static List<FileUpload> getAllUploadedFilesByUser(String user) throws SQLException {
		return FileUploadDAO.getAllUploadedFilesByUser(user);
	}
}