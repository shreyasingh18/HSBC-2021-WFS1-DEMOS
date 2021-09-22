package com.hsbc.java8;

interface A {
	default void test1() {
		System.out.println("test1() is inside A");
	}
	static void test2() {
		System.out.println("static test2() is inside A");
	}
	void test3();
}
class B implements A {
	public void test3() {
		System.out.println("test3() is inside B");
	}	
	public void test1() {
		System.out.println("test1() inside B");
	}
}
public class DefaultStaticMethodsDemo {
	public static void main(String[] args) {
		A a1 = new B();
		a1.test1();
		a1.test3();
		A.test2();
	}
}
