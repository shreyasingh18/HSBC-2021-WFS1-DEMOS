package com.hsbc.demo;

public class DAOFactory {
	// this returns instance of TestDAO implementation
	public TestDAO getDAOInstance() {
		TestDAO dao = new TestDAOImp2();
		return dao;
	}
}
