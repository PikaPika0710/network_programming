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

@WebServlet("/ViewStaffServlet")
public class ViewStaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViewStaffServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String option = request.getParameter("option");
		List<Staff> staffs = null;
		if(option.equals("all")) {
			staffs = StaffBO.getAllStaff();
		}
		else if(option.contains("PB")) {
			staffs = StaffBO.getAllStaffOfDepartment(option);
		}
		request.setAttribute("staffs", staffs);
		RequestDispatcher rd = request.getRequestDispatcher("StaffInformation.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
