<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert</title>
</head>
<body style="text-align: center;">
	<h1>INSERT</h1>
	<form action="CheckInsertServlet" method="post">
	<label for="IDNV">IDNV: </label> 
	<input type="text" name="IDNV" placeholder="IDNV..." required="required"><br><br>
	<label for="Hoten">Hoten: </label>
	<input type="text" name="Hoten" placeholder="Hoten...." required="required"><br><br>
	<label for="IDPB">IDPB: </label> 
	<input type="text" name="IDPB" placeholder="IDPB..." required="required"><br><br>
	<label for="Diachi">Diachi: </label>
	<input type="text" name="Diachi" placeholder="Diachi..." required="required"><br><br>
	<input type="submit" value="Insert"> 
	<input type="reset" value="Reset">
	</form>
</body>
</html>