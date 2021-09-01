package com.hsbc.polymorphism;

class A {
	void test() {
		System.out.println("test() inside A");
	}
}
class B extends A {
	@Override
	void test() {
		System.out.println("test() inside B");
	}
}
class C extends B {
	@Override
	void test() {
		System.out.println("test() inside C");
	}
}
class Util {
	// understanding how we can't predict the test() method execution
	void invoke(A ob) { // invoke can take A, B & C type of object
		ob.test(); // at the compilation its calling test() of class A
	}
}
public class TestRuntimePolymorphism {
	public static void main(String[] args) {
		A a = new A();   		B b = new B();    		C c = new C();
		// creating Util object
		Util util = new Util();
		util.invoke(a); // invoke(A ob = a = new A()) ob.test()
		util.invoke(b); // invoke(A ob = b = new B()) ob.test()
		util.invoke(c); // invoke(A ob = c = new C()) ob.test()	
	}
}
