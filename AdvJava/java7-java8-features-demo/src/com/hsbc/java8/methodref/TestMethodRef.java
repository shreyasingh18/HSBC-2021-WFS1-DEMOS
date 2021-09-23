package com.hsbc.java8.methodref;

interface A {
	int operation(int a, int b);
}

class Calculator {
	public int add(int x, int y) {
		System.out.println("add(x, y) in Calculator");
		return (x + y);
	}
	public int sub(int x, int y) {
		System.out.println("sub(x, y) in Calculator");
		return (x - y);
	}
}
public class TestMethodRef {

	public static void main(String[] args) {
		Calculator calci = new Calculator();
		// lambda expression for interface A
		A a1 = (i, j) -> i * j;
		System.out.println("Operation: "+a1.operation(2, 4));
		System.out.println("--------------------");
		// you can ref add or sub method of Calculator to the operation() method of A 
		A a2 = calci :: add; // takes the implementation of add method
		System.out.println("Operation: "+a2.operation(4, 1));
		System.out.println("--------------------");
		A a3 = calci :: sub; // takes the implementation of sub method
		System.out.println("Operation: "+a3.operation(5, 2));
		System.out.println("---- Passing method reference & lamba as a parameter -----");
		hello(calci :: add);
		hello(calci::sub);
		hello((i, j) -> (i / j));
	}
	public static void hello(A a) {
		System.out.println("Operation: "+a.operation(20, 10));
		System.out.println("-------------");
	}
}
