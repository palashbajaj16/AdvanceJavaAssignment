<%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.advancejava.service.*" %> 
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
	 <a href="LogoutServlet">LogOut</a>
	 <a href="search">Search</a>
	 <a href="display">Display</a>
	 <a href="index.html">Home</a>
	</div>       
    </div>
    <div class="container">
            <div class="col-lg-9 mx-auto">
                <div class="block-div mt-3 mx-auto">
                <h5 class="text-center">Task 3 Edit</h5>
	<%try
		{
			int prm =  Integer.parseInt(request.getParameter("prm"));
			Connection con = GetConnection.getConnection();
			Statement st = con.createStatement();
		    String sql = "select * from reg_tbl where partyId='"+prm+"'";			    
		    ResultSet rs = st.executeQuery(sql);
		    while(rs.next())
		    {%>	
		    <form action="Edit" method="post">		
		    <div class="row">
                 <div class="col-lg-6">
                 	<input type="text" hidden="true" name="prm" value="<%= rs.getString(1) %>">
                	<input type="text" class="form-control" id="signup_fname" value="<%= rs.getString(2) %>" name="firstName" placeholder="Enter Your First Name" required="required"><br>
                	<small id="fname_valid"></small>
                	<input type="text" class="form-control" id="signup_lname" value="<%= rs.getString(3) %>" name="lastName" placeholder="Enter Your Last Name" required="required"><br>
                	<small id="lname_valid"></small>
                	<input type="text" class="form-control" id="" value="<%= rs.getString(4) %>" name="address" placeholder="Enter Your Address" required="required"><br>
                	<input type="text" class="form-control" id="" value="<%= rs.getString(5) %>" name="city" placeholder="Enter Your City" required="required"><br>
                	<input type="text" class="form-control" id="" value="<%= rs.getString(6) %>" name="zip" placeholder="Enter Your Zip"><br> 
                </div>
                <div class="col-lg-6">
                	<input type="text" class="form-control" id="" value="<%= rs.getString(7) %>" name="state" placeholder="Enter Your State" required="required"><br>
                	<input type="text" class="form-control" id="" value="<%= rs.getString(8) %>" name="country" placeholder="Enter Your Country" required="required"><br>
                	<input type="text" class="form-control" id="" value="<%= rs.getString(9) %>" name="phone" placeholder="Enter Your Phone" required="required"><br>
                	<input type="email" class="form-control" id="" value="<%= rs.getString(10) %>" name="emailAddress" placeholder="Enter Your EmailID" required="required"><br> 
                	<input type="password" class="form-control" id="" value="<%= rs.getString(11) %>" name="password" placeholder="Enter Your Password" required="required"><br>                  	             	
                </div>               	
             </div>                	
             <div class="col-lg-6 mx-auto">
                	<input type="submit" class="form-control" value="click"><br>
             </div>
             </form>
		 	<%
		 	}
		 }
	catch (Exception e) 
		{
			e.printStackTrace();
		}
		 %>
</div>
            </div>
        </div>   
<script type="text/javascript" src="js/mystyle.js"></script>   
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script> 
</body>
</html>