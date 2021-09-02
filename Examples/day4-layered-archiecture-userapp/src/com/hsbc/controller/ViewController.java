package com.hsbc.controller;

import java.util.Scanner;

import com.hsbc.beans.User;
import com.hsbc.factory.ObjectFactory;
import com.hsbc.service.UserService;

public class ViewController {

	public static void main(String[] args) {
		// main method acts like controller & view
		Scanner scan = new Scanner(System.in);
		// Service instance need to be used
		ObjectFactory factory = new ObjectFactory();
		UserService service = factory.getServiceInstance();
		int menuOptions = 0;
		do {
			// You need to implement 4th & 5th options as its incomplete now
			System.out.println("1: Store 2: Search By Id 3: Display All 4: Sort By Name 5: Search By Phone 6: Exit");
			menuOptions = scan.nextInt();
			switch(menuOptions) {
			case 1: // you need to ask name and phone
				User user = new User();
				System.out.println("Enter name");
				user.setName(scan.next());
				System.out.println("Enter phone");
				user.setPhone(scan.nextLong());
				// call the storeUser that returns the user with id also
				User created = service.storeUser(user);
				System.out.println("Id = "+created.getUserId()+", Name = "+created.getName()+", Phone = "+created.getPhone());
				break;
			case 2: 
				System.out.println("Enter id to search");
				User u = service.fetchUserById(scan.nextInt());
				System.out.println("Id = "+u.getUserId()+", Name = "+u.getName()+", Phone = "+u.getPhone());
				break;
			case 3: 
				User[] allUsers = service.findAllUsers();
				for(User obj : allUsers) {
					System.out.println("Id = "+obj.getUserId()+", Name = "+obj.getName()+", Phone = "+obj.getPhone());
				}
				break;
			case 4: 
				break;
			case 5: 
				break;
			
			}
		} while(menuOptions != 6);
		scan.close();
	}

}
