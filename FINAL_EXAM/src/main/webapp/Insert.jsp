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
	<label for="MaVacXin">MaVacXin: </label> 
	<input type="text" name="MaVacXin" placeholder="MaVacXin..." required="required"><br><br>
	<label for="TenVacXin">TenVacXin: </label>
	<input type="text" name="TenVacXin" placeholder="TenVacXin..." required="required"><br><br>
	<label for="SoMui">SoMui: </label> 
	<input type="text" name="SoMui" placeholder="SoMui..." required="required"><br><br>
	<label for="MoTa">MoTa: </label>
	<input type="text" name="MoTa" placeholder="MoTa..." required="required"><br><br>
	<label for="GiaVacXin">GiaVacXin: </label>
	<input type="text" name="GiaVacXin" placeholder="GiaVacXin..." required="required"><br><br>
	<label for="TenHangSX">TenHangSX: </label>
	<input type="text" name="TenHangSX" placeholder="TenHangSX..." required="required"><br><br>
	<input type="submit" value="Insert"> 
	<input type="reset" value="Reset">
	</form>
</body>
</html>