package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;

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

@WebServlet("/EmployeeFindServlet")
public class EmployeeFindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("t1"));
		
		EmployeeService service = new ObjectFactory().getServiceInstance();
		Employee employee = service.fetchEmployee(id);
		
		PrintWriter pw = response.getWriter();
		//pw.print("<html><body>");
		//pw.print(employee);
		//pw.print("</body></html>");
		
		Gson gson = new GsonBuilder().create();
		String employeeJSON = gson.toJson(employee).toString(); // converts java object to json
		response.setContentType("application/json"); 
		pw.print(employeeJSON);
	}

}
