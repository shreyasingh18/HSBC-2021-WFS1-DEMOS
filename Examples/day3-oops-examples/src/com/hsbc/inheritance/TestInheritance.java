package com.hsbc.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		// person object - setName, getName, setPhone, getPhone
		Person p1 = new Person("Alexandar", 8899929393L); // Person(name, phone)
		System.out.println("Name = "+p1.getName()+", Phone = "+p1.getPhone());
		System.out.println("---------------------------");
		
		Employee e1 = new Employee(100, "Bruce", 9283293L, 325000.0); // Employee(id, name, phone, salary)
		System.out.println("Id = "+e1.getId()+", Name = "+e1.getName()+", Phone = "+e1.getPhone()+", Salary = "+e1.getSalary());
		System.out.println("---------------------------");
		
		Student s1 = new Student(1, "Ajay", 292929L, "A+"); // Student(rollNo, name, phone, grade)
		System.out.println("Roll No = "+s1.getRollNo()+", Name = "+s1.getName()+", Phone = "+s1.getPhone()+", Grade = "+s1.getGrade());
		
		
	}
}
