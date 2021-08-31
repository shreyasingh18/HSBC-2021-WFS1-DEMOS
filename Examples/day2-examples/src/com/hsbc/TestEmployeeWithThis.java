package com.hsbc;

public class TestEmployeeWithThis {

	public static void main(String[] args) {
		// employee with id & name parameters
		Employee employee1 = new Employee(10, "Alex"); // gender = null, salary = 0, email = null, phone = 0
		System.out.println("Id = "+employee1.getId());
		System.out.println("Name = "+employee1.getName());
		System.out.println("Salary = "+employee1.getSalary());
		System.out.println("Gender = "+employee1.getGender());
		
		// employee with id, name, salary
		System.out.println("--------------------------");
		Employee employee2 = new Employee(20, "Bruce", 35200);
		System.out.println("Id = "+employee2.getId());
		System.out.println("Name = "+employee2.getName());
		System.out.println("Salary = "+employee2.getSalary());
		System.out.println("Gender = "+employee2.getGender());
		// employee with id, name, salary, gender, email, phone;
		System.out.println("---------------------------");
		Employee employee3 = new Employee(30, "Charles", "Male", 23200, "charles123", 9293993L);
		System.out.println("Id = "+employee3.getId());
		System.out.println("Name = "+employee3.getName());
		System.out.println("Salary = "+employee3.getSalary());
		System.out.println("Gender = "+employee3.getGender());
	}

}
