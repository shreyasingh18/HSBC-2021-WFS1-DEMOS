package com;

public class Student {
	private int rollNo;
	private String name;
	private String grade;
	
	public Student(int rollNo, String name, String grade) {
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}
	void display() {
		System.out.println("Roll No = "+rollNo+", Name = "+name+", Grade = "+grade);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getRollNo() {
		return rollNo;
	}
}

