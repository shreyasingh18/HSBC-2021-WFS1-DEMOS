package com.hsbc.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		// person object - setName, getName, setPhone, getPhone
		Person p1 = new Person();
		p1.setName("Alex");
		p1.setPhone(99992939L);
		System.out.println("Name = "+p1.getName()+", Phone = "+p1.getPhone());
		System.out.println("---------------------------");
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setSalary(35000);
		e1.setName("Bruce");
		e1.setPhone(888000L);
		System.out.println("Id = "+e1.getId()+", Name = "+e1.getName()+", Phone = "+e1.getPhone()+", Salary = "+e1.getSalary());
		System.out.println("---------------------------");
	}
}
