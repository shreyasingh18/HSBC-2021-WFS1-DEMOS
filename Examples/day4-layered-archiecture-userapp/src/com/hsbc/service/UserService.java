package com.hsbc.service;

import com.hsbc.beans.User;

public interface UserService {
	public User storeUser(User user);
	public User fetchUserById(int id);
	public User[] findAllUsers();
	public User[] sortUsersByName();
	public User fetchUserByPhone(long phone);
}
