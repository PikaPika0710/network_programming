<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
</head>
<body style="text-align: center">
	<% String temp = "temp";
		session.setAttribute("temp", temp);
	%>
	<form action="CheckLoginServlet" method="post">
	<h1 style="font-size:20px; color: red; font-style=italic">LOGIN</h1>
		<label for="username">Username: </label> <input type="text"
			name="username" /> <br> <br> <label for="password">Password:
		</label> <input type="password" name="password" /> <br> <br> <input
			type="submit" value="Login"> <input type="reset"
			value="Reset">
	</form>

</body>
</html>