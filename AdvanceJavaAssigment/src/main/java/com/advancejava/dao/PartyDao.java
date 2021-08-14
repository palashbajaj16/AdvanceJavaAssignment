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
		    String sql = "insert into party_tbl(id, firstName, lastName, address, city, zip, state, country, phone)values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		    PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(2, party.getFirstName());
	        ps.setString(3, party.getLastName());
	        ps.setString(4, party.getAddress());
	        ps.setString(5, party.getCity());
	        ps.setString(6, party.getZip());
	        ps.setString(7, party.getState());
	        ps.setString(8, party.getCountry());
	        ps.setString(9, party.getPhone());
	        if(ps.executeUpdate()!=0)
	           status = true;
	        System.out.println(ps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
}
