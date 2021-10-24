package com.advancejava.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.advancejava.service.GetConnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = (Connection) GetConnection.getConnection();
		try 
		{
			int prm =  Integer.parseInt(request.getParameter("prm"));			
			Statement st = (Statement) con.createStatement();
			String sql = "delete from reg_tbl where partyId='"+prm+"'";			    
		    st.executeUpdate(sql);
		    con.close();
		    RequestDispatcher requestDispatcher = request.getRequestDispatcher("display");
			requestDispatcher.forward(request, response);
		} 
		catch (SQLException e) 
		{
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
	    
	}
}
