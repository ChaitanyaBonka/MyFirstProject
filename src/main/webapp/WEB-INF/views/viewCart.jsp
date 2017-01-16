<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">




<head>

<link rel="stylesheet"
	href='<x:url value="/resources/css/bootstrap.min.css"></x:url>' />

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>

<body>

	<nav class="navbar navbar-default">

		<div class="container-fluid">

			<div class="navbar-header">
				<sec:authorize access="hasRole('ROLE_USER')">
					<a class="navbar-brand" href="EndUser">AWESOME WATCHES</a>
					<a class="navbar-brand" href="EndUser">Home</a>
				</sec:authorize>
			</div>

			<ul class="nav navbar-nav">

				<!-- <li><a href="#">Contact us</a></li> -->

				<sec:authorize var="loggedIn" access="isAuthenticated()" />

				<sec:authorize access="permitAll">

					<li><a href="${pageContext.request.contextPath}/logout"><span>Logout</span></a></li>

				</sec:authorize>

			</ul>

		</div>

	</nav>

	<div class="container">

		<h1>Cart Items</h1>

		<div ng-app="myApp" ng-controller="customersCtrl">



			<input type="text" class="form-control" placeholder="Search"
				ng-model="searchBy.Name" /> <br /> <a href="checkOut"
				class="btn btn-success pull-right"><span
				class="glyphicon glyphicon-shopping-cart"></span> Check out</a>



			<table class="table table-hover table-bordered">

				<tr>
					<th>Watch ID</th>

					<th>Watch Name</th>

					<th>QTY</th>

					<th>Watch Price</th>



				</tr>

				<tr ng-repeat="x in names | filter:searchBy">

					<td>{{x.Id}}</td>
					
					<td>{{x.Name}}</td>

					<td>{{x.quantity}}</td>

					<td>{{x.Price | currency}}</td>


					<td><a href="deleteItemCart?id={{x.cartItemId}}"
						class="label label-danger"
						ng-click="removeFromCart(item.product.Id)"> <span
							class="glyphicon glyphicon-remove"></span>remove
					</a>
					</td>

				</tr>

				<tr>

					<th></th>

					<th></th>

					<th>Grand Total : {{calGrandTotal() | currency}}</th>


				</tr>

			</table>

			<a href="${pageContext.servletContext.contextPath}/EndUser"
				class="btn btn-success pull-right">Continue Shopping</a> <a
				href="${pageContext.servletContext.contextPath}/removeAll"
				class="btn btn-danger pull-left" ng-click="clearCart()"><span
				class="glyphicon glyphicon-remove-sign"></span> Clear Cart</a>


		</div>


		<script>
			var app = angular.module('myApp', []);
			app.controller('customersCtrl', function($scope, $http) {

				$http.get("listone").then(function(response) {
					$scope.names = response.data;
				});

				$scope.calGrandTotal = function() {

					var grandTotal = 0;

					for (var i = 0; i < $scope.names.length; i++)

					{
						grandTotal += $scope.names[i].Price;
					}

					return grandTotal;
				};
			});
		</script>

	</div>

</body>

</html>



