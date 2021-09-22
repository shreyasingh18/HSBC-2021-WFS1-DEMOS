package com.hsbc.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalInterfaceDemo3 {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(106, "Alex", 45000.45));
		employees.add(new Employee(101, "Zaheer", 25000.45));
		employees.add(new Employee(103, "Yuvraj", 35000.45));
		employees.add(new Employee(104, "Sachin", 75000.45));
		employees.add(new Employee(102, "Virat", 85000.45));
		// now using anonymous class instance as parameter
		System.out.println("---- sort based on id in ascending order but using anonymous class -----------");
		Collections.sort(employees, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getId() - e2.getId();
			}
		});
		FunctionalInterfaceDemo.printEmployees(employees); // printEmployees prints the employee in the list
		System.out.println("-----------sort based on name in ascending order-------------");
		Collections.sort(employees, 
				(e1, e2) -> e1.getName().compareTo(e2.getName())); // it is understood that sort 2nd parameter is Comparator type
		FunctionalInterfaceDemo.printEmployees(employees);	
		System.out.println("-----------sort based on salary in ascending order-------------");
		Collections.sort(employees, 
				(e1, e2) -> (int)(e1.getSalary() - e2.getSalary())); // it is understood that sort 2nd parameter is Comparator type
		FunctionalInterfaceDemo.printEmployees(employees);		
		
	}
}
