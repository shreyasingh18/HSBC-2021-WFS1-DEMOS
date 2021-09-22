package com.hsbc.java8;

interface I1 {
	String sayHello(String name);
}
/*
 * I1 can be implemented in a separate class
 * I1 can be implemented in an anonymous class
 * I1 can be implemented via lambda expression also
 */
public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) {
		// through anonymous class implementing I1
		I1 i1 = new I1() { 
			public String sayHello(String name) {
				System.out.println("sayHello() called");
				return "Welcome "+name;
			}
		};
		System.out.println(i1.sayHello("Alex"));
		// through lambda expression implementing I1
		I1 i2 = (n) -> "Hi "+n; 
		System.out.println(i2.sayHello("Bruce"));
		// another way of writing lambda expression when there are multiple lines of code
		I1 i3 = (n) -> {
			System.out.println("sayHello() in lambda expression");
			return "Hello "+n;
		};
		System.out.println(i3.sayHello("Charles"));
	}

}
