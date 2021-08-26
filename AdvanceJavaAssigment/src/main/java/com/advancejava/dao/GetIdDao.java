package com.advancejava.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.advancejava.service.GetConnection;

public class GetIdDao {
  public static int getUserID() throws SQLException
	{
	  	int max = 0;
		Connection con;
		con = GetConnection.getConnection();
	  	try {
	  		
			String sql = "select max(partyId) from party_tbl";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
			   max = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	  	
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
		return max+1;
	}
}
