package com.hsbc.model.business;

import java.util.List;
import com.hsbc.factory.ObjectFactory;
import com.hsbc.model.beans.Employee;
import com.hsbc.model.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;
	public EmployeeServiceImpl() {
		dao = new ObjectFactory().getDaoInstance();
	}
	@Override
	public Employee store(Employee employee) {
		int id = dao.save(employee);
		return fetchEmployee(id);
	}

	@Override
	public List<Employee> fetchEmployees() {
		return dao.findAll();
	}

	@Override
	public Employee fetchEmployee(int id) {
		return dao.findById(id);
	}
	
	@Override
	public List<Employee> sortEmployeesByName() {
		return null;
	}

}
