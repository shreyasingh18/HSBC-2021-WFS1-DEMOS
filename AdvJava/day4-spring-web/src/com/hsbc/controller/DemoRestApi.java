package com.hsbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.beans.Employee;
import com.hsbc.service.EmployeeService;

@RestController
@RequestMapping("api")
public class DemoRestApi {

	@Autowired
	private EmployeeService service;
	
	@RequestMapping(path = "greet", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String greetings() {
		return "Welcome to Spring REST";
	}
	@RequestMapping(path = "findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Employee> findAllEmployeesApi() {
		List<Employee> employees = service.findAllEmployees();
		return employees;
	}
}
