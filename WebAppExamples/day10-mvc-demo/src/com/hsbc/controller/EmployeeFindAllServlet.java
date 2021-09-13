package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hsbc.factory.ObjectFactory;
import com.hsbc.model.beans.Employee;
import com.hsbc.model.business.EmployeeService;

/**
 * Servlet implementation class EmployeeFindAllServlet
 */
@WebServlet("/EmployeeFindAllServlet")
public class EmployeeFindAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeService service = new ObjectFactory().getServiceInstance();
		List<Employee> employees = service.fetchEmployees();
		PrintWriter pw = response.getWriter();
//		pw.print("<html><body>");
//		pw.print(employees);
//		pw.print("</body></html>");
		response.setContentType("application/json");
		Gson gson = new GsonBuilder().create();
		String employeesAllJSON = gson.toJson(employees).toString();
		pw.print(employeesAllJSON);
	}
}
