package com.hsbc.beans;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
	private int id;
	private String name;
	private LocalDate dob; // It is introduced in Java 8 as a replacement to java.util.Date
	// Date -> Month & Year doesn't give proper values, 0 means January, 11 means December, it stores date & time both
	// LocalDate -> Month & Year gives proper values & it only stores date 
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
}
