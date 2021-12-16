<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>ADMIN MENU</title>
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
	<h1>ADMIN MENU</h1>
	<ol>
		<li><a href="ViewStaffServlet?option=all">Xem thông tin nhân viên</a></li>
		<li><a href="ViewDepartmentServlet?option=all">Xem thông tin phòng ban</a></li>
		<li><a href="FindStaffServlet?option=view">Tìm kiếm thông tin</a></li>
		<li><a href="CheckInsertServlet?option=view">Thêm nhân viên</a></li>
		<li><a href="CheckUpdateServlet?option=view">Sửa thông tin phòng ban</a></li>
		<li><a href="CheckDeleteServlet?option=one">Xoá nhân viên</a></li>
		<li><a href="CheckDeleteServlet?option=many">Xoá nhiều nhân viên</a></li>
	</ol>
</body>
</html>