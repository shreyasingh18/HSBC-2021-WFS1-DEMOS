package com.hsbc;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.hsbc.beans.Employee;

public class TestComplexTypeSorting {
	public static void main(String[] args) {
		Employee emp1 = new Employee(5, "Alex", 25200);
		Employee emp2 = new Employee(2, "Charles", 65200);
		Employee emp3 = new Employee(3, "Bruce", 85200);
		Employee emp4 = new Employee(1, "Edward", 95200);
		Employee emp5 = new Employee(4, "David", 99200);
		
		// adding employee objects to the Set - either you can add to HashSet or LinkedHashSet
		
		Set<Employee> employeeSet = new TreeSet<Employee>();
		employeeSet.add(emp1); // add() -> compareTo on Employee
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		employeeSet.add(emp4);
		employeeSet.add(emp5);  
		
		for(Employee e : employeeSet) {
			System.out.println(e);
		}
	}
}
