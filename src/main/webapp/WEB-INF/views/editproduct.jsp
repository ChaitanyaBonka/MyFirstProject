<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta Name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="Admin">AWESOME WATCHES</a>
      <a class="navbar-brand" href="Admin">Admin Home</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="ManageProducts">Manage Products</a></li>
      <li><a href="ManageSuppliers">Manage Suppliers</a></li>
      <li><a href="#">Manage Users</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
  </div>
</nav>
<h2>Edit Product</h2>
  <form:form  modelAttribute="Product" method="post" action="update" enctype="multipart/form-data">
   <table class="table table-bordered" >
      <tr><td><form:label path="Name">Product Name :</form:label></td>
               <td><form:input path="Name" value="${product.name}"/></td>
           </tr>
               <tr><td><form:label path="Price">Product Price :</form:label></td>
               <td><form:input path="Price" value="${product.price}"/></td>
           </tr>
           <tr><td><form:label path="Description">Description :</form:label></td>
               <td><form:input path="Description" value="${product.description}"/></td>
           </tr>
                <tr><td><form:label path="primarymaterial">Primary Material :</form:label></td>
               <td><form:input path="primarymaterial" value="${product.primarymaterial}"/></td>
           </tr>
              <tr><td><form:label path="style">Style :</form:label></td>
               <td><form:input path="style" value="${product.style}"/></td>
           </tr>
              <tr><td><form:label path="warranty">Warranty :</form:label></td>
               <td><form:input path="warranty" value="${product.warranty}"/></td>
           </tr>
              <tr><td><form:label path="capacity">Capacity :</form:label></td>
               <td><form:input path="capacity" value="${product.capacity}"/></td>
           </tr>
           <tr><td><form:label path="img">Product Image :</form:label></td>
               <td><form:input path="img" type="file" />
               <font color="red"><form:errors path="img"></form:errors></font></td><tr>
               <tr><td></td>
               <td><input type="submit" value="submit" class="btn-success"/></td>
           </tr>
           </table>
                      
  </form:form>   
  	<footer class="container-fluid text-center">
		<p>©Audemars Piguet-All Rights Reserved</p>
		<P>2016</P>
	</footer>
  
</body>
</html>
