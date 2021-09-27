package com.hsbc.service;

import java.util.List;

import com.hsbc.beans.Employee;

public interface EmployeeService {
	public void store(Employee employee);
	public List<Employee> findAllEmployees();
	public List<Employee> getEmployeesInAscOrderByName();
	public List<Employee> getEmployeesInDescOrderByName(); 
	public List<Employee> getEmployeesInAscOrderById(); 
	public List<Employee> getEmployeesInDescOrderById(); 
}
