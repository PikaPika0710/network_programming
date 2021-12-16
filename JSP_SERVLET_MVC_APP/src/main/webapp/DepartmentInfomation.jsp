<%@page import="model.BEAN.Department"%>
<%@page import="model.BEAN.Staff"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>DEPARTMENT INFORMATION</title>
<style>
table, th, td {
	border: 1px solid black;
	font-size: 20px;
}

td, h1 {
	text-align: center;
}
</style>
</head>
<body>
	<h1>DEPARTMENT INFORMATION</h1>
	<%
	@SuppressWarnings("unchecked")
	List<Department> departments = (List<Department>) request.getAttribute("departments");
	if (departments != null) {
	%>
	<table style="width: 100%">
		<tr>
			<th>Ma Phong Ban</th>
			<th>Ten Phong Ban</th>
			<th>Mo ta</th>
			<th>Xem Nhan Vien</th>
		</tr>
		<%
		for (int i = 0; i < departments.size(); i++) {
		%>
		<tr>
			<td><%=departments.get(i).getId()%></td>
			<td><%=departments.get(i).getName()%></td>
			<td><%=departments.get(i).getDescription()%></td>
			<td><a
				href="ViewStaffServlet?option=<%=departments.get(i).getId()%>">xxx</a></td>
		</tr>

		<%
		}
		}
		%>
	</table>
</body>
</html>