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

@WebServlet("/CheckUpdateServlet")
public class CheckUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckUpdateServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String option = request.getParameter("option");
		if (option != null) {
			if (option.equals("view")) {
				List<Department> departments = DepartmentBO.getAllDepartment();
				request.setAttribute("departments", departments);
				RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
				rd.forward(request, response);
			}
		} else {
			String IDPB = request.getParameter("IDPB");
			String Tenpb = request.getParameter("Tenpb");
			String Mota = request.getParameter("Mota");
			if (IDPB != null && Tenpb == null && Mota == null) {
				Department d = DepartmentBO.getDepartmentByID(IDPB);
				request.setAttribute("d", d);
				RequestDispatcher rd = request.getRequestDispatcher("DepartmentUpdate.jsp");
				rd.forward(request, response);
			} else {
				Department d = new Department(IDPB, Tenpb, Mota);
				if (DepartmentBO.updateDepartment(d)) {
					response.sendRedirect("CheckUpdateServlet?option=view");
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
