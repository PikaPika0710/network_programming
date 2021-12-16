<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<%
	String username = request.getParameter("username");
	String address = (String)request.getAttribute("address");
	String temp = (String)session.getAttribute("temp");
	%>
	Welcome = <%=username%>	<br> 
	You are living at = <%=address%>	<br> 
	Temp =	<%=temp%>
	<br>
</body>
</html>