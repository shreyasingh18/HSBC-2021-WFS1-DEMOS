package com.hsbc;

import java.util.Scanner;

public class TestConditionalSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// switch can be used for int, char, String, enum
		System.out.println("Enter valid options:-");
		System.out.println("1: Withdraw 2: Check Balance 3: Change Pin");
		int option = sc.nextInt();
		switch(option) {
			case 1 : System.out.println("Withdrawing amount");
			break;
	
			case 2 : System.out.println("Checking Balance");
			break;
	
			case 3 : System.out.println("Changing Pin");
			break;
			
			default : 
				System.out.println("None of the case match");
		}
		sc.close();
	}
}
