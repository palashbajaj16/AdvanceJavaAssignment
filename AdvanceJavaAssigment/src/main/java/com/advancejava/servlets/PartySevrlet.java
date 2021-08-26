package com.advancejava.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.advancejava.dao.GetIdDao;
import com.advancejava.dao.LoginDao;
import com.advancejava.dao.PartyDao;
import com.advancejava.model.Login;
import com.advancejava.model.Party;

@WebServlet("/PartySevrlet")
public class PartySevrlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		int id = GetIdDao.getUserID();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String zip = request.getParameter("zip");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String phone = request.getParameter("phone");
				
		Party party = new Party();
		party.setPartyId(id);
		party.setFirstName(firstName);
		party.setLastName(lastName);
		party.setAddress(address);
		party.setCity(city);
		party.setZip(zip);
		party.setState(state);
		party.setCountry(country);
		party.setPhone(phone);
		PartyDao.saveParty(party);
		
		String email = request.getParameter("emailAddress");
		String password = request.getParameter("password");			
		Login login = new Login();
		login.setUserEmail(email);
		login.setPassword(password);
		login.setParty_id(id);
		LoginDao.saveLogin(login);			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    RequestDispatcher requestDispatcher = request.getRequestDispatcher("registration_success");
		requestDispatcher.forward(request, response);		
	}
}
