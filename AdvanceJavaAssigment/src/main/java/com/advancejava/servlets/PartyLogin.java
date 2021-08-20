package com.advancejava.servlets;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.advancejava.dao.PartyLoginDao;
import com.advancejava.service.GetConnection;
import com.mysql.jdbc.Connection;


@WebServlet("/PartyLogin")
public class PartyLogin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailAddress = request.getParameter("emailAddress");
		String password = request.getParameter("password");
		
		Boolean res = PartyLoginDao.Check(emailAddress, password);
		if (res) {
			HttpSession session = request.getSession();  
			session.setAttribute("uid",emailAddress);  
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("display");
			requestDispatcher.forward(request, response);
		}
		else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login");
			requestDispatcher.forward(request, response);
		}
	}		
}
