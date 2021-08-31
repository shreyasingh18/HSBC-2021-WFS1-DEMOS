package com.hsbc;

public class Calculator {
	// add 2 int & return the result
	public int add(int a, int b) {
		System.out.println("add(int, int)");
		return (a + b);
	}
	
	public double add(double a, double b) {
		System.out.println("add(double, double)");
		return (a + b);
	}
	// 2, 1, 3
	public int sum(int[] arr) {
		int result = 0; // x = 6
		for(int i : arr) {
			result = result + i;
		}
		return result;
	}
}

/*
 * 
 * 
 *  Calculator calci = new Calculator();
 *  int res = calci.add(10, 20);
 * 
 * 
 */
