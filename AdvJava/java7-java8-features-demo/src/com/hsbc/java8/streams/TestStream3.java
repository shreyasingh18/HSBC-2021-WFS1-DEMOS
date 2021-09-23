package com.hsbc.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.hsbc.java8.Employee;

public class TestStream3 {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(106, "Alex", 45000.45));
		employees.add(new Employee(101, "Zaheer", 25000.45));
		employees.add(new Employee(103, "Yuvraj", 35000.45));
		employees.add(new Employee(104, "Sachin", 75000.45));
		employees.add(new Employee(102, "Virat", 85000.45));
		
		Stream<Employee> employeeStream = employees.stream();
		Stream<Employee> employeeSalaryStream = employeeStream.filter(item -> item.getSalary() > 40000);
		employeeSalaryStream.forEach(item -> System.out.println(item));
		System.out.println("--------------------------");
		employees.stream().filter(item -> item.getSalary() > 30000).forEach(item -> System.out.println(item));
	}
}
