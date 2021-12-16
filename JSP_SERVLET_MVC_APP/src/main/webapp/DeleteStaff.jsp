<%@page import="model.BEAN.Staff"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>DELETE STAFF</title>
<style type="text/css">
table, th, td {
	border: 1px solid black;
	font-size: 20px;
}

td, h1 {
	text-align: center;
}
</style>
</head>
<body style="text-align: center">
	<h1>DELETE STAFF</h1>
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
			<th>Xoa</th>
		</tr>
		<%
		for (int i = 0; i < staffs.size(); i++) {
		%>
		<tr>
			<td><%=staffs.get(i).getId()%></td>
			<td><%=staffs.get(i).getName()%></td>
			<td><%=staffs.get(i).getDepartmentID()%></td>
			<td><%=staffs.get(i).getAddress()%></td>
			<td><a href="CheckDeleteServlet?id=<%=staffs.get(i).getId()%>">Xoa</a></td>
		</tr>

		<%
		}
		}
		%>
	</table>
</body>
</html>