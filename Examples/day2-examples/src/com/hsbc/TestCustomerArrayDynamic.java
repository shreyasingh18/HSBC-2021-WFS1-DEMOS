package com.hsbc;

import java.util.Scanner;

public class TestCustomerArrayDynamic {

	public static void main(String[] args) {
		Customer[] customers = new Customer[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter customer details to store in the array");
		for(int i = 0; i < customers.length; i++) {
			System.out.println("Enter id: ");
			int id = scan.nextInt();
			System.out.println("Enter name: ");
			String name = scan.next();
			System.out.println("Enter phone: ");
			long phone = scan.nextLong();
			customers[i] = new Customer(id, name, phone);
		}
		System.out.println("-----------------");
		for(Customer customer : customers) {
			System.out.println("Id = "+customer.getId());
			System.out.println("Name = "+customer.getName());
			System.out.println("Phone = "+customer.getPhone());
			System.out.println("-----------------------");
		}
		scan.close();
	}

}
