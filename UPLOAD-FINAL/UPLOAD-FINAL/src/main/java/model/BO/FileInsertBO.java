package model.BO;


import java.sql.SQLException;

import org.apache.commons.fileupload.FileItem;

import model.Bean.Account;
import model.DAO.FileInsertDAO;

public class FileInsertBO {

	public static boolean uploadFileToDB(FileItem fileItem, Account acc, String status) throws SQLException {
		return FileInsertDAO.uploadFiletoDB(fileItem, acc, status);
	}

}
