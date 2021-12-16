<%@page import="model.BEAN.Staff"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>STAFF INFORMATION</title>
<style>
table, th, td {
	border: 1px solid black;
	font-size: 20px;
}

td,h1 {
	text-align: center;
}
</style>
</head>
<body>
	<h1>STAFF INFORMATION</h1>
	<%
	@SuppressWarnings("unchecked")
	List<Staff> staffs = (List<Staff>) request.getAttribute("staffs");
	if (staffs != null) {
	%>
	<table style="width: 100%">
		<tr>
			<th>IDNV</th>
			<th>Ho ten</th>
			<th>IDPB</th>
			<th>Dia chi</th>
		</tr>
		<%
		for (int i = 0; i < staffs.size(); i++) {
		%>
		<tr>
			<td><%=staffs.get(i).getId()%></td>
			<td><%=staffs.get(i).getName()%></td>
			<td><%=staffs.get(i).getDepartmentID()%></td>
			<td><%=staffs.get(i).getAddress()%></td>
		</tr>

		<%
		}
	}
	%>
	</table>
</body>
</html>