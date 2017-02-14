<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">


<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link xmlns:sec="http://www.springframework.org/security/tags">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Show All Products</title>

</head>
  

<body>
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
      <!-- <li><a href="index">Home</a></li> -->
      <sec:authorize access="hasRole('ROLE_ADMIN')">
      		<li><a href="Admin">Admin Home</a></li>
      </sec:authorize>
      <sec:authorize access="hasRole('ROLE_USER')">
      		<li><a href="EndUser">Home</a></li>
      </sec:authorize>
      <li><a href="viewproducts">View All Products</a></li>
      <sec:authorize access="hasRole('ROLE_ADMIN')">
      	<li><a href="ManageProducts">Manage Products</a></li>
      </sec:authorize>
    </ul>
    <ul class="nav navbar-nav navbar-right">
          <!-- <li><a href="register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      	  <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li> -->
      	  <sec:authorize access="hasRole('ROLE_ADMIN')">
      	  	<li><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      	  </sec:authorize>
      	  <sec:authorize access="hasRole('ROLE_USER')">
      	  	<li><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      	  </sec:authorize>
    </ul>
  </div>
  </nav>
<div class="container">
<div ng-app="myApp" ng-controller="customersCtrl">
<input type="text" class="form-control" placeholder="search" ng-model="searchBy.Name"/>
    <!-- <button type="button" class="btn btn-info">
      <span class="glyphicon glyphicon-search"></span> Search
    </button> -->
<table class="table table-hover table-bordered">
  <tr>
       <th>Product Id</th>
       <th>Product Name</th>
       <th>Product Price</th>
       <th>Product Description</th>
       <th>Action</th>
  </tr>
  <tr ng-repeat="x in names | filter:searchBy">
    <td>{{x.Id}}</td>
    <td>{{x.Name}}</td>
    <td>{{x.Price}}</td>
    <td>{{x.Description}}</td>
    <td>
    <a href="${pageContext.servletContext.contextPath}/viewproduct?id={{x.Id}}" class="btn btn-info"class="btn btn-info"><span>View</span></a>
   </td>  
  </tr>
</table>
<script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
    $http.get("list")
    .then(function (response) {$scope.names = response.data;});
});
</script>
</div>
</div>
	<footer class="container-fluid text-center">
		<p>©Audemars Piguet-All Rights Reserved</p>
		<P>2016</P>
	</footer>

</body>
</html>