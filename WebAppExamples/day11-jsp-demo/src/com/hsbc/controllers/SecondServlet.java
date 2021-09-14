package com.hsbc.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.beans.Employee;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// assuming the data is going to the service and then to the dao
		Employee employee1 = new Employee(Integer.parseInt(request.getParameter("t1")), request.getParameter("t2"), 
				Double.parseDouble(request.getParameter("t3")));
		Employee employee2 = new Employee(88, "Ajay", 23520.0);
		
		//1st way is storing employee1 & employee2 in a separate key
		
		request.setAttribute("e1", employee1); // ${e1.id} ${e1.name} ${e1.salary}
		request.setAttribute("e2", employee2); // ${e1.id} ${e1.name} ${e1.salary}
		
		
		//2nd way is storing multiple employees in a collection & storing collection in a single key
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		request.setAttribute("emps", employees);
		request.setAttribute("x", "Hello World");
		
		// storing the data in a session scope
		HttpSession session = request.getSession(); 
		session.setAttribute("emps", employees);
		session.setAttribute("x", "Welcome World");
		
		// storing the data in a context scope
		ServletContext ctx = getServletContext();
		ctx.setAttribute("x", "Thank you");
		
		request.getRequestDispatcher("third.jsp").forward(request, response);
		
	}

}
