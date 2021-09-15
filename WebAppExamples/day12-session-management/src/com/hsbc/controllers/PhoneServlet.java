package com.hsbc.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PhoneServlet
 */
@WebServlet("/PhoneServlet")
public class PhoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phone = request.getParameter("t2");
//		request.setAttribute("key2", phone);
		HttpSession session = request.getSession();
		session.setAttribute("key2", phone);
		System.out.println("PhoneServlet: Id: "+session.getId());
		request.getRequestDispatcher("display.jsp").forward(request, response);
	}

}
