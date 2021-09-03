package com.hsbc;

import java.util.HashSet;
import java.util.Set;

import com.hsbc.beans.Employee;

public class TestComplexTypeUniqueness {

	public static void main(String[] args) {
		Employee emp1 = new Employee(111, "Alex", 25200);
		Employee emp2 = new Employee(211, "Charles", 65200);
		Employee emp3 = new Employee(511, "Bruce", 85200);
		Employee emp4 = new Employee(411, "Edward", 95200);
		Employee emp5 = new Employee(311, "David", 99200);
		Employee emp6 = new Employee(311, "David", 99200);
		Employee emp7 = new Employee(311, "David", 99200);
		// adding employee objects to the Set - either you can add to HashSet or LinkedHashSet
		
		Set<Employee> employeeSet = new HashSet<Employee>();
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		employeeSet.add(emp4);
		employeeSet.add(emp5);  
		employeeSet.add(emp6);  // emp6.hashCode() -> 929923 -> 
		employeeSet.add(emp7); // it calls equals to compare & hashCode to find uniqueness
		
		for(Employee e : employeeSet) {
			System.out.println(e);
		}
		
	}

}
