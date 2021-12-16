package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import model.BO.DataProcessingBO;
import model.Bean.Account;

public class FileUploadServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Account acc = (Account) request.getSession().getAttribute("account");
		try {

			// Thong bao user
			Thread t2 = new Thread() {
				@Override
				public void run() {
					try {
						String message = "Upload Successfully";
						request.setAttribute("message", message);
						request.getSession().setAttribute("account", acc);
						request.getRequestDispatcher("result.jsp").include(request, response);
					} catch (ServletException | IOException e) {
						e.printStackTrace();
					}
				}
			};
			// start() maybe a multi-thread apprears, and that thread inside call run()
			t2.run();
			t2.join();

			// Xu ly du lieu
			Thread t1 = new Thread() {
				ServletFileUpload sfu = new ServletFileUpload(new DiskFileItemFactory());
				List<FileItem> fileItems = sfu.parseRequest(request);
				
				@Override
				public void run() {
					try {
						DataProcessingBO.process(fileItems, acc);
						System.out.println("Upload Successfully!");
					} catch (Exception e) {
						System.out.println("Upload Failed!");
						e.printStackTrace();
					}

				}
			};
			
			// run() no thread in the middle of the operation, just run ===>
			t1.start();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
