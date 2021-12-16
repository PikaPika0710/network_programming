package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BEAN.Staff;
import model.BO.StaffBO;

@WebServlet("/CheckDeleteServlet")
public class CheckDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckDeleteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String option = request.getParameter("option");
		List<Staff> staffs = StaffBO.getAllStaff();
		request.setAttribute("staffs", staffs);
		RequestDispatcher rd = null;
		if (option != null) {
			if (option.equals("one")) {
				rd = request.getRequestDispatcher("DeleteStaff.jsp");
				rd.forward(request, response);
			}
			if (option.equals("many")) {
				rd = request.getRequestDispatcher("DeleteStaffs.jsp");
				rd.forward(request, response);
			}
		} else {
			String IDNV = request.getParameter("id");
			String[] values = request.getParameterValues("IDNV");
			if (IDNV != null && values == null) {
				if (StaffBO.deleteStaff(IDNV)) {
					response.sendRedirect("CheckDeleteServlet?option=one");
				}
			} else {
				if (StaffBO.deleteStaffs(values)) {
					response.sendRedirect("CheckDeleteServlet?option=many");
				}
			}

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
