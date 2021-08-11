package com.advancejava.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.advancejava.dao.LoginDao;
import com.advancejava.dao.PartyDao;
import com.advancejava.model.Login;
import com.advancejava.model.Party;

@WebServlet("/PartySevrlet")
public class PartySevrlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int partyId = Integer.parseInt(request.getParameter("partyId"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String zip = request.getParameter("zip");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String phone = request.getParameter("phone");
		Party party = new Party(partyId, firstName, lastName, address, city, zip, state, country, phone);
		PartyDao.saveParty(party);
		String email = request.getParameter("emailAddress");
		String password = request.getParameter("password1");
		Login login = new Login(email, password, partyId);
		LoginDao.saveLogin(login);
		System.out.println("successfull");
	}

}
