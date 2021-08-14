package com.advancejava.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.advancejava.dao.PartyRegistrationDao;
import com.advancejava.model.Login;
import com.advancejava.model.Party;
import com.advancejava.model.Registration;
import com.advancejava.service.GetConnection;

@WebServlet("/PartyRegistration")
public class PartyRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String zip = request.getParameter("zip");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String phone = request.getParameter("phone");
		String emailAddress = request.getParameter("emailAddress");
		String password = request.getParameter("password");
		
		Registration reg = new Registration();
		reg.setFirstName(firstName);
		reg.setLastName(lastName);
		reg.setAddress(address);
		reg.setCity(city);
		reg.setZip(zip);
		reg.setState(state);
		reg.setCountry(country);
		reg.setPhone(phone);
		reg.setUserEmail(emailAddress);
		reg.setPassword(password);
		
		PartyRegistrationDao.saveParty(reg);
		
		
	}

}
