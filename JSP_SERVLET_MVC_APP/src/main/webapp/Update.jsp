<%@page import="model.BEAN.Department"%>
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
	<h1>DEPARTMENT INFORMATION</h1>
	<%
	@SuppressWarnings("unchecked")
	List<Department> departments = (List<Department>) request.getAttribute("departments");
	%>
	<table>
		<tr>
			<th>Ma Phong Ban</th>
			<th>Ten Phong Ban</th>
			<th>Mo ta</th>
			<th>Cap nhat</th>
		</tr>
		<%
		for (int i = 0; i < departments.size(); i++) {
		%>
		<tr>
			<td><%=departments.get(i).getId()%></td>
			<td><%=departments.get(i).getName()%></td>
			<td><%=departments.get(i).getDescription()%></td>
			<td><a
				href="CheckUpdateServlet?IDPB=<%=departments.get(i).getId()%>">xxx</a></td>
		</tr>
		<%
		}
		%>
	</table>
	<%

	%>
</body>
</html>