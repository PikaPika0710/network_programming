<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>USER MENU</title>
<style type="text/css">
h1 {
	color: red;
	font-size: 50px;
}

li {
	font-style: itatlic;
	font-size: 20px;
}
</style>
</head>
<body style="text-align: center;">
	<h1>USER MENU</h1>
	<ol>
		<li><a href="ViewStaffServlet?option=all">Xem thông tin nhân viên</a></li>
		<li><a href="ViewDepartmentServlet?option=all">Xem thông tin phòng ban</a></li>
		<li><a href="FindStaffServlet?option=view">Tìm kiếm thông tin</a></li>
	</ol>
</body>
</html>