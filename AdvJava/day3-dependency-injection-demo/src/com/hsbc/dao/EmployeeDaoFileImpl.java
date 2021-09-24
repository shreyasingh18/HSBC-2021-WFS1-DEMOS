package com.hsbc.dao;

public class EmployeeDaoFileImpl implements EmployeeDao {

	@Override
	public void save() {
		System.out.println("save() inside EmployeeDaoFileImpl");
	}

	@Override
	public void findAll() {
		System.out.println("findAll() inside EmployeeDaoFileImpl");
	}

}
