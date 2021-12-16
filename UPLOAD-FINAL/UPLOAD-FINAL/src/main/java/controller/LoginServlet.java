package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bean.Account;

public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usr = request.getParameter("username");
		String pwd = request.getParameter("password");
		System.out.println("username: " + usr);
		System.out.println("password: " + pwd);
		Account a = model.BO.LoginBO.checkLogin(usr, pwd);
		if (a == null) {
			System.out.println("Login Failed!");
			response.sendRedirect("login.jsp");
		} else {
			System.out.println("Login Successfully!");
			request.getSession().setAttribute("account", a);
			response.sendRedirect("home.jsp");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
