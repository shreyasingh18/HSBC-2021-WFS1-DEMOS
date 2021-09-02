package com.hsbc;

import java.util.Scanner;

public class TestMultiCatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string in number format");
		try {
			// it converts string to integer
			int x = Integer.parseInt(scan.next()); // scan.next() reads String 
			System.out.println("Enter some number to divide");
			int y = scan.nextInt();
			int result = x /y;
			System.out.println("Result = "+result);
		} catch(NumberFormatException e) {
			System.err.println("catching number format exception");
			e.printStackTrace();
		} catch(Exception e) { // this can catch all the types of exceptions
			System.err.println("catching all the exceptions");
			e.printStackTrace();
		}
		scan.close();
	}
}
