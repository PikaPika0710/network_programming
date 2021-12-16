package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BEAN.Staff;
import model.BO.StaffBO;

@WebServlet("/CheckInsertServlet")
public class CheckInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckInsertServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String option = request.getParameter("option");
		if (option != null) {
			if (option.equals("view")) {
				response.sendRedirect("Insert.jsp");
			}
		}
		else {
			String IDNV = request.getParameter("IDNV");
			String Hoten = request.getParameter("Hoten");
			String IDPB = request.getParameter("IDPB");
			String Diachi = request.getParameter("Diachi");
			Staff s = new Staff(IDNV, Hoten, IDPB, Diachi);	
			if(StaffBO.insertStaff(s)) {
				System.out.println("Insert thanh cong");
				response.sendRedirect("ViewStaffServlet?option=all");
			}
			else {
				System.out.println("Insert that bai");
				response.sendRedirect("Insert.jsp");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
