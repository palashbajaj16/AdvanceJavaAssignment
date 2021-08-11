package com.advancejava.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/genericservlet")
public class GenericServletDemo extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		System.out.println("Servic is call");	
		out.println("Hello World");
		
		   Connection con = null;
		  {
		    try
		    {
		      Class.forName("com.mysql.jdbc.Driver");
		      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/election","root","root");
		      System.out.println(con);
		    }
		    catch(Exception e)
		    {
		      e.printStackTrace();
		    }
		    
		  }
	}
}
