package com.hsbc.java7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourceClosingDemo {

	public static void main(String[] args) {
		
		try (
				Scanner scan = new Scanner(System.in);
				FileWriter writer = new FileWriter("abc.txt", true);
				BufferedWriter buffer = new BufferedWriter(writer)
				) {
			System.out.println("Enter some content");
			String content = scan.nextLine();
			buffer.write(content);
			buffer.newLine();
			// auto flush & close happens
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done..");
	}
}
