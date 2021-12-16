<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
</head>
<body>
	<%  String temp = "temp";
		session.setAttribute("temp", temp);
	%>
	<form action="checkLogin.jsp" method="post">
		Username: <input type="text" name="username" /> 
		Password: <input type="password" name="password" /> 
		<input type="submit" value="Login">
		<input type="reset" value="Reset">
	</form>

</body>
</html>