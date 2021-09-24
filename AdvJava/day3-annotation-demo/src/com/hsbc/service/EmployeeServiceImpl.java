package com.hsbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hsbc.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	@Qualifier("employeeDaoJdbcImpl")
	private EmployeeDao dao; 
	
	public void store() {
		System.out.println("store() inside EmployeeServiceImpl");
		dao.save();
	}

	public void fetchAll() {
		System.out.println("store() inside EmployeeServiceImpl");
		dao.findAll();
	}
}
