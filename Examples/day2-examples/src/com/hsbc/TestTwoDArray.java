package com.hsbc;

public class TestTwoDArray {

	public static void main(String[] args) {
		// In c or c++ you need to have same size for each row & column but in java its not mandatory
		// you can create different sized elements for each row
		String[][] strings = {{"Hello", "Welcome", "Bye"}, {"Abc", "Xyz"}};
		System.out.println("Outer Array Length: "+strings.length);
		System.out.println("Inner Array(0) Length: "+strings[0].length);
		System.out.println("Inner Array(1) Length: "+strings[1].length);
		
		// iterate outer array, it iterates 0th & 1st index
		for(int i = 0; i < strings.length; i++) {
			// iterate inner array, it iterates based on the number elements each row of the outer array
			for(int j = 0; j < strings[i].length; j++) {
				System.out.print(strings[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("---- Using enhanced for loop ------");
		for(String[] x : strings) {
			for(String y : x) {
				System.out.print("y = "+y + " ");
			}
			System.out.println();
		}
	}
}
