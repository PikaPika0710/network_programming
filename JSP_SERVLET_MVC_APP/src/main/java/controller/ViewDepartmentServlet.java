package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BEAN.Department;
import model.BO.DepartmentBO;

@WebServlet("/ViewDepartmentServlet")
public class ViewDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ViewDepartmentServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String option = request.getParameter("option");
			List<Department> departments = null;
			if (option.equals("all")) {
				departments = DepartmentBO.getAllDepartment();
			}
			request.setAttribute("departments", departments);
			RequestDispatcher rd = request.getRequestDispatcher("DepartmentInfomation.jsp");
			rd.forward(request, response);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
