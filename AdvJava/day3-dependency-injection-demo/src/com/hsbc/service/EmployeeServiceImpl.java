package com.hsbc.service;

import com.hsbc.dao.EmployeeDao;

// Service layer uses Dao layer 
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao; 
	
	public EmployeeServiceImpl(EmployeeDao dao) {
		this.dao = dao;
		System.out.println("EmployeeServiceImpl(EmployeeDao) is called");
	}
	
	public void store() {
		System.out.println("store() inside EmployeeServiceImpl");
		dao.save();
	}

	public void fetchAll() {
		System.out.println("store() inside EmployeeServiceImpl");
		dao.findAll();
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
		System.out.println("setDao() is called");
	}

}
