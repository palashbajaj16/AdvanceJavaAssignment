<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<link rel="stylesheet" href="css/root.css">
</head>
<body>
	<div class="container-fluid top-bar">  
	<div class="mnu">
	 <a href="login">logIn</a>
	 <a href="registration">SignUp</a>
	 <a href="index.html">Home</a>
	</div>       
    </div>   
    <%
    String val =(String)session.getAttribute("uid"); 
    if(val!=null)
    {
    	RequestDispatcher rd = request.getRequestDispatcher("display");
		rd.forward(request, response);
    }
    %>
    <div class="container">
            <div class="col-lg-9 mx-auto">
                <div class="block-div mt-3 mx-auto">
                <h5 class="text-center">Task 3 </h5>
                <form action="PartyRegistration" method="post">
                <div class="row">
                 <div class="col-lg-4">
                	<input type="text" class="form-control" id="signup_fname" name="firstName" placeholder="Enter Your First Name" required="required"><br>
                	<small id="fname_valid"></small>
                	<input type="text" class="form-control" id="signup_lname" name="lastName" placeholder="Enter Your Last Name" required="required"><br>
                	<small id="lname_valid"></small>
                	<input type="text" class="form-control" id="" name="address" placeholder="Enter Your Address" required="required"><br>
                	<input type="text" class="form-control" id="" name="city" placeholder="Enter Your City" required="required"><br>
                	<input type="text" class="form-control" id="" name="zip" placeholder="Enter Your Zip"><br> 
                </div>
                <div class="col-lg-4">
                	<input type="text" class="form-control" id="" name="state" placeholder="Enter Your State" required="required"><br>
                	<input type="text" class="form-control" id="" name="country" placeholder="Enter Your Country" required="required"><br>
                	<input type="text" class="form-control" id="" name="phone" placeholder="Enter Your Phone" required="required"><br>
                	<input type="email" class="form-control" id="" name="emailAddress" placeholder="Enter Your EmailID" required="required"><br> 
                	<input type="password" class="form-control" id="" name="password" placeholder="Enter Your Password" required="required"><br>  
                	             	
                </div>
                <div class="col-lg-4">
                	<img src="images/registration.png" alt="img" width="100%">
                </div>                	
                </div>                	
                <div class="col-lg-6 mx-auto">
                	<input type="submit" class="form-control" value="click"><br>
                </div>
                  </form>                   
                </div>
            </div>
        </div>   
<script type="text/javascript" src="js/mystyle.js"></script>   
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>  
</body>
</html>