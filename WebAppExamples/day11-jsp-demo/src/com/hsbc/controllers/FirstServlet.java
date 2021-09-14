package com.hsbc.controllers;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// assume servlet connects to service & gets date & time
		LocalDateTime dateTime = LocalDateTime.now();
		String dateTimeString = dateTime.getYear()+"-"+dateTime.getMonthValue()+
				"-"+dateTime.getDayOfMonth()+" "+dateTime.getHour()+":"
				+dateTime.getMinute();
		request.setAttribute("abc", dateTimeString); // in JSP ${abc}
		RequestDispatcher rd = request.getRequestDispatcher("second.jsp");
		rd.forward(request, response);
	}

}
