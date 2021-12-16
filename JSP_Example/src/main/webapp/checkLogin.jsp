<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	String address = "192 Nguyen Luong Bang";
	
	if("abc".equals(username) &&(!"123".equals(password))){
		request.setAttribute("address",  address);
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
		
	}
	else{
		response.sendRedirect("login.jsp");
	}
%>