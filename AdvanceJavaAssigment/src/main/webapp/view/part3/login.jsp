<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<link rel="stylesheet" href="css/root.css">
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
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
                <div class="block-div mt-5 mx-auto">
                <h5 class="text-center">Task 3 </h5>
                <div class="row">
                 <div class="col-lg-8 mt-5">  
                 <form action="PartyLogin" method="post">   
                	<input type="email" class="form-control" name="emailAddress" placeholder="Enter Your EmailID" required="required"><br> 
                	<input type="password" class="form-control" name="password" id="login_password" placeholder="Enter Your Password" required="required"><br>
                	<small id="demo" class="abc"></small>
                	<input type="submit" id="demo" class="form-control" value="click"><br>
                </form> 
                </div>                   	             	
                <div class="col-lg-4">
                	<img src="images/icon-login-8.jpg" alt="img" width="100%">
                </div>
                </div>     	
                                                 
                </div>
            </div>
        </div>    
<script type="text/javascript" src="js/mystyle.js"></script>  
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>  
</body>
</html>
</body>
</html>