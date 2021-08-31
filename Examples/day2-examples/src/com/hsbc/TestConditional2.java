package com.hsbc;

import java.util.Scanner;

public class TestConditional2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		double marks = sc.nextDouble();
		if(marks >= 70)
			System.out.println("First Class with Distinction: "+marks);
		else if (marks < 70 && marks >= 60)
			System.out.println("First class: "+marks);
		else if (marks < 60 && marks >= 50)
			System.out.println("Second class: "+marks);
		else if (marks < 50 && marks >= 35)
			System.out.println("Pass: "+marks);
		else 
			System.out.println("Fail: "+marks);
		
		sc.close();
	}

}
