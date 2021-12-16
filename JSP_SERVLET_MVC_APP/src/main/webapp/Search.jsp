<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>SEARCH</title>
<style type="text/css">
body {
	text-align: center;
}
</style>
</head>
<body>
	<h1>SEARCH</h1>
	<form action="FindStaffServlet" method="post">
		<label for="how">Option:</label> <select name="how">
			<option>IDNV</option>
			<option>Hoten</option>
			<option>IDPB</option>
			<option>Diachi</option>
		</select> <br> <br> <label for="value">Value:</label> <input
			type="text" name="value" placeholder="Nhập dữ liệu"
			required="required"> <br> <br> <input type="submit"
			value="Search"> <input type="reset" value="Reset">
	</form>
</body>
</html>