package com.hsbc;

import java.util.Scanner;

public class TestLoops {

	public static void main(String[] args) {
		System.out.println("---- For Loop ----");
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = "+i);
		}
		System.out.println("---- While Loop ----");
		// while loop can be used when you don't have idea how many times to iterate
		// Ex: while reading the file you want to read until end of the file
		int counter = 10;
		while(counter > 0) {
			System.out.println("Counter: "+counter);
			counter--;
		}
		System.out.println("---- Do-While Loop ----");
		Scanner sc = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("1: Withdraw 2: Change Pin 3: Check Balance 4: Exit");
			option = sc.nextInt();
			System.out.println("You have entered option no: "+option);
		} while (option != 4);
		sc.close();
	}

}
