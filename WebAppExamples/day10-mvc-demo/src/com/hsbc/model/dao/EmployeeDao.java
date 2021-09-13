package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.model.beans.Employee;

public interface EmployeeDao {

	// take employee object, store its detail and return the id
	public int save(Employee employee);
	
	// return all the employees in the List format
	public List<Employee> findAll();
	
	// return an employee based on id
	public Employee findById(int id);
}
