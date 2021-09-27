package com.hsbc.viewcontroller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.beans.Employee;
import com.hsbc.service.EmployeeService;

public class ViewController {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		// get the service instance
		EmployeeService service = (EmployeeService)ctx.getBean("employeeServiceImpl");
		String option = "";
		do {
			System.out.println("Enter option:");
			System.out.println("1: Store 2: Display All 3: Sort by name in asc 4: Sort by name in desc "
					+ "5: Sort by id in asc 6: Sort by id in desc 6: No to exit");
			option = scan.next();
			switch(option) {
			case "1":
				System.out.println("Enter name");
				String name = scan.next();
				System.out.println("Enter salary");
				double salary = scan.nextDouble();
				Employee employee = new Employee();
				employee.setName(name);
				employee.setSalary(salary);
				service.store(employee);
				System.out.println("----- Employee stored ------");
				break;
			case "2":
				service.findAllEmployees().forEach(item -> System.out.println(item));
				break;
			case "3":
				service.getEmployeesInAscOrderByName().forEach(item -> System.out.println(item));
				break;
			case "4": 
				service.getEmployeesInDescOrderByName().forEach(item -> System.out.println(item));
				break;
			case "5":
				service.getEmployeesInAscOrderById().forEach(item -> System.out.println(item));
				break;
			case "6":
				service.getEmployeesInDescOrderById().forEach(item -> System.out.println(item));
				break;	
			}
		
		} while(!option.equalsIgnoreCase("no"));
		
		((ClassPathXmlApplicationContext)ctx).close();
		scan.close();
	}
}
