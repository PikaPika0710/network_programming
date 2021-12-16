<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Account Registration</title>
</head>
<body style= "text-align: center">
	<h1 style="color:red; font-style: italic">ACCOUNT REGISTRATION</h1> 
	<br> <br>
	<form action="CheckInsertServlet" method="post">
		ID: <input type="text" name="id" required="required"> 
		<br><br> 
		PW: <input type="password" name="pw" required="required">
		<br><br>
		Name: <input type="text" name = "name" required="required">
		<br> <br>
		Sex: <input type="text" name = "sex" required="required">
		<br> <br>
		Hobby: <input type="text" name = "hobby" required="required">
		<br> <br>
		<input type="submit" value="Sign up"> 
		<input type="reset" value="Reset"> 
		<br><br>
		<a href ="Login.jsp" style="font-style: italic;">Return</a>
	</form>
</body>
</html>