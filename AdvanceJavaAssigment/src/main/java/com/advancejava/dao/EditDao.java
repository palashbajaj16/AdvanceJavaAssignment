package com.advancejava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.advancejava.model.Registration;
import com.advancejava.service.GetConnection;

public class EditDao {
	public static boolean updateParty(Registration reg) throws SQLException
	{
		Connection con;
	    boolean status = false;	    
	    try {
	    	con = GetConnection.getConnection();
		    String sql = "UPDATE reg_tbl SET fname = ?, lname = ?, address = ?, city = ?, state = ?, country = ?, zip = ?, phone = ?, userloginid = ?, password = ? WHERE partyId = ?";
		    PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, reg.getFirstName());
	        ps.setString(2, reg.getLastName());
	        ps.setString(3, reg.getAddress());
	        ps.setString(4, reg.getCity());
	        ps.setString(5, reg.getState());
	        ps.setString(6, reg.getCountry());
	        ps.setString(7, reg.getZip());
	        ps.setString(8, reg.getPhone());
	        ps.setString(9, reg.getUserEmail());
	        ps.setString(10, reg.getPassword());
	        ps.setInt(11, reg.getPartyID());
	        if(ps.executeUpdate()!=0)
	        {	           
	           status = true;
	           con.close();
	        }
	    }
	        catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
}
