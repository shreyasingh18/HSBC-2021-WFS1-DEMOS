package com.hsbc;

public class TestCustomerArray {

	public static void main(String[] args) {
		// creating customer array of some size, it creates memory to store customer object
		Customer[] customers = new Customer[3]; // customers[null, null, null]
		// each index will have null by default
		for(Customer customer : customers) {
			System.out.println(customer);
		}
		System.out.println("----------------------");
		// assign customer object using index number
		customers[0] = new Customer(1, "Raj", 9900088809L);  // customers[customerObject, null, null]
		customers[1] = new Customer(2, "Bruce", 888009239L); // customers[customerObject, customerObject, null]
		customers[2] = new Customer(3, "Charles", 9902392039L); // customers[customerObject, customerObject, customerObject];
		// iterate the customers array to display id, name & phone
		for(Customer customer : customers) {
			System.out.println("Id = "+customer.getId());
			System.out.println("Name = "+customer.getName());
			System.out.println("Phone = "+customer.getPhone());
			System.out.println("-----------------------");
		}
	}

}
