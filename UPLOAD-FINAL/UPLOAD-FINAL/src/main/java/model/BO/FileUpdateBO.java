package model.BO;


import org.apache.commons.fileupload.FileItem;

import model.DAO.FileUpdateDAO;

public class FileUpdateBO {

	public static void updateStatus(FileItem fileItem, String status) {
		FileUpdateDAO.updateStatus(fileItem, status);
	}


}
