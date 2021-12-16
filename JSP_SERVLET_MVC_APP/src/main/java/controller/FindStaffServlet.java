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

@WebServlet("/FindStaffServlet")
public class FindStaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FindStaffServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String option = request.getParameter("option");
		List<Staff> staffs = null;
		if (option != null) {
			if (option.equals("view")) {
				response.sendRedirect("Search.jsp");
			}
		} else {
			String how = request.getParameter("how");
			String value = request.getParameter("value");
			staffs = StaffBO.findAllStaff(how, value);
			request.setAttribute("staffs", staffs);
			if (staffs.isEmpty()) {
				response.sendRedirect("Search.jsp");
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("StaffInformation.jsp");
				rd.forward(request, response);
				System.out.println(how + ", " + value);
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
