package com.advancejava.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.advancejava.dao.EditDao;
import com.advancejava.model.Registration;

@WebServlet("/Edit")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int partyID = Integer.parseInt(request.getParameter("prm"));
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
		reg.setPartyID(partyID);
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
		
		boolean res;
		try {
			res = EditDao.updateParty(reg);
			if (res) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("display");
				requestDispatcher.forward(request, response);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
