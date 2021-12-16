<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
	try{
		 int h = Integer.parseInt(request.getParameter("h"));
		 String s = "*";
		 for(int i =0; i<h; i++){
	 %>
				<center><%= s%></center>
	<%
			 	s+="**";
		 }
		 
	}
	catch(Exception ex){
	%>
		Nhập không đúng định dạng!
	<% 
	}
%>
</body>
</html>