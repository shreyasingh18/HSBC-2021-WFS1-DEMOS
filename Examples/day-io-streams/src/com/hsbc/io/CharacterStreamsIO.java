package com.hsbc.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CharacterStreamsIO {

	public static void main(String[] args) {
		// create on text file in your project and perform IO operation
		try {
			// creating a reference of the file you want to read
			FileReader reader = new FileReader("welcome.txt");
			// creates a reference to the file you want to write
			FileWriter writer = new FileWriter("hello.txt");
			/*
			 *  you have a method read() inside the FileReader to perform read operation
			 *  read() returns the ASCII code at the time of reading and converts the ASCII code to corresponding
			 *  character while writing, it means read() returns int, write(int) takes int
			 */
			int ch = 0;
			int loopCounter = 0;
			while((ch = reader.read()) != -1) {
				writer.write(ch); // writes the character of the corresponding ASCII code
				loopCounter++;
			}
			writer.flush(); 
			writer.close();
			reader.close();
			System.out.println("DONE!");
			System.out.println("Loop Counter: "+loopCounter);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
