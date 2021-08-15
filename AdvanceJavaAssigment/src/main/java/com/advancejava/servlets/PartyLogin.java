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

import com.advancejava.dao.PartyLoginDao;
import com.advancejava.service.GetConnection;
import com.mysql.jdbc.Connection;


@WebServlet("/PartyLogin")
public class PartyLogin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailAddress = request.getParameter("emailAddress");
		String password = request.getParameter("password");
		
		Boolean q = PartyLoginDao.Check(emailAddress, password);
		if (q) {
			response.sendRedirect("display.jsp");
		}
		else {
			response.sendRedirect("login.html");
		}
	}		
}
