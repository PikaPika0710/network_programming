package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BEAN.VacXin;
import model.BO.CheckInsertBO;

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
		} else {
			String MaVacXin = request.getParameter("MaVacXin");
			String TenVacXin = request.getParameter("TenVacXin");
			int SoMui = Integer.parseInt(request.getParameter("SoMui"));
			String MoTa = request.getParameter("MoTa");
			double GiaVacXin = Double.parseDouble(request.getParameter("GiaVacXin"));
			String TenHangSX = request.getParameter("TenHangSX");
			VacXin v = new VacXin(MaVacXin, TenVacXin, SoMui, MoTa, GiaVacXin, TenHangSX);
			try {
				if (CheckInsertBO.insertVacXin(v)) {
					System.out.println("Insert thanh cong");
					response.sendRedirect("CheckLoginServlet.java");
				} else {
					System.out.println("Insert that bai");
					response.sendRedirect("Insert.jsp");
				}
			} catch (SQLException | IOException e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
