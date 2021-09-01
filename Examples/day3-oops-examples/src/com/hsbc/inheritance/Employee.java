package com.hsbc.inheritance;

/*
 * Employee has setter methods of name & phone from Person
 * 
 */
public class Employee extends Person {
	private int id;
	private double salary;
	public Employee() { // super()
		System.out.println("Employee() created");
	}
	// Employee(100, "Bruce", 9283293L, 325000.0)
	public Employee(int id, String name, long phone, double salary) {
		super(name, phone); 
		this.id = id;
		this.salary = salary;
		System.out.println("Employee(id, name, phone, salary)");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
