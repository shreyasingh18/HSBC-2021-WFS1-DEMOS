package com.hsbc.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NameServlet
 */
@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("t1");
		//request.setAttribute("key1", name);
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(10);
		session.setAttribute("key1", name);
		System.out.println("NameServlet: Id: "+session.getId());
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
	}

}
