<%@page import="model.BEAN.Account"%>
<%@page import="model.BO.CheckLoginBO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>My Home</title>
</head>
<body style="margin-left:40%">
	<%
	//String id = request.getParameter("id");
			//String pw = request.getParameter("pw");
			//Account a = CheckLoginBO.checkLogin(id, pw);
			Account a = (Account) request.getSession().getAttribute("account");
			if (a != null) {
	%>
	<h1>MY HOME</h1>
	ID:
	<%=a.getId()%>
	<br> Tên:
	<%=a.getName()%>
	<br> Giới Tính:
	<%=a.getSex()%>
	<br> Sở thích:
	<%=a.getHobby()%>
	<br><br>
	<form action="LogoutServlet" method="post">
		<input type="submit" value="Logout" style="font-style: italic; color: red"> 
	</form>
	<%
	}
	else{
		response.sendRedirect("Login.jsp");
	}
	%>
	
</body>
</html>