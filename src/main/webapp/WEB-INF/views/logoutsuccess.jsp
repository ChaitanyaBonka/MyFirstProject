<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Logout successful</title>
</head>
<body>
<center>
<!-- <h2>Logged out successfully...!!!</h2> -->
<div class="box_container">
		<div class="success_container">
			<div class="success_icon">
				<%-- <img src="<c:url value="/resources/images/100.png"/>" class="img-responsive" style="width: 100%" alt="success"> --%>
				 <!-- <img src="/resources/images/successicon2.jpg" alt="success"> --> 
			</div>	
			<div class="success_content">
				<div class="content_top">
						<h2><p>You have successfully logged out of <b>Awesome Watches</b></p></h2>
						<h2><p>Thank you for using <b>Awesome Watches</b></p></h2>
				</div>
				<!-- <div class="content_bottom">
						<p><a href="Login">Click here</a> to logon to Awesome Watches</p> 
				</div> -->
			</div>
		</div>
		
</div>
<% response.setHeader("Refresh", "2;url=index"); %>
</center>
</body>
</html>