package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Employee;

/*
 * RestController is used to create Restful webservcies
 * full path will be http://IP:PORT/context-path/api/
 */
@RestController
@RequestMapping("api")
public class RestApiDemo {

	@GetMapping(path = "greet", produces = MediaType.TEXT_PLAIN_VALUE)
	public String welcome() {
		return "Welcome to Spring Boot REST";
	}
	@GetMapping(path = "find", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee findEmployee() {
		Employee emp = new Employee(100, "Testing", 232000);
		return emp;
	}
	@GetMapping(path = "findAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> findEmployees() {
		List<Employee> list = Arrays.asList(new Employee(101, "Raj", 25200), new Employee(201, "Vijay", 55000));
		return list;
	}
}
