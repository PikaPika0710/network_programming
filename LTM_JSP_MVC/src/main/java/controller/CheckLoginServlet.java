package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BEAN.Account;
import model.BO.CheckLoginBO;

@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckLoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			Account a = CheckLoginBO.checkLogin(id, pw);
			if (a == null) {
				response.sendRedirect("Login.jsp");
			} else {
//				RequestDispatcher rd = request.getRequestDispatcher("MyHome.jsp");
//				rd.forward(request, response);
// 				=> Forward data from login to myhome => NOT OK
				
				request.getSession().setAttribute("account", a);
				response.sendRedirect("MyHome.jsp");
			}
		} catch (Exception ex) {

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
