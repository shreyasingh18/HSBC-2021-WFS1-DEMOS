package com.hsbc.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoJdbcImpl implements EmployeeDao {

	@Override
	public void save() {
		System.out.println("save() inside EmployeeDaoJdbcImpl");
	}

	@Override
	public void findAll() {
		System.out.println("findAll() inside EmployeeDaoJdbcImpl");
	}

}
