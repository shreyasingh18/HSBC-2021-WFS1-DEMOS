package com.hsbc.service;

import com.hsbc.beans.User;
import com.hsbc.dao.UserDao;
import com.hsbc.exceptions.UserNotFoundException;
import com.hsbc.factory.ObjectFactory;

// service layer needs dao instance
public class UserServiceImpl implements UserService {

	private UserDao dao;
	// 1st approach of using factory pattern
	public UserServiceImpl() {
		ObjectFactory factory = new ObjectFactory();
		dao = factory.getDaoInstance();
	}
	// 2nd approach of using factory pattern is passing dao to the service through constructor parameter
	public UserServiceImpl(UserDao dao) {
		this.dao = dao;
	}
	@Override
	public User storeUser(User user) {
		int id = dao.save(user); // returns generated id
		User storedUser = null;
		try {
			storedUser = dao.findById(id);// pass the generated id to get the User
		} catch (UserNotFoundException e) {
			e.printStackTrace();
		} 
		return storedUser;
	}

	@Override
	public User fetchUserById(int id) throws UserNotFoundException {
		User user = dao.findById(id);
		return user;
	}

	@Override
	public User[] findAllUsers() {
		User[] users = dao.findAll();
		return users;
	}

	@Override
	public User[] sortUsersByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User fetchUserByPhone(long phone) {
		// TODO Auto-generated method stub
		return null;
	}

}
