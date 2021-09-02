package com.hsbc.dao;

import com.hsbc.beans.User;

// let us now create only 3 methods inside UserDao
public interface UserDao {
	int save(User user);
	User findById(int id);
	User[] findAll();
}
