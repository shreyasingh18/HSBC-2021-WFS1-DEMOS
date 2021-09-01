package com.hsbc.inheritance;

// Person will automatically extends Object which is the root class in java
public class Person {
	private String name;
	private long phone;
	public Person() {
		// there's an implicit call to super();
		System.out.println("Person() created");
	}
	// 
	public Person(String name, long phone) {
		// there's an implicit call to super();
		this.name = name;
		this.phone = phone;
		System.out.println("Person(name, phone)");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}	
}
