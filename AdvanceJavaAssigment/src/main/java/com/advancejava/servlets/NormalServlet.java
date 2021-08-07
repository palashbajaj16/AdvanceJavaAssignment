package com.advancejava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet; 
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/normalservlet")
public class NormalServlet implements Servlet {
	@Override
	public void destroy() {
		System.out.println("Destroy Method Call");		
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Init Method Call");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		System.out.println("Servic is call");
		out.println("Hello World");
	}
}
