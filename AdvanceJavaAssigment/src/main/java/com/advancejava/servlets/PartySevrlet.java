package com.advancejava.servlets;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.advancejava.dao.LoginDao;
import com.advancejava.dao.PartyDao;
import com.advancejava.model.Login;
import com.advancejava.model.Party;
import com.advancejava.service.GetConnection;
import com.mysql.jdbc.Connection;

@WebServlet("/PartySevrlet")
public class PartySevrlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String zip = request.getParameter("zip");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String phone = request.getParameter("phone");
		Party party = new Party(firstName, lastName, address, city, zip, state, country, phone);
		PartyDao.saveParty(party);
		Connection con; 
	    try {
	    	con = (Connection) GetConnection.getConnection();
		    String sql = "select * from reg_tbl where phone=?";	
		    PreparedStatement ps = con.prepareStatement(sql);
		    ResultSet rs = ps.executeQuery();
		    int id = Integer.parseInt(rs.getString(1)); 
		    System.out.println(id);
		    String email = request.getParameter("emailAddress");
			String password = request.getParameter("password");
			Login login = new Login(email, password,id);
			LoginDao.saveLogin(login);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    response.sendRedirect("registration_success");		
	}
}
