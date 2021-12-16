<%@page import="model.BEAN.Staff"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>DELETE STAFFS</title>
<style type="text/css">
table, th, td {
	border: 1px solid black;
	font-size: 20px;
}

td, h1 {
	text-align: center;
}

div {
	float: right;
}
</style>
</head>
<body style="text-align: center">
	<h1>DELETE STAFFS</h1>
	<%
	@SuppressWarnings("unchecked")
	List<Staff> staffs = (List<Staff>) request.getAttribute("staffs");
	if (staffs != null) {
	%>
	<form action="CheckDeleteServlet" method="post">
		<table style="width: 100%">
			<tr>
				<th>IDNV</th>
				<th>Ho ten</th>
				<th>IDPB</th>
				<th>Dia chi</th>
				<th>Chon</th>
			</tr>
			<%
			for (int i = 0; i < staffs.size(); i++) {
			%>
			<tr>
				<td><%=staffs.get(i).getId()%></td>
				<td><%=staffs.get(i).getName()%></td>
				<td><%=staffs.get(i).getDepartmentID()%></td>
				<td><%=staffs.get(i).getAddress()%></td>
				<td><input type="checkbox" name="IDNV"
					value="<%=staffs.get(i).getId()%>"></td>
			</tr>

			<%
			}

			}
			%>



		</table>
		<div><input type="submit" value="Xoa cac nhan vien"></div>
	</form>
</body>
</html>