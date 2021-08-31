package com.hsbc;

import java.util.Scanner;

public class TestOneDArray {

	public static void main(String[] args) {
		// syntax: datatype[] variableName = new datatype[array_size];
		int[] items; // here only variable is created
		items = new int[3]; // a memory of size 3 is created to store 3 integers
		int[] intArray = new int[5]; // intArray can store 5 integers
		String[] stringArray = new String[4]; //stringArray can store 4 Strings
		double[] doubleArray = new double[5]; // doubleArray can store 5 doubles;
		
		// initializing the array
		items[0] = 50;
		items[1] = 10;
		items[2] = 20;
		System.out.println("Length of items: "+items.length);
		System.out.println("Length of intArray: "+intArray.length);
		System.out.println("Length of stringArray: "+stringArray.length);
		System.out.println("Length of doubleArray: "+doubleArray.length);
		
		// you want to iterate the array you can use for-loop
		for(int i = 0; i < items.length; i++) {
			System.out.println("Items["+i+"] = "+items[i]);
		}
		System.out.println("--------------------");
		for(int i = 0; i < stringArray.length; i++) {
			System.out.println("String["+i+"] = "+stringArray[i]);
		}
		// try to take input from the keyboard and assign values to the string and double array and display it again
		Scanner sc = new Scanner(System.in);
		System.out.println("--- Adding elements to the double & string ----");
		for(int i = 0; i < doubleArray.length; i++) {
			System.out.println("Enter double value");
			doubleArray[i] = sc.nextDouble();
		}
		for(int i = 0; i < stringArray.length; i++) {
			System.out.println("Enter string value");
			stringArray[i] = sc.next();
		}
		// displaying the items in the array using enhanced for-loop/for-each: for(type var : collection)
		System.out.println("--- iterating items using for-each loop ----");
		for(int item : items) { // items = {50, 10, 20} , item = 50
			System.out.println("Item: "+item); // items[50]  - 0, 1 , 2
		}	
		
		sc.close();
	}

}
