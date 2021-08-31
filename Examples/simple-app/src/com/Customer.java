package com;

// Customer needs to have properties id, name, phone
public class Customer {
	int id;
	String name;
	long phone; 
	
	
	// you need to pass 3 arguments to call this constructor
	Customer(int x, String y, long z) {
		id = x;
		name = y;
		phone = z;
		System.out.println("Customer(x, y, z) called");
	}
	
	// methods need to have a syntax <<modifier>> <<return-type>> <<method-name>>(parameters) { }
	void display() {
		System.out.println("Id = "+id+", Name = "+name+", Phone = "+phone);
	}
	
	// here details methods is returning the result so that caller can print how he wants
	String details() {
		return "Id = "+id+", Name = "+name+", Phone = "+phone;
	}
}


