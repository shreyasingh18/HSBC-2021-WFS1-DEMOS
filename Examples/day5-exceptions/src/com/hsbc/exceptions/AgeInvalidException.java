package com.hsbc.exceptions;

/*
 * throw new AgeInvalidException() - this is calling default constructor
 * throw new AgeInvalidException(erroMessage) - this will call constructor taking String argument 
 */
public class AgeInvalidException extends Exception {

	public AgeInvalidException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeInvalidException(String message) {
		super(message); /* Warning: Avoid using System.out.println(message) or System.err.println(message) */
	}
	
}
