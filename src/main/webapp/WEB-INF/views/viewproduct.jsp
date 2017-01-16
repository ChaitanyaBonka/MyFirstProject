<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
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
      <!-- <a class="navbar-brand" href="index">AWESOME WATCHES</a> -->
      <sec:authorize access="hasRole('ROLE_USER')">
      		<a class="navbar-brand" href="EndUser">AWESOME WATCHES</a>
      </sec:authorize>
      <sec:authorize access="hasRole('ROLE_ADMIN')">
      		<a class="navbar-brand" href="Admin">AWESOME WATCHES</a>
      </sec:authorize>
    </div>
    <ul class="nav navbar-nav">
    <sec:authorize access="hasRole('ROLE_ADMIN')">
      <li class="active"><a href="ManageProducts">Manage Products</a></li>
      <li><a href="ManageSuppliers">Manage Suppliers</a></li>
      <li><a href="#">Manage Users</a></li>
    </sec:authorize>
    </ul>
    <ul class="nav navbar-nav navbar-right">
    <!-- <li><a href="register"><span
					class="glyphicon glyphicon-user"></span> Sign Up</a></li>
			<li><a href="Login"><span class="glyphicon glyphicon-log-in"></span>
					Login</a></li> -->
    <sec:authorize access="hasRole('ROLE_ADMIN')">
      <li><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </sec:authorize>
    <sec:authorize access="hasRole('ROLE_USER')">
      <li><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </sec:authorize>
    </ul>
  </div>
</nav>
<h2>Product Details</h2>
      <div class="container">
            <table class="table table-hover table-bordered">
            <tr><td rowspan="5">
            <img src='<x:url value="/resources/images/${product.image}"/>'/></td></tr>
            <tr><td>${product.id}</td></tr>
            <tr><td>${product.name}</td></tr>
            <tr><td>${product.price}</td></tr>
            <tr><td>${product.description}</td></tr>
            <tr><td><a href="viewCart?id=${product.id}" class="btn btn-primary">Add To Cart</a>
            </table>
      </div>
      	<footer class="container-fluid text-center">
		<p>©Audemars Piguet-All Rights Reserved</p>
		<P>2016</P>
	</footer>
      
   </body>
</html>
