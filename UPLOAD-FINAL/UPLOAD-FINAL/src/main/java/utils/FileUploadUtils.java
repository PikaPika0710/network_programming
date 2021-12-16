package utils;

import java.io.File;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.io.FilenameUtils;

import model.Bean.Account;
import model.Bean.FileUpload;

public class FileUploadUtils {
	// Sua path = project -> main
	// private static final String PATH = "D:/BACH KHOA/Nam III_Ki I/PBL4 - Nguyen Tan Khoi/UPLOAD-FINAL/src/main/webapp/Sources";
	private static final String PATH = "D:/Sources";
	private FileUploadUtils() {
		
	}

	public static FileUpload getUploadedFile(FileItem fileItem, Account acc, String status) {
		if (FilenameUtils.getName(fileItem.getName()) != null) {
			String path = getNewPath(fileItem);
			String name = getName(fileItem);
			String uploader = acc.getUsername();
			return new FileUpload(name, path, uploader, status);
		}
		return null;
	}

	public static String getName(FileItem fileItem) {
		return FilenameUtils.getName(fileItem.getName());
	}

	public static String getNewPath(FileItem fileItem) {
		File folderUpload = new File(PATH);
		if (!folderUpload.exists()) {
			folderUpload.mkdirs();
		}	
		String path = PATH + "/" + getName(fileItem);
		return path;
	}
}
