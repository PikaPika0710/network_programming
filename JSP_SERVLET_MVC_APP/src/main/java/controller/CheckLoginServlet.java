package controller;

import java.io.IOException;
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
			String usr = request.getParameter("username");
			String pw = request.getParameter("password");
			Account ac = CheckLoginBO.checkLogin(usr, pw);
			if(ac!=null) {
				if(ac.getIdRole() == 1) {
					response.sendRedirect("AdminMenu.jsp");
				}
				else if(ac.getIdRole() == 0) {
					response.sendRedirect("UserMenu.jsp");
				}
			}
			else {
				response.sendRedirect("Login.jsp");
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
