package com.hsbc.dao;

import java.util.List;

import com.hsbc.beans.Employee;

public interface EmployeeDao {
	public void save(Employee employee);
	public List<Employee> fetchEmployees();
}
