package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BEAN.VacXin;
import model.BO.CheckUpdateBO;
import model.BO.VacXinBO;

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
				List<VacXin> vacxins = new ArrayList<VacXin>();
				try {
					vacxins = VacXinBO.getAllVacXinBO();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				request.setAttribute("vacxins", vacxins);
				RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
				rd.forward(request, response);
			}
		} else {
			String id = request.getParameter("id");
			if (id != null) {
				VacXin d = null;
				try {
					d = VacXinBO.getVacXinbyID(id);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				request.setAttribute("d", d);
				RequestDispatcher rd = request.getRequestDispatcher("VacXinUpdate.jsp");
				rd.forward(request, response);
			} else {
				String MaVacXin = request.getParameter("MaVacXin");
				String TenVacXin = request.getParameter("TenVacXin");
				int SoMui = Integer.parseInt(request.getParameter("SoMui"));
				String MoTa = request.getParameter("MoTa");
				double GiaVacXin = Double.parseDouble(request.getParameter("GiaVacXin"));
				String TenHangSX = request.getParameter("TenHangSX");
				VacXin v = new VacXin(MaVacXin, TenVacXin, SoMui, MoTa, GiaVacXin, TenHangSX);
				try {
					if (CheckUpdateBO.update(v)) {
						System.out.println("Update thanh cong");
						response.sendRedirect("CheckUpdateServlet?option=view");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
