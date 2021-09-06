package com.hsbc.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.hsbc.beans.Employee;

public class EmployeeDeserialization {

	public static void main(String[] args) {
		// this has to read employee object
		try {
			// read the bytestream from the file
			FileInputStream fis = new FileInputStream("employees.ser");
			ObjectInputStream ois = new ObjectInputStream(fis); 
			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);
			
			ois.close();
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
