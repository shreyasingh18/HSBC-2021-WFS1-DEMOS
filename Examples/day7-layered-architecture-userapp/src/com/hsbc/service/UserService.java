package com.hsbc.service;

import com.hsbc.beans.User;
import com.hsbc.exceptions.UserNotFoundException;

public interface UserService {
	public User storeUser(User user);
	public User fetchUserById(int id) throws UserNotFoundException;
	public User[] findAllUsers();
	public User[] sortUsersByName();
	public User fetchUserByPhone(long phone);
}
