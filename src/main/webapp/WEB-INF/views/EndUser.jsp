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
<title>Welcome to Awesome Watches</title>
</head>
<body>
<head>
<style>
 <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
</style>
</head>
<body>
<center>
<h1>Welcome to Awesome Watches</h1>
</center>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="EndUser">AWESOME WATCHES</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="EndUser">Home</a></li>
      <li><a href="viewproducts">View All Products</a></li>
      <li><a href="showproducts">Show Products</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <!-- <li><a href="viewCart">View Cart</a></li> -->
      <li><a href="EndUser">Welcome... <%=session.getAttribute("loggedInUser")%></a></li>
      <li><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
  </div>
</nav>
	<div class="container"></div>
	<br>
	<center>
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->

			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>
			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">

				<div class="item active">

					<img src="<c:url value="/resources/images/1.jpg"/>"
						alt="Audemars Piguet Model-1" width="800px" height="450px">
					<div class="carousel-caption">
						<p>Audemars Piguet Model-1</p>
					</div>
				</div>

				<div class="item">
					<img src="<c:url value="/resources/images/2.jpg"/>"
						alt="Audemars Piguet Model-2" width="800px" height="450px">
					<div class="carousel-caption">
						<p>Audemars Piguet Model-2</p>
					</div>
				</div>

				<div class="item">
					<img src="<c:url value="/resources/images/3.jpg"/>"
						alt="Audemars Piguet Model-3" width="800px" height="450px">
					<div class="carousel-caption">
						<p>Audemars Piguet Model-3</p>
					</div>
				</div>
				<!-- Left and right controls -->
				<a class="left carousel-control" href="#myCarousel" role="button"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#myCarousel" role="button"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
		</div>
	</center>
	<div class="container-fluid bg-3 text-center">
		<h3>Other Watches</h3>
		<br>
		<div class="row">
			<div class="col-sm-3">
				<p>Audemars Piguet Model-4</p>
				<img src="<c:url value="/resources/images/4.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
			</div>
			<div class="col-sm-3">
				<p>Audemars Piguet Model-5</p>
				<img src="<c:url value="/resources/images/5.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
			</div>

			<div class="col-sm-3">
				<p>Audemars Piguet Model-6</p>
				<img src="<c:url value="/resources/images/6.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
			</div>
			
			<div class="col-sm-3">
				<p>Audemars Piguet Model-7</p>
				<img src="<c:url value="/resources/images/7.jpg"/>"
					class="img-responsive" style="width: 100%" alt="Image">
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