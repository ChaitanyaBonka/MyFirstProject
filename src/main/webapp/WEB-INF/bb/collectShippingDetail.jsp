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
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
   
    
    <ul class="nav navbar-nav navbar-right">
      <li><a href="${pageContext.request.contextPath}/logoutsuccess"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
  </div>
</nav>
<center><h2>Customer Details</h2></center>
   <form:form modelAttribute="register" class="form-horizontal">
   <h3>Shipping Address</h3>
       
       <table class="table table-bordered" >
           <center>
		   <tr><td><form:label path="streetName">StreetName:</form:label></td>
               <td><form:input path="streetName" value="${register.streetName}"/></td>
            </tr>             
           <tr><td><form:label path="apartmentNumber">ApartmentNumber:</form:label></td>
               <td><form:input path="apartmentNumber" value="${register.apartmentNumber}"/></td>
           </tr>
           <tr><td><form:label path="city">City :</form:label></td>
               <td><form:input path="city" value="${register.city}"/></td>
           </tr>   
           
           <tr><td><form:label path="state">State:</form:label></td>
               <td><form:input path="state" value="${register.state}"/></td>
            </tr>             
           <tr><td><form:label path="country">Country:</form:label></td>
               <td><form:input path="country" value="${register.country}"/></td>
           </tr>
           <tr><td><form:label path="zipCode">ZipCode :</form:label></td>
               <td><form:input path="zipCode" value="${register.zipCode}"/></td>
           </tr>  
         <br><br>
         
        <button class="btn btn-default" name="_eventId_backToCollectCustomerInfo">Back</button>
        <input type="submit" value="Next" class="btn btn-default" name="_eventId_shippingDetailCollected" />
        <button class="btn btn-default" name="_eventId_cancel">Cancel</button>
        </center>
        </table>
        </form:form>

</body>
</html>
        
