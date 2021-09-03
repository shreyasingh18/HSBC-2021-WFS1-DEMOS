package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.beans.User;
import com.hsbc.exceptions.UserNotFoundException;

public class UserDaoListImpl implements UserDao {
	// Now we are using ArrayList as the temporary
	private static List<User> usersList = new ArrayList<User>();
	public UserDaoListImpl() {
		System.out.println("UserDaoListImpl() created");
	}
	@Override
	public int save(User user) {
		user.setUserId(usersList.size() + 1);
		usersList.add(user); 
		return user.getUserId();
	}
	@Override
	public User findById(int id) throws UserNotFoundException {
		User user = null;
		for(User u : usersList) {
			if(u.getUserId() == id) {
				user = u;
				break;
			}
		}
		if(user == null)
			throw new UserNotFoundException("Sorry user with an id: "+id+" not found");
		return user;
	}
	@Override
	public User[] findAll() {
		// converts collection to array
		User[] userArray = usersList.toArray(new User[usersList.size()]);
		return userArray;
	}

}
