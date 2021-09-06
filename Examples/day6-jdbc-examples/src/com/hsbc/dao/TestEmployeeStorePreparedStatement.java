package com.hsbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import com.hsbc.beans.Employee;
import com.mysql.cj.jdbc.Driver;

public class TestEmployeeStorePreparedStatement {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter name");
			Employee emp = new Employee();
			emp.setName(scan.next());
			System.out.println("Enter dob");
			emp.setDob(LocalDate.parse(scan.next()));
			// above code initializes employee object
			Class.forName(Driver.class.getName());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsbc_db", "root", "root");
			//String insertQuery = "insert into employee(name, dob) values('"+emp.getName()+"', '"+emp.getDob().toString()+"')";
			String insertQuery = "insert into employee(name, dob) values(?, ?)";
			PreparedStatement pstmt = con.prepareStatement(insertQuery); //? should get value from the setter methods
			pstmt.setString(1, emp.getName()); // 1st ? gets value of employee name
			pstmt.setDate(2, Date.valueOf(emp.getDob())); // 2nd ? maps to date, but we need convert LocalDate to Date
			int count = pstmt.executeUpdate(); 
			System.out.println("Count: "+count);
			pstmt.close();
			con.close();
			scan.close();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
