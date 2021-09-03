package com.hsbc;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.beans.Employee;

public class TestComplexTypeIteration {

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
		System.out.println("Size: "+employeesList.size());
		// iterating the list
		for(Employee employee : employeesList) {
			//System.out.println("Id = "+employee.getId()+", Name = "+employee.getName()+", Salary = "+employee.getSalary());
			System.out.println(employee); // employee.toString()
			System.out.println("--------------------------");
		}
			
	}

}
