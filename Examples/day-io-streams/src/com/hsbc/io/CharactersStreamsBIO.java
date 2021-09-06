package com.hsbc.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharactersStreamsBIO {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("welcome.txt");
			BufferedReader readBuffer = new BufferedReader(reader);
			
			FileWriter writer = new FileWriter("hello.txt");
			BufferedWriter writeBuffer = new BufferedWriter(writer);
			
			String line = null;
			int loopCounter = 0;
			do {
				line = readBuffer.readLine(); // readLine() returns null if there's not text to read
				if(line != null) {
					writeBuffer.write(line);
					writeBuffer.newLine();
				}
				loopCounter++;
			} while(line != null); 
			writeBuffer.flush();
			writer.flush();
			writeBuffer.close();
			readBuffer.close();
			writer.close();
			reader.close();
			System.out.println("Done!");
			System.out.println("Loop Counter: "+loopCounter);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
