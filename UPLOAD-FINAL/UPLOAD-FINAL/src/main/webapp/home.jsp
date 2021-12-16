<%@page import="model.Bean.Account"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>HOME</title>
</head>
<body>
	<% Account ac = (Account) session.getAttribute("account");
	if (ac == null) {
		response.sendRedirect("login.jsp");
	}
	else{
	%>

	<div class="container">
		<h1 class="title">My home</h1>
		<ul>
			<li><a href="UploadServlet" target="_self">Upload Files</a><br>
			</li>
			<li><a href="WatchServlet" target="_self">All Uploaded Files</a><br></li>
			<li class="logout"><a href="LogoutServlet" target="_self">Logout</a>
			</li>
		</ul>

	</div>
	<%
	}
	%>
</body>
<style>
.title {
	color: #944cc7;
}

.logout {
	display: inline-block;
	background-color: #944cc7;
	border-radius: 6px;
	float: right;
}

.logout a {
	color: #fff;
}

.logout:hover a {
	color: #fff;
}

body {
	/* 	background-color: #E1E1E1; */
	background-image:
		url('https://cdn.wallpapersafari.com/34/55/8ciD7v.png');
	display: flex;
	align-items: center;
	justify-content: center;
	height: 100vh;
}

.container {
	background-color: #fff;
	width: 30%;
	border-radius: 12px;
	padding: 16px;
}

ul {
	list-style: none;
	padding: 0;
}

li {
	padding: 12px;
	font-size: 20px;
	font-weight: 500;
	cursor: pointer;
}

li:hover a {
	color: #944cc7;
}

a {
	color: #000;
	text-decoration: none;
}
</style>
</html>
