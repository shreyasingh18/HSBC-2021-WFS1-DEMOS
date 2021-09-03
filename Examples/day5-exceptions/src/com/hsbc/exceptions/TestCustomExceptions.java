package com.hsbc.exceptions;

import java.util.Scanner;

// Assume the below class is in service layer
class StudentService { 
	
	public String store(int age) throws AgeInvalidException {
		if(age < 5 || age > 30) {
			throw new AgeInvalidException("Age "+age+" is invalid for admission");
		}
		return "Student age stored is "+age;
	}
}
public class TestCustomExceptions {

	public static void main(String[] args) {
		// client code using service instance, for this example we are not using factory pattern
		StudentService service = new StudentService();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = scan.nextInt();
		String status;
		try {
			status = service.store(age);
			System.out.println(status);
		} catch (AgeInvalidException e) {
			/* if client is console then e.getMessage() should print in console
			 * if client is mobile then e.getMessage() should print in mobile
			 *  if client is web e.getMessage() should print in web page,  
			 */
			System.err.println(e.getMessage());
		}
		scan.close();
	}

}
