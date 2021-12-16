<%@page import="model.BEAN.Department"%>
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
	Department d = (Department) request.getAttribute("d");
	if (d != null) {
	%>
	<form action="CheckUpdateServlet" method="post">
		<label for="IDPB">Ma Phong Ban: </label> <input type="text"
			name="IDPB" required="required" readonly="readonly"
			value=<%=d.getId()%>><br>
		<br> <label for="Tenpb">Ten Phong Ban: </label> <input
			type="text" name="Tenpb" required="required" value=<%=d.getName()%>><br>
		<br> <label for="Mota">Mota: </label> <input type="text"
			name="Mota" required="required" value="<%=d.getDescription()%>"><br>
		<br>
		<input type="submit" value="Update">
		<input type="reset" value="Reset">
	</form>
	<%
	}
	%>

</body>
</html>