package com.hsbc;

import java.util.Scanner;

public class TestConditional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// We will take an int value and mention whether its odd or even - %
		System.out.println("Enter a number to find odd or even");
		int num = sc.nextInt();
		if(num == 0) {
			System.out.println(num+ " is neutral");
		}
		else if(num % 2 == 0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}
		System.out.println("End of the program");
		// closing to avoid resource leak warning
		sc.close();
	}

}
