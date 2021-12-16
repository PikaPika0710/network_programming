<%@page import="model.BEAN.Account"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>LOGIN</title>
</head>
<body style="text-align: center">
	<%
	Account a = (Account) request.getSession().getAttribute("account");
			if (a != null) {
		response.sendRedirect("MyHome.jsp");
			}
	%>
	<h1 style="color:red;">LOGIN</h1>
	<form action="CheckLoginServlet" method="post">
		ID: <input type="text" name="id"> <br>
		<br> PW: <input type="password" name="pw" required="required"><br>
		<br> <input type="submit" value="Login" required="required">
		<input type="reset" value="Reset"> <br> <br>
		<a href ="AccountRegistration.jsp" style="font-style: italic;">Account Registration</a>
		
	</form>
</body>
</html>