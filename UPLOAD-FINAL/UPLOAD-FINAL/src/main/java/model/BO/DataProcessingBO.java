package model.BO;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.fileupload.FileItem;

import model.Bean.Account;
import utils.FileUploadUtils;

public class DataProcessingBO {
	private static final String UPLOADING = "UPLOADING";
	private static final String FAILED = "FAILED";
	private static final String SUCCESSFULLY = "SUCCESSFULLY";

	public static void process(List<FileItem> fileItems, Account acc) throws InterruptedException {
//		try {
//			String status = "";
//			for (FileItem fileItem : fileItems) {
//				if (FileUploadUtils.getName(fileItem) != null) {
//					status = UPLOADING;
//					try {
//						if (FileInsertBO.uploadFileToDB(fileItem, acc, status)
//								&& FileUploadBO.uploadFileToFolder(fileItem, acc)) {
//							status = SUCCESSFULLY;
//						}
//					} catch (Exception ex) {
//						status = FAILED;
//						ex.printStackTrace();
//					} finally {
//						FileUpdateBO.updateStatus(fileItem, status);
//					}
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return false;

		for (FileItem fileItem : fileItems) {
			if (FileUploadUtils.getName(fileItem) != null) {
				Thread t1 = new Thread() {
					@Override
					public void run() {
						try {
							FileInsertBO.uploadFileToDB(fileItem, acc, UPLOADING);
						} catch (SQLException e) {
							FileUpdateBO.updateStatus(fileItem, FAILED);
							e.printStackTrace();
						}
					}
				};

				Thread t2 = new Thread() {
					@Override
					public void run() {
						try {
							FileUploadBO.uploadFileToFolder(fileItem, acc);
							FileUpdateBO.updateStatus(fileItem, SUCCESSFULLY);
						} catch (Exception e) {
							FileUpdateBO.updateStatus(fileItem, FAILED);
							e.printStackTrace();
						}
					}
				};
				
				t1.run();
				t1.join();
				t2.run();
			}
		}

	}

}
