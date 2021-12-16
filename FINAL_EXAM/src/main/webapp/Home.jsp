<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>HOME</title>
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
	<h1>HOME</h1>
	<ol>
		<li><a href="CheckInsertServlet?option=view">Tạo mới một loại vacxin</a></li>
		<li><a href="CheckUpdateServlet?option=view">Sửa thông tin một loại vacxin</a></li>
		<li><a href="">Tìm kiếm thông tin</a></li>
		<li><a href="">Liệt kê lịch sử tiêm phòng</a></li>
		<li><a href="">Thống kê số tiền đã trả</a></li>
	</ol>
</body>
</html>