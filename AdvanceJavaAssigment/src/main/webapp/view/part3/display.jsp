<%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page errorPage="error.jsp" %>
<%@ page import="com.advancejava.service.*" %> 
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
            <div class="col-lg-10 mx-auto">
                <div class="block-div mt-3">
                <h5 class="text-center">Task 3.a) Display Page</h5>  
                </div>                                           
                <table class="table table-dark table-hover mt-2">
                <tbody>
	            <tr>
				<td>Id</td>
	            <td>FirstName</td>
	            <td>LastName</td>
	            <td>Address</td>
	            <td>City</td>
	            <td>State</td>
	            <td>Country</td>
	            <td>Zip</td>
	            <td>Phone</td>
	            <td>UserLoginID</td>
	            <td>Password</td>
				</tr>                                  
		
	   <%try
		{
			Connection con = GetConnection.getConnection();
			Statement st = con.createStatement();
		    String sql = "select * from reg_tbl";			    
		    ResultSet rs = st.executeQuery(sql);
		    while(rs.next())
		    {%>
			<tr>			
			<td><%= rs.getString(1) %></td>
            <td><%= rs.getString(2) %></td>
            <td><%= rs.getString(3) %></td>
            <td><%= rs.getString(4) %></td>
            <td><%= rs.getString(5) %></td>
            <td><%= rs.getString(6) %></td>
            <td><%= rs.getString(7) %></td>
            <td><%= rs.getString(8) %></td>
            <td><%= rs.getString(9) %></td>
            <td><%= rs.getString(10) %></td>
            <td><%= rs.getString(11) %></td>
            <td>
            	<a href="edit?prm=<%= rs.getString(1) %>" class="btn btn-warning">Edit</a>
            </td>
            <td>
            	<a href="Delete?prm=<%= rs.getString(1) %>" class="btn btn-danger">Delete</a>
            </td>
            </tr>        
		 	<%
		 	}
		    rs.close();
		    con.close();
		 }
	     
			catch (Exception e) 
		{
			e.printStackTrace();
		}
		 %>
		 </tbody>
		 </table>  
         </div>	
           	
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>