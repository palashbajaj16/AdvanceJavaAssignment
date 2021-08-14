package com.advancejava.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.advancejava.service.GetConnection;
import com.mysql.jdbc.Connection;

public class PartyLoginDao {
	public static boolean Check(String email, String pass)
	{
		Connection con;
	    boolean status = false;	    
	    try {
	    	System.out.println();
	    	con = (Connection) GetConnection.getConnection();
		    String sql = "select userloginid,password from reg_tbl where userloginid=? and password=?";	
		    PreparedStatement ps = con.prepareStatement(sql);
		    ps.setString(1, email);
		    ps.setString(2, pass);
		    ResultSet rs = ps.executeQuery();
		    status = rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	}
