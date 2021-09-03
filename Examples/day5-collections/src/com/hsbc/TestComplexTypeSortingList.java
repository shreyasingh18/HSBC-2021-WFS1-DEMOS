package com.hsbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hsbc.beans.Employee;

public class TestComplexTypeSortingList {

	public static void main(String[] args) {
		List<Employee> employeesList = new ArrayList<Employee>();
		Employee emp1 = new Employee(111, "Alex", 25200);
		Employee emp2 = new Employee(211, "Charles", 65200);
		Employee emp3 = new Employee(511, "Bruce", 85200);
		Employee emp4 = new Employee(411, "Edward", 95200);
		Employee emp5 = new Employee(311, "David", 99200);
		employeesList.add(emp1);
		employeesList.add(emp2);
		employeesList.add(emp3);
		employeesList.add(emp4);
		employeesList.add(emp5);
		for(Employee e : employeesList) {
			System.out.println(e);
		}
		System.out.println("======= Employee after Sorting =========");
		// to sort we need to call Collections.sort(list) method, but Employee must implement Comparable<T>
		Collections.sort(employeesList);
		for(Employee e : employeesList) 
			System.out.println(e);
	}

}
