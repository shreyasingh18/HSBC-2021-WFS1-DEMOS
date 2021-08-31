package com.hsbc;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private double salary;
	private String email;
	private long phone;
	// creating the constructor when id & name is mandatory
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Employee(id, name)");
	}
	// creating the constructor when certain fields are mandatory
	/*
	 * this() -> Employee()
	 * this(int, String) -> Employee(int, String)
	 * this(int, String, double) -> Employee(int, String, double)
	 * this(int, String, String, double, String, long) -> Employee(int, String, String, double, String, long)
	 * 
	 */
	public Employee(int id, String name, double salary) {
		this(id, name); // Employee(int, String)
		this.salary = salary;
		System.out.println("Employee(id, name, salary)");
	}
	// you can create constructor to initialize any number of properties
	public Employee(int id, String name, String gender, double salary, String email, long phone) {
		this(id, name, salary); // Employee(int, String, double);
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		System.out.println("Employee(id, name, gender, salary, email, phone)");
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
