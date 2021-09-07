package com.hsbc.factory;

import com.hsbc.dao.UserDao;
import com.hsbc.dao.UserDaoArrayImpl;
import com.hsbc.dao.UserDaoJdbcImpl;
import com.hsbc.dao.UserDaoListImpl;
import com.hsbc.service.UserService;
import com.hsbc.service.UserServiceImpl;

public class ObjectFactory {
	
	private UserDao dao;
	// create DAO instance
	public UserDao getDaoInstance() {
		dao = new UserDaoListImpl();
		return dao; 
	}
	// create Service instance
	public UserService getServiceInstance() {
		return new UserServiceImpl();
	}	
	// this creates the DAO based on the option i.e., 2nd approach of the factory pattern
	public UserDao getDaoInstance(int option) {
		
		switch(option) {
			case 1: 
				dao = new UserDaoArrayImpl();
				break;
			case 2: 
				dao = new UserDaoListImpl();
				break;
			case 3:
				dao = new UserDaoJdbcImpl();
				break;
				
		}
		if(dao == null) {
			dao = new UserDaoArrayImpl();
		}
		return dao;
	}
	// this creates the Service taking dao instance by taking dao from the client
	public UserService getServiceInstance(UserDao dao) {
		return new UserServiceImpl(dao);
	}
}
