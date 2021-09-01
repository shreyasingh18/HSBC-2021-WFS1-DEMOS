package com.hsbc.inheritance;


class ConsoleUtil {
	// print the data in the console
	public void invoke(Person p) {
		System.out.println(p.details());
	}
}

public class TestPersonPolymorphism {

	public static void main(String[] args) {
		ConsoleUtil util = new ConsoleUtil();
		Person p1 = new Person("Alex", 9902309L);
		util.invoke(p1);
		System.out.println("----------------------------");
		Employee e1 = new Employee(100, "Bruce", 999020923L, 26000);
		util.invoke(e1); // Person p = e1 = new Employee(...) { p.details() } 
		/*Create student object & call invoke that should show rollno, name, phone & grade*/
	}

}
