package com.hsbc.model.business;

import java.util.List;

import com.hsbc.model.beans.Employee;

public interface EmployeeService {
	public Employee store(Employee employee);
	public List<Employee> fetchEmployees();
	public Employee fetchEmployee(int id);
	public List<Employee> sortEmployeesByName();
}
