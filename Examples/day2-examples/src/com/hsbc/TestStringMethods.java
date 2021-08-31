package com.hsbc;

public class TestStringMethods {

	public static void main(String[] args) {
		// string objects are created directly when you assign a string
		String str = "Hello how are you";
		System.out.println("Length: "+str.length()); // length of the string
		System.out.println("Value: "+str); // prints the complete value
		System.out.println("Character at a index: "+str.charAt(2)); // returns a character at 2nd index
		System.out.println("To Uppercase: "+str.toUpperCase());
		System.out.println("Value: "+str);
		System.out.println("Concat: "+str.concat("Welcome to Java"));
		// split method splits the strings into multiple string based on the delimeter
		String[] multipleStrings = str.split(" ");
		System.out.println("-----delimiter is space----");
		System.out.println("Multiple Strings Size: "+multipleStrings.length);
		for(String s : multipleStrings) {
			System.out.println(s);
		}
		String[] anotherStrings = str.split("o");
		System.out.println("-----delimiter is o-----");
		for(String s : anotherStrings) {
			System.out.println(s);
		}
		System.out.println("---- Equals methods is to compare 2 strings -------");
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "HELLO";
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // false
		System.out.println(s1.equalsIgnoreCase(s3)); // true
	}

}
