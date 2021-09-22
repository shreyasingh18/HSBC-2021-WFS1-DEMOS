package com.hsbc.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(106, "Alex", 45000.45));
		employees.add(new Employee(101, "Zaheer", 25000.45));
		employees.add(new Employee(103, "Yuvraj", 35000.45));
		employees.add(new Employee(104, "Sachin", 75000.45));
		employees.add(new Employee(102, "Virat", 85000.45));
		
		System.out.println("---- after sort by id in ascending order----");
		Collections.sort(employees, new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getId() - o2.getId();
			}
		});
		printEmployees(employees);
		System.out.println("---- after sort by id in descending order----");
		Collections.sort(employees, new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o2.getId() - o1.getId();
			}
		});
		printEmployees(employees);
		System.out.println("---- after sort by name  in ascending order----");
		Collections.sort(employees, new Comparator<Employee>() { 
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		printEmployees(employees);
		
	}
	public static void printEmployees(List<Employee> list) {
		for(Employee e : list) {
			System.out.println(e);
		}
	}

}
