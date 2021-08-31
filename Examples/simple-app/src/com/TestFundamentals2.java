package com;

public class TestFundamentals2 {

	public static void main(String[] args) {
		int x = 250;
		testing(x);
		testing(300);
		testing((int)20.5); // int a = 20.5 => int a = (int)20.5;
		byte y = 30;
		testing(y); // no need of converting from lower to higher, you need to convert from higher to lower, int a = y;
		double a = 20.59999; // 20.5
		double b = 30.59999;
		double c = a/b;
		System.out.println(c); //printing double value
	}

	// it is possible to create any number of methods here
	public static void testing(int a) {
		System.out.println("a = "+a);
		System.out.println("----------------------");
	}
}
