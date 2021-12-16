<!DOCTYPE html>
<html>
<head>
<title>SHOW</title>
</head>
<body>
	<!-- private static final String PATH = "D:/BACH KHOA/Nam III_Ki I/PBL4 - Nguyen Tan Khoi/FileUploadDemo/src/main/resources"; -->
	<%
	String path = (String) request.getAttribute("path");
	if (path.endsWith(".mp4") || path.endsWith(".mkv")) {
	%>
	<video width="400px" height="500px" controls>
		<source src="<%=path%>" type=video/mp4>
	</video>
	<%
	} else {
	response.sendRedirect("WatchServlet");
	}
	%>
</body>
</html>