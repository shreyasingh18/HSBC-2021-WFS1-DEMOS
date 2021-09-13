package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String username = request.getParameter("t1");
		String password = request.getParameter("t2");
		pw.print("<html><body>");
		pw.print("<h3>Welcome Servlet doGet is called</h3>");
		pw.print("<h4>Username: "+username+", Password: "+password+"</h4>");
		pw.print("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String username = request.getParameter("t1");
		String password = request.getParameter("t2");
		pw.print("<html><body>");
		pw.print("<h3>Welcome Servlet doPost is called</h3>");
		pw.print("<h4>Username: "+username+", Password: "+password+"</h4>");
		pw.print("</body></html>");
	}

}
