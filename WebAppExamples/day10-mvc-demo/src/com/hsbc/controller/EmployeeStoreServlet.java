package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.factory.ObjectFactory;
import com.hsbc.model.beans.Employee;
import com.hsbc.model.business.EmployeeService;


@WebServlet("/EmployeeStoreServlet")
public class EmployeeStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String name = request.getParameter("t1");
//		LocalDate dob = LocalDate.parse(request.getParameter("t2"));  
		Employee employee = new Employee();
		//employee.setName(name);
		employee.setName(request.getParameter("t1"));
		//employee.setDob(dob);
		employee.setDob(LocalDate.parse(request.getParameter("t2")));
		// get service instance
		EmployeeService service = new ObjectFactory().getServiceInstance();
		Employee emp = service.store(employee);
		PrintWriter pw = response.getWriter();
		pw.print("<html><body>");
		pw.print("<h3>Hello "+emp.getName()+", your id is: "+emp.getId()+"</h3>");
		pw.print("</body></html>");
	}

}
