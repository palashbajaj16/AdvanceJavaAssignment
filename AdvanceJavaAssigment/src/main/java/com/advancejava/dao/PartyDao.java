package com.advancejava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.advancejava.model.Party;
import com.advancejava.service.GetConnection;

public class PartyDao {
	public static boolean saveParty(Party party)
	{
		Connection con;
	    boolean status = false;	    
	    try {
	    	con = GetConnection.getConnection();
		    String sql = "insert into party_tbl(firstName, lastName, address, city, zip, state, country, phone)values(?, ?, ?, ?, ?, ?, ?, ?)";
		    PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, party.getFirstName());
	        ps.setString(2, party.getLastName());
	        ps.setString(3, party.getAddress());
	        ps.setString(4, party.getCity());
	        ps.setString(5, party.getZip());
	        ps.setString(6, party.getState());
	        ps.setString(7, party.getCountry());
	        ps.setString(8, party.getPhone());
	        if(ps.executeUpdate()!=0)
	        {
	        	status = true;
	        	con.close();
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
}
