<%@page import="model.Bean.Account"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>UPLOAD FORM</title>
</head>
<body>
	<%
		Account a = (Account) request.getSession().getAttribute("account");
		if (a != null) {
	%>
	<div class="container">
		<form action="FileUploadServlet" method = "post" onsubmit="uploading()" enctype="multipart/form-data">
			<input class="file" type = "file" name = "file" required="required" multiple><br>
			<input class="go-back" type = "submit" name = "submit" value = "Upload">
			<input class="go-back" type = "reset" name = "reset" value = "Reset">
			<div class="box-upload" id="uploading">
				<p >Uploading <span id="dots"></span></p>
				<p>Please don't go. Just wait for a minute.</p>
			</div>
		</form>
		<button id="go-back" class="go-back" type = "button" name = "back" onClick="history.back()">Go back</button>
	</div>
	<%
		} else {
			response.sendRedirect("login.jsp");
		}
	%>

</body>
<style>
.file{
width: 100%;
}
.box-upload {
	font-size: 18px;
	
}
#uploading {
	display:none;
}
form {
    background-color: #6c89d9;
    padding: 20px;
    border-radius: 12px;
}
.go-back {
	width: 80px;
	height: 30px;
	border-radius: 5px;
	border: none;
	cursor: pointer;
	margin-top: 15px;
	font-weight: 600;
}
.container {
	/* background-color: #fff; */
	border-radius: 12px;
	padding: 16px;
	width: 40%;
	margin: 200px auto 0;
	overflow:hidden;
}
body {
	overflow: hidden;
	background-image: url('https://cdn.wallpapersafari.com/34/55/8ciD7v.png');
	background-repeat: no-repeat;
	background-size: cover;
	height: 100vh;
	width: 100vw;
	margin: 0;
	padding: 0;
}
</style>
<script type="text/javascript">
function uploading() {
	 var goBack= document.getElementById('go-back');
	 goBack.disabled  = true;
	 var dots = document.getElementById("dots");
	  let count = 0;
	  setInterval(()=> {
	  	 count++;
	     if(count === 5) {
	     	count = 0;
	        dots.innerHTML = ''
	     }
	 	 dots.innerHTML = dots.textContent + "."
	  	
	  },500)
	  var uploading= document.getElementById('uploading');
	  uploading.style.display = 'block';
}
</script>
</html>



