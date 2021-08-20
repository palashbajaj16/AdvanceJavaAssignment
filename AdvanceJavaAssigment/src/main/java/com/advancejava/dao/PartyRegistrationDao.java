package com.advancejava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.advancejava.model.*;
import com.advancejava.service.GetConnection;

public class PartyRegistrationDao {

	public static boolean saveParty(Registration reg) {
		Connection con;
	    boolean status = false;	    
	    con = GetConnection.getConnection();
	    try 
	    {	    	
		    String sql = "insert into reg_tbl(fname, lname, address, city, state, country, zip, phone, userloginid, password)values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
	        if(ps.executeUpdate()!=0)
	        {
	        	status = true;
	        	ps.close();
	        }		           
		} 
	    catch (SQLException e) 
	    {
			e.printStackTrace();
		}
	    
	    //if the connection is not open close function shows exception
	    
	    finally 
	    {
	    	try 
	    	{
				con.close();
			} 
	    	catch (SQLException e) 
	    	{
				e.printStackTrace();
			}
		}
		return status;
	}		
}
	
