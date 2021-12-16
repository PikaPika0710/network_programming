package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.FileUploadBO;
import model.Bean.FileUpload;

public class WatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("user");
		String path = request.getParameter("path");
		List<FileUpload> uploadedFiles = new ArrayList<FileUpload>();
		if (user == null && path == null) {
			try {
				uploadedFiles = FileUploadBO.getAllUploadedFiles();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} else if (user != null && path == null) {
			System.out.println(user);
			try {
				uploadedFiles = FileUploadBO.getAllUploadedFilesByUser(user);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		request.setAttribute("uploadedFiles", uploadedFiles);
		request.getRequestDispatcher("files.jsp").include(request, response);
		if (user == null && path != null) {
				path = "Sources/" + (String) path.subSequence(path.lastIndexOf("/") + 1, path.length());
				request.setAttribute("path", path);
				request.getRequestDispatcher("showFile.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
