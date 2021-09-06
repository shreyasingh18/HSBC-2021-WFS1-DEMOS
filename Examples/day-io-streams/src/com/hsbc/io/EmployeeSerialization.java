package com.hsbc.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Date;

import com.hsbc.beans.Employee;

public class EmployeeSerialization {

	public static void main(String[] args) {
		try {
			// String format = yyyy-MM-dd
			Employee emp1 = new Employee(100, "Alex", LocalDate.parse("2000-11-20")); // Name = Alex, Id = 101, Dob = 2000-11-20
			Date date = new Date(100, 11, 30); // 1900 + 2000
			System.out.println(date);
			System.out.println(emp1);
			// the above object will be lost once the program exits
			FileOutputStream fos = new FileOutputStream("employees.ser"); 
			ObjectOutputStream oos = new ObjectOutputStream(fos); // this should know where to write the object
			// the below statement writes the object, but before writing it checks if the object is of Serializable type
			oos.writeObject(emp1); // emp1 instanceof Serializable -> write to the file
			oos.flush();
			fos.flush();
			oos.close();
			fos.close();
			System.out.println("Object is written successfully");
		} catch(Exception e) { // this is not a good practice
			e.printStackTrace();
		}
	}

}
