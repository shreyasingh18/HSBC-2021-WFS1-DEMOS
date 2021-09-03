package com.hsbc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hsbc.beans.Employee;

public class TestListComplexType {

	public static void main(String[] args) {
		// adding employee in the List
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
		for(Employee employee : employeesList) 
			System.out.println("Id = "+employee.getId()+", Name = "+employee.getName()+", Salary = "+employee.getSalary());

		// how to remove based on specific id
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id = scan.nextInt();
	
//		for(Employee employee : employeesList) {
//			if(employee.getId() == id) {
//				employeesList.remove(employee);
//				break;
//			}
//		}		
		System.out.println("---- Iterating with Iterator --------");
		Iterator<Employee> it = employeesList.iterator(); // Iterator - hasNext(), next() & remove()
		while(it.hasNext()) { // hasNext() returns boolean value true/false
			Employee e = it.next(); // this returns the next element by pointing to the next element
			// remove when id matches to iterated employee id
			if(e.getId() == id) {
				it.remove(); // we are removing the iterated object from the list
			}
		}
		for(Employee e : employeesList) 
			System.out.println(e);
		
		scan.close();
	}

}
