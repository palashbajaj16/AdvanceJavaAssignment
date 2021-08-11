package com.advancejava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.advancejava.model.Login;
import com.advancejava.service.GetConnection;

public class LoginDao {
	public static boolean saveLogin(Login login) {
		Connection con;
	    boolean status = false;	    
	    try {
	    	con = GetConnection.getConnection();
		    String sql = "insert into userlogin_tbl(user_id, user_pass, id)values(?, ?, ?)";
		    PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1,login.getUserEmail());
	        ps.setString(2,login.getPassword());
	        ps.setInt(3,login.getPartyId());
	        if(ps.executeUpdate()!=0)
	           status = true;
	        System.out.println(ps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
		
	}
}
