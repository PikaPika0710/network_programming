<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Expressions</title>
</head>
<body>
	<h2>JSP Expressions</h2>
	<ul>
		<li>Current time: <%= new Date() %></li>
		<li>Server: <%= application.getServerInfo() %></li>
		<li>Session ID: <%= session.getId() %></li>
		<li>Host: <%= request.getRemoteHost() %></li>
		<li>The <code>testParam</code> form parameter: <%= request.getParameter("testParam") %></li>
	</ul>
</body>
</html>