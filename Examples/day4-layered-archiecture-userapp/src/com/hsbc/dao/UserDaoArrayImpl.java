package com.hsbc.dao;
import com.hsbc.beans.User;
// this will main all the users in an array and its size is maximum 25
public class UserDaoArrayImpl implements UserDao {
	
	// single copy of userDB for all the instances of UserDaoArrayImpl
	private static User[] userDB = new User[25]; // 25 index will null
	private static int indexCounter = 0; // increment counter for each save()
	@Override
	// save(userObject) will be called by Service Layer
	public int save(User user) {
		user.setUserId(indexCounter + 1); // this will generate the id based on the index 
		userDB[indexCounter++] = user;
		return user.getUserId();
	}

	@Override
	public User findById(int id) {
		User[] userArray = findAll();
		User user = null;
		for(User u : userArray) {
			if(u.getUserId() == id) {
				user = u;
				break;
			}
		}
		return user;
	}

	@Override
	public User[] findAll() {
		User[] availableUsers = new User[indexCounter];
		for(int i = 0; i < indexCounter; i++) {
			availableUsers[i] = userDB[i]; // copy only the users available in the main array
		}
		return availableUsers;
	}

}
