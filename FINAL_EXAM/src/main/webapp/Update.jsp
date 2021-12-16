<%@page import="model.BEAN.VacXin"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>UPDATE</title>
<style type="text/css">
body {
	text-align: center;
}

table {
	width: 100%;
}

table, th, td {
	border: 1px solid;
	font-size: 20px;
}
</style>
</head>
<body>
	<h1>VACXIN INFORMATION</h1>
	<%
	@SuppressWarnings("unchecked")
	List<VacXin> vacxins = (List<VacXin>) request.getAttribute("vacxins");
	%>
	<table>
		<tr>
			<th>Ma Vac Xin</th>
			<th>Ten Vac Xin</th>
			<th>So Mui</th>
			<th>Mo Ta</th>
			<th>Gia Vac Xin</th>
			<th>Ten Hang SX</th>
		</tr>
		<%
		for (int i = 0; i < vacxins.size(); i++) {
		%>
		<tr>
			<td><%=vacxins.get(i).getMaVacXin()%></td>
			<td><%=vacxins.get(i).getTenVacXin()%></td>
			<td><%=vacxins.get(i).getSoMui()%></td>
			<td><%=vacxins.get(i).getMoTa()%></td>
			<td><%=vacxins.get(i).getGiaVacXin()%></td>
			<td><%=vacxins.get(i).getTenHangSX()%></td>
			<td><a
				href="CheckUpdateServlet?id=<%=vacxins.get(i).getMaVacXin()%>">xxx</a></td>
		</tr>
		<%
		}
		%>
	</table>
	<%

	%>
</body>
</html>