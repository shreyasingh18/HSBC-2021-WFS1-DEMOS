package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("t1"); // <input type = "text" name = "t1">
		pw.print("<html><body>");
		pw.print("<h2>doGet() of FirstServlet</h2>");
		pw.print("<h3>Welcome: "+name+"</h3>");
		pw.print("</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("t2"); // <input type = "...." name = "t1">
		pw.print("<html><body>");
		pw.print("<h2>doPost() of FirstServlet</h2>");
		pw.print("<h3>Welcome: "+name+"</h3>");
		pw.print("</body></html>");
	}

}
