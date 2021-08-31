package com.hsbc;

public class TestMethodOverloading {

	public static void main(String[] args) {
		Calculator calci = new Calculator();
		int result = calci.add(20, 30); // 20 
		System.out.println("Result: "+result);
		double doubleValue = calci.add(20.20, 30); // 20.20 -> double, 30 -> int add(double, double)
		System.out.println("Result: "+doubleValue);
		int[] items = {30, 40, 10, 20, 50};
		int sumResult = calci.sum(items);
		System.out.println("Sum Result: "+sumResult);
	}

}
