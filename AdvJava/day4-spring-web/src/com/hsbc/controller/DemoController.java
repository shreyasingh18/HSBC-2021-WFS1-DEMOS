package com.hsbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hsbc.beans.Employee;
import com.hsbc.service.EmployeeService;

@Controller
@RequestMapping("v1")   // http://ip:port/app-name/spring/v1
public class DemoController {

	@Autowired
	private EmployeeService service;
	
	
	@RequestMapping(path = "greet", method = RequestMethod.GET)
	public ModelAndView greetings() {
		ModelAndView mav = new ModelAndView("welcome", "key", "Welcome to spring web");
		return mav;
	}
	
	@RequestMapping(path = "findAll", method = RequestMethod.GET)
	public ModelAndView findEmployees() {
		List<Employee> list = service.findAllEmployees();
		ModelAndView mav = new ModelAndView("displayAll", "emps", list);
		return mav;
	}
	
	@RequestMapping(path = "store", method = RequestMethod.POST)
	public ModelAndView storeEmployee(@RequestParam("t1") String name, @RequestParam("t2") double salary) {
		Employee emp = new Employee();
		emp.setName(name);
		emp.setSalary(salary);
		service.store(emp);
		List<Employee> list = service.findAllEmployees();
		ModelAndView mav = new ModelAndView("displayAll", "emps", list);
		return mav;
	}
	
}
