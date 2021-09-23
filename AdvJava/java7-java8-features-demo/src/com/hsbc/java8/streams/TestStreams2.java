package com.hsbc.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.hsbc.java8.Employee;

public class TestStreams2 {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(106, "Alex", 45000.45));
		employees.add(new Employee(101, "Zaheer", 25000.45));
		employees.add(new Employee(103, "Yuvraj", 35000.45));
		employees.add(new Employee(104, "Sachin", 75000.45));
		employees.add(new Employee(102, "Virat", 85000.45));

		System.out.println("------------Iterating using forEach()---------------");
		// iterating employees using forEach
		employees.forEach(employee -> System.out.println(employee));
		
		/*
		 * Old approach: getting only the names in the employee and keeping in the List<String>
		 */
		List<String> names = new ArrayList<String>();
		for(Employee e : employees) {
			names.add(e.getName());
		}
		System.out.println(names);
		/*
		 * New approach getting only the names in the employee and keeping in the List<String>
		 */
		List<String> listOfNames = employees.stream().map(e -> e.getName()).distinct().collect(Collectors.toList());
		System.out.println(listOfNames);
		List<Integer> listOfIds = employees.stream().map(e -> e.getId()).collect(Collectors.toList());
		System.out.println(listOfIds);
		long count = employees.stream().filter(e -> e.getSalary() > 40000 && e.getSalary() < 70000).count();
		System.out.println("Count: "+count);
	}
}
