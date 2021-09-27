package com.hsbc.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public void store(Employee employee) {
		dao.save(employee);
	}
	
	public List<Employee> findAllEmployees() {
		return dao.fetchEmployees();
	}

	public List<Employee> getEmployeesInAscOrderByName() {
		List<Employee> employees = findAllEmployees().stream()
				.sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		return employees;
	}

	public List<Employee> getEmployeesInDescOrderByName() {
		return findAllEmployees().stream()
				.sorted((e1, e2) -> e2.getName().compareTo(e1.getName())).collect(Collectors.toList());
	}

	public List<Employee> getEmployeesInAscOrderById() {
		return findAllEmployees().stream()
				.sorted((e1, e2) -> Integer.compare(e1.getId(), e2.getId())).collect(Collectors.toList());
	} 

	public List<Employee> getEmployeesInDescOrderById() {
		return findAllEmployees().stream()
				.sorted((e1, e2) -> Integer.compare(e2.getId(), e1.getId())).collect(Collectors.toList());
	}

}
