package com;
import java.util.Scanner;
public class TestTakingInput {

	public static void main(String[] args) {
		// We have Scanner class - java.util.Scanner
		// java.lang.* classes are auto-imported
		// new is the keyword used to create object
		Scanner sc = new Scanner(System.in);
		// to read a single word you have next
		// to read an int you have nextInt()
		// to read a double you have nextDouble()
		// to read a boolean you have nextBoolean()
		// to read multiple words you have nextLine()
		System.out.println("Enter multiple words");
		String multipleWords = sc.nextLine();
		System.out.println("Enter a number");
		int num = sc.nextInt(); // this waits for user to enter an intValue
		System.out.println("Enter a word");
		String word = sc.next(); // this waits for user to enter a single word
		System.out.println("Enter a real number");
		double realNum = sc.nextDouble();
		System.out.println("Enter multiple words again");
		sc.nextLine(); // accepts enter key before actually reading the multiple words
		String anotherMultipleWords = sc.nextLine();
		System.out.println("Num = "+num+", Word = "+word+", Real Num = "+realNum);
		System.out.println("Multiple Words = "+multipleWords);
		System.out.println("Another Multiple Words = "+anotherMultipleWords);
		sc.close(); // this avoid resource leak issue
	}
}
