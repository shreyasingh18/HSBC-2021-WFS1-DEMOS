package com.hsbc;
/*
 * 
 * static members you can access either through class name or through reference
 * non-static members you can access only through reference
 * Static: All the objects share common copy of the static variables
 * Instance: Every object will have their own copy of the instance variables
 */
class Xyz {
	int a = 10;		// non-static variable or instance variable
	static int b = 20; // static variable
}

public class TestStaticNotStatic {

	public static void main(String[] args) {
		Xyz x1 = new Xyz();
		Xyz x2 = new Xyz();
		
		x1.a = 500;
		x1.b = 600;
		x2.a = 700;
		x2.b = 800;
		Xyz.b = 900;
		System.out.println("x1.a = "+x1.a+", x1.b = "+x1.b); // x1.a = 500, x1.b = 900 
		System.out.println("x2.a = "+x2.a+", x2.b = "+x2.b); // x2.a = 700, x2.b = 900 
		System.out.println("Xyz.b = "+Xyz.b); // Xyz.b = 900 
	}

}
