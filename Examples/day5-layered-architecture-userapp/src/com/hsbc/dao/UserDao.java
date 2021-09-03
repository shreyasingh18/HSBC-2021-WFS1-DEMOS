package com.hsbc.dao;

import com.hsbc.beans.User;
import com.hsbc.exceptions.UserNotFoundException;

// let us now create only 3 methods inside UserDao
public interface UserDao {
	int save(User user);
	User findById(int id) throws UserNotFoundException;
	User[] findAll();
}
