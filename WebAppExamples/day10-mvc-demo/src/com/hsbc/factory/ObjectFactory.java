package com.hsbc.factory;

import com.hsbc.model.business.EmployeeService;
import com.hsbc.model.business.EmployeeServiceImpl;
import com.hsbc.model.dao.EmployeeDao;
import com.hsbc.model.dao.EmployeeDaoJdbcImpl;

public class ObjectFactory {

	public EmployeeDao getDaoInstance() {
		EmployeeDao dao = new EmployeeDaoJdbcImpl();
		return dao;
	}
	
	public EmployeeService getServiceInstance() {
		EmployeeService service = new EmployeeServiceImpl();
		return service;
	}
}
