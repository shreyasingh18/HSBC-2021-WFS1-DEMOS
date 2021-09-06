package com.hsbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;
import com.mysql.cj.jdbc.Driver;
public class TestEmployeeStore {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			Class.forName(Driver.class.getName()); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsbc_db", "root", "root");
			Statement stmt = con.createStatement();
			System.out.println("Enter name:");
			String name = scan.next();
			System.out.println("Enter dob in yyyy-MM-dd format");
			LocalDate dob = LocalDate.parse(scan.next());
			String insertQuery = "insert into employee(name, dob) values('"+name+"', '"+dob.toString()+"')";
			int updatedCount = stmt.executeUpdate(insertQuery);
			System.out.println("Updated Count: "+updatedCount);
			stmt.close();
			con.close();
			scan.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
