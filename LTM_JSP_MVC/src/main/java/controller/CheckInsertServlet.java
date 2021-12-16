package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.CheckInsertBO;

@WebServlet("/CheckInsertServlet")
public class CheckInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckInsertServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String sex = request.getParameter("sex");
			String hobby = request.getParameter("hobby");
			if (CheckInsertBO.checkInsertBO(id, pw, name, sex, hobby)) {
				System.out.println("Insert Successfully!");
				response.sendRedirect("Login.jsp");
			} else {
				response.sendRedirect("AccountRegistration.jsp");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
