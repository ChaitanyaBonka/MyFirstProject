<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index">AWESOME WATCHES</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="index">Home</a></li>
      <li><a href="viewproducts">View All Products</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
			<div class="container">
				<form:form commandName="Register" method="post" action="storeUser">
					<div class="form-group">
						<label for="username">UserName:</label>
						<form:errors path="username" cssStyle="color: #ff0000" />
						<form:input path="username" id="username" class="form-Control" />
					</div>
										<div class="form-group">
						<label for="mailid">Email:</label>
						<form:errors path="mailid" cssStyle="color: #ff0000" />
						<form:input type="email" pattern="[^ @]*@[^ @]*" path="mailid" id="email" class="form-Control" />
					</div>
					<div class="form-group">
						<label for="phone">Mobile number:</label>
						<form:errors path="phone" cssStyle="color: #ff0000" />
						<form:input path="phone" id="phone" class="form-Control" />
					</div>
					<div class="form-group">
						<label for="address">Address:</label>
						<form:errors path="Address" cssStyle="color: #ff0000" />
						<form:input path="Address" id="Address" class="form-Control" />
					</div>
					<div class="form-group">
						<label for="password">Password:</label> 
						<form:errors path="password" cssStyle="color: #ff0000" />
						<form:input type="password" path="password" id="password"
							class="form-Control" />
					</div>
					<div class="form-group">
						<label for="confirmpassword">Confirm Password:</label>
						<form:errors path="confirmpassword" cssStyle="color: #ff0000" />
						<form:input type="password" path="confirmpassword" id="password"
							class="form-Control" />
					</div>
					
			<button type="submit" class="btn btn-default">Submit</button>
			</form:form>			
			</div>
	<footer class="container-fluid text-center">
		<p>©Audemars Piguet-All Rights Reserved</p>
		<P>2016</P>
	</footer>

		</body>
</html>