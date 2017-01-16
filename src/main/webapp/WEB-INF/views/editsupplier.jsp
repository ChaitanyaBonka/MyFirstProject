<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
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
<title>Edit Supplier</title>
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
      <li class="active"><a href="ManageSuppliers">Manage Suppliers</a></li>
      <li><a href="#">Manage Users</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
  </div>
</nav>
<h2>Edit Supplier</h2>
   <form:form commandName="Supplier" method="post" action="updatesupplier">
       <table class="table table-bordered" >

		   <tr><td><form:label path="id">Supplier Id:</form:label></td>
               <td><form:input path="id" value="${supplier.id}"/></td>
            </tr>             
           <tr><td><form:label path="supid">Supplier Id:</form:label></td>
               <td><form:input path="supid" value="${supplier.supid}"/></td>
           </tr>
           <tr><td><form:label path="supname">Supplier Name :</form:label></td>
               <td><form:input path="supname" value="${supplier.supname}"/></td>
           </tr>           
           <tr><td><form:label path="suplocation">Supplier Location:</form:label></td>
               <td><form:input path="suplocation" value="${supplier.suplocation}"/></td>
           </tr>
           <tr><td><form:label path="categoryid">Category Id :</form:label></td>
               <td><form:input path="categoryid" value="${supplier.categoryid}"/></td>
           </tr>           
           <tr><td><form:label path="categoryname">Category Name :</form:label></td>
               <td><form:input path="categoryname" value="${supplier.categoryname}"/> </td>
           </tr>           
           <tr><td><form:label path="productid">Product Id :</form:label></td>
               <td><form:input path="productid" value="${supplier.productid}"/> </td>
           </tr>           
           <tr><td><form:label path="productname">Product Name :</form:label></td>
               <td><form:input path="productname" value="${supplier.productname}"/></td>
           </tr>
             <td><input type="submit" value="Submit" class="btn-success"/></td>
       </table>
   </form:form> 
   </div>
   	<footer class="container-fluid text-center">
		<p>©Audemars Piguet-All Rights Reserved</p>
		<P>2016</P>
	</footer>
   
</body>
</html>