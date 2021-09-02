package com.hsbc.service;

import com.hsbc.beans.User;
import com.hsbc.dao.UserDao;
import com.hsbc.factory.ObjectFactory;

// service layer needs dao instance
public class UserServiceImpl implements UserService {

	private UserDao dao;
	public UserServiceImpl() {
		ObjectFactory factory = new ObjectFactory();
		dao = factory.getDaoInstance();
	}
	@Override
	public User storeUser(User user) {
		int id = dao.save(user); // returns generated id
		User storedUser = dao.findById(id); // pass the generated id to get the User
		return storedUser;
	}

	@Override
	public User fetchUserById(int id) {
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
