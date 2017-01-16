<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

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
<title>Welcome Admin</title>
</head>
<head>
<style>
 <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="Admin">AWESOME WATCHES</a>
      <a class="navbar-brand" href="Admin">Admin Home</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="ManageProducts">Manage Products</a></li>
      <li><a href="ManageSuppliers">Manage Suppliers</a></li>
      <li><a href="#">Manage Users</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
    
      <li class="active"><a href="Admin">Welcome...<%=session.getAttribute("loggedInUser")%></a></li>
      <li><a href="${pageContext.request.contextPath}/logoutsuccess"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
  </div>
</nav>
 	</head>
<head>
<style>
 <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 100%;
      margin: auto;
  }
  </style>
</style>
</head>
<body>
</nav>
	<div class="container"></div>
		<br>
	
	<div class="container-fluid bg-3 text-center">
		<h3>Awesome Watches All Products</h3>
		<br>
		<div class="row">
			<div class="col-sm-3">
				<img src="<c:url value="/resources/images/4.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>Audemars Piguet Model-4</p>
			</div>
			<div class="col-sm-3">
				<img src="<c:url value="/resources/images/5.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>Audemars Piguet Model-5</p>
			</div>

			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/6.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>Audemars Piguet Model-6</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/7.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>Audemars Piguet Model-7</p>
			</div>
			<br>
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/26.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Offshore Tourbillon Chronograph Rose Gold Men's Watch</p>
			</div>
			
			<div class="col-sm-3">			
				<img src="<c:url value="/resources/images/25.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Offshore Slate Dial Automatic Men's Watch</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/24.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Offshore Silver Dial Men's Watch</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/23.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Offshore Jarno Trulli Watch 26202AU.OO.D002CA.01</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/22.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Offshore Grande Complication Rose Gold Men's Watch</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/21.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Offshore Diver Black Dial Black Rubber Men's Watch</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/20.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Offshore Chronograph Blue Dial Leather Men's Watch</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/19.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Offshore Carbon Diver Men's Watch</p>
			</div>
			
			<div class="col-sm-3">
				
				<img src="<c:url value="/resources/images/18.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Offshore Bumble Bee Chronograph Men's Watch</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/17.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Offshore Blue Leather Strap Men's Watch</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/16.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Offshore Blue Dial Chronograph Men's Watch</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/15.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Offshore Blue Alligator Leather Men's Watch</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/14.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Offshore Black Dial Men's Watch</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/13.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Grey Dial Chronograph Men's Watch</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/12.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Royal Oak Grande Complication 40th Anniversary Men's Watch</p>
			</div>
			
			<div class="col-sm-3">				
				<img src="<c:url value="/resources/images/11.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
					<p>AUDEMARS PIGUET Audemars Royal Oak Offshore Black Dial Black Alligator Leather Men's</p>
			</div>			
			

		</div>
	</div>
	<br>
	<br>

	<footer class="container-fluid text-center">
	<p>©Audemars Piguet-All Rights Reserved</p>
	 <p> 2016</p>
	 <a href="https://www.facebook.com/audemarspiguet/?ref=br_rs" class="container-fluid text-right">Facebook</a> 
	 </footer>

</body>
</html>