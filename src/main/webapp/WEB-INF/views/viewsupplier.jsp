<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Product Details</title>
</head>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="Admin">AWESOME WATCHES</a>
      			<a class="navbar-brand" href="Admin">Admin Home</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="ManageProducts">Manage Products</a></li>
				<li class="active"><a href="ManageSuppliers">Manage Suppliers</a></li>
				<li><a href="#">Manage Users</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="${pageContext.request.contextPath}/Logout"><span>Logout</span></a></li>
			</ul>
		</div>
	</nav>
<h2>Supplier Details</h2>
      <div class="container">
            <table class="table table-bordered">
            <thead>
				<tr>
					<th>Id</th>
					<th>Supplier Id</th>
					<th>Supplier Name</th>
					<th>Supplier Location</th>
					<th>Category Id</th>
					<th>Category Name</th>
					<th>Product Id</th>
					<th>Product Name</th>										
				</tr>
			</thead>
            <tr>
            <td>${supplier.id}</td>
            <td>${supplier.supid}</td>
            <td>${supplier.supname}</td>
            <td>${supplier.suplocation}</td>
            <td>${supplier.categoryid}</td>
            <td>${supplier.categoryname}</td>
            <td>${supplier.productid}</td>        
            <td>${supplier.productname}</td>
            </tr>
            </table>
      </div>
   </body>
</html>
