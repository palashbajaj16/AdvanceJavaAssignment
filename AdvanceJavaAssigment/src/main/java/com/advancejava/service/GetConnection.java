package com.advancejava.service;

import java.sql.*;

public class GetConnection {
  static Connection con = null;
  public static Connection getConnection()
  {
    try
    {
    	Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/election","root","root");
        if(con==null)
		{
			System.out.println("Connection failed");
		}
		else
		{
			System.out.println("Connection successful");
		}
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    System.out.println(con);
    return con;
  }
}
