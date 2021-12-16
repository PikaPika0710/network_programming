<%@page import="model.BEAN.VacXin"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>DEPARTMENT UPDATE</title>
</head>
<body style="text-align: center">
	<h1>UPDATE DEPARTMENT INFOMATION</h1>
	<%
	VacXin d = (VacXin) request.getAttribute("d");
	if (d != null) {
	%>
	<form action="CheckUpdateServlet" method="post">
		<label for="MaVacXin">MaVacXin: </label> <input type="text"
			name="MaVacXin" required="required" readonly="readonly"
			value=<%=d.getMaVacXin()%>><br> <br> <label
			for="TenVacXin">TenVacXin: </label> <input type="text"
			name="TenVacXin" required="required" value=<%=d.getTenVacXin()%>><br>
		<br> <label for="SoMui">SoMui: </label> <input type="text"
			name="SoMui" required="required" value="<%=d.getSoMui()%>"><br>
		<br> <label for="MoTa">MoTa: </label> <input type="text"
			name="MoTa" required="required" value="<%=d.getMoTa()%>"><br>
		<br> <label for="GiaVacXin">GiaVacXin: </label> <input
			type="text" name="GiaVacXin" required="required"
			value="<%=d.getGiaVacXin()%>"><br> <br> <label
			for="TenHangSX">TenHangSX: </label> <input type="text"
			name="TenHangSX" required="required" value="<%=d.getTenHangSX()%>"><br>
		<br> <input type="submit" value="Update"> <input
			type="reset" value="Reset">
	</form>
	<%
	}
	%>

</body>
</html>