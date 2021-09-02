package com.hsbc;

import java.util.Scanner;

public class TestExceptions1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] items = {3, 4, 1, 2, 5};
		try {
			System.out.println("Items at specific index: "+items[8]); // accessing the index
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catching AIOBE:"+e.getMessage());
			System.out.println("catching AIOBE: "+e);
		}
		// let us read two int & divide them
		
		try {
			System.out.println("Enter two numbers:-");
			int x = scan.nextInt(); // chance of Input mistmatch Exception
			int y = scan.nextInt();
			int result = x/y; // chance of ArithmeticException object
			System.out.println("Result = "+result);
		} catch(ArithmeticException e) {
			System.out.println("catching AE: "+e.getMessage());
			System.out.println("catching AE: "+e);
		} finally {
			System.out.println("This is finally block statement");
		} /*
		 	* finally is executed when exception occurs & handled, 
		 	* when exception occurs but not handled, 
		 	* when there's no exception
		 	* program exits normally only if exception is handled or if exception is not occured
		*/
		System.out.println("--- Program exits normally ---");
		scan.close();
	}
}
