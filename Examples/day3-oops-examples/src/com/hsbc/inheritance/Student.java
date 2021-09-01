package com.hsbc.inheritance;

public class Student extends Person {
	private int rollNo;
	private String grade;
	public Student() { // super()
		System.out.println("Student() created");
	}
	public Student(int rollNo, String name, long phone, String grade) {
		super(name, phone); // Person(String, long);
		this.rollNo = rollNo;
		this.grade = grade;
		System.out.println("Student(rollNo, name, phone, grade)");
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
