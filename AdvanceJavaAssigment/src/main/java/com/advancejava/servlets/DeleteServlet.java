package com.advancejava.servlets;

import java.io.IOException;
import java.sql.SQLException;

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
		try {
			int prm =  Integer.parseInt(request.getParameter("prm"));
			Connection con = (Connection) GetConnection.getConnection();
			Statement st = (Statement) con.createStatement();
			String sql = "delete from reg_tbl where partyId='"+prm+"'";			    
		    st.executeUpdate(sql);
		    response.sendRedirect("display");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    
	}
}
