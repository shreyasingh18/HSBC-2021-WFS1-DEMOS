package com.hsbc.polymorphism;

class X { 
	void test() {
		System.out.println("test() inside X");
	}
}
class Y extends X {
	void test() {
		System.out.println("test() inside Y");
	}
	void demo() {
		System.out.println("demo() inside Y");
	}
}
class Z extends Y {
	void test() {
		System.out.println("test() inside Z");
	}
	void hello() {
		System.out.println("hello() inside Z");
	}
}
class Util2 {
	public void invoke(X x) { // X x = z1 = new Z(); (X, Y, Z)
		x.test();
		if(x instanceof Y) { // checks whether x is taking Y type object which is automatically X type
			System.out.println("if x instance of Y");
			Y y = (Y) x; // Y y = new Z(); LHS = RHS 
			y.demo();
		}
		if(x instanceof Z) { // checks whetner x is taking Z type object which is automatically Y & X type
			System.out.println("if x instance of Z");
			Z z = (Z) x; // Z z = new Z(); LHS = RHS
			z.hello();
		}
	}
}
public class TestDowncasting {

	public static void main(String[] args) {
		Util2 util = new Util2();
		X x1 = new X();
		util.invoke(x1);
		Y y1 = new Y();
		util.invoke(y1);
		Z z1 = new Z();
		util.invoke(z1);
	}

}
