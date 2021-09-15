package com.hsbc.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoggingOutServlet
 */
@WebServlet("/LoggingOutServlet")
public class LoggingOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("LoggingOutServlet: Id: "+session.getId());
		
		session.invalidate();
		request.getRequestDispatcher("index.html").forward(request, response);
	}

}
