<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page language="java" contentType="text/html" pageEncoding="utf-8"%>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");

String address = "192 Nguyen Luong Bang";
try {
	Class.forName("com.mysql.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/dulieu";
	String user = "root";
	String pass = "";
	Connection conn = DriverManager.getConnection(url, user, pass);
	Statement st = conn.createStatement();
	String sql = "Select * from admin where username ='" + username + "' and password ='" + password + "'";
	ResultSet rs = st.executeQuery(sql);
	if (rs.next()) {
		request.setAttribute("address", address);
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
	} else {
		response.sendRedirect("login.jsp");
	}
} catch (Exception e) {
	e.printStackTrace();
}
%>
