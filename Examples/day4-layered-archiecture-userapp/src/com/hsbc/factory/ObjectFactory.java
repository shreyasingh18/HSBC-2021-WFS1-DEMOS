package com.hsbc.factory;

import com.hsbc.dao.UserDao;
import com.hsbc.dao.UserDaoArrayImpl;
import com.hsbc.service.UserService;
import com.hsbc.service.UserServiceImpl;

public class ObjectFactory {
	
	// create DAO instance
	public UserDao getDaoInstance() {
		return new UserDaoArrayImpl();
	}
	
	// create Service instance
	public UserService getServiceInstance() {
		return new UserServiceImpl();
	}
}
