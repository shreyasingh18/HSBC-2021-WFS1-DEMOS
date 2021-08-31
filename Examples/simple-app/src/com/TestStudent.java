package com;

public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student(10, "Alex", "C");
		student1.display();
		student1.setGrade("A");
		student1.display();
		
		String name = student1.getName();
		System.out.println("Name of the student: "+name);
	}

}
