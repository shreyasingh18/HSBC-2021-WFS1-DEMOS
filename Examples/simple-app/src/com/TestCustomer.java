package com;

public class TestCustomer {
	public static void main(String[] args) {
		// Create Customer object, same way how you declare variables int x = 10;
		Customer customer1 = new Customer(1, "Alex", 9999999999L);  // x = 1, id = x, y = Alex, name = y, phone = z;
		
		customer1.display();
		String result = customer1.details(); // called by different UI like Desktop, Mobile, Web
		System.out.println("Result = "+result);
		Customer customer2 = new Customer(2, "Bruce", 888888888L); 
		
		customer2.display();
		
		
	}
}
