<%@page import="model.BEAN.Wife"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<table>
		<%
	ArrayList<Wife> wifeArray = (ArrayList<Wife>)request.getAttribute("wifeArray");
	for(int i= 0; i<wifeArray.size(); i++){
		%>
		<tr>

			<td><%=wifeArray.get(i).getName() %></td>
			<td><%=wifeArray.get(i).getAddress() %></td>
			<td><%=wifeArray.get(i).isAlive() %></td>
		</tr>
		<%
	}
	%>
	</table>

</body>
</html>