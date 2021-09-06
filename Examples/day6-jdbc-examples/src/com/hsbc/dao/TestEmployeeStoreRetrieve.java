package com.hsbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import com.hsbc.beans.Employee;
import com.mysql.cj.jdbc.Driver;

public class TestEmployeeStoreRetrieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter name");
		emp.setName(scan.next());
		System.out.println("Enter dob");
		emp.setDob(LocalDate.parse(scan.next()));
		try {
			Class.forName(Driver.class.getName());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsbc_db", "root", "root");
			Statement stmt = con.createStatement();
			String insertQuery = "insert into employee(name, dob) values('"+emp.getName()+"', '"+emp.getDob().toString()+"')";
			int updatedCount = stmt.executeUpdate(insertQuery);
			System.out.println("Updated Count: "+updatedCount);
			// Performing retrieve operation based on id 
			String selectQuery = "select * from employee";
			ResultSet rs = stmt.executeQuery(selectQuery);
			while(rs.next()) {
				int id = rs.getInt("id");				// int id = 10;						emp.setID(id);
				String name = rs.getString("name");		// String name = "Alex"				emp.setName(name);
				Date dob = rs.getDate("dob");			// Date dob = new Date(......);		emp.setDob(dob);
				LocalDate ld = dob.toLocalDate();
				Employee employee1 = new Employee(id, name, ld);
				Employee employee2 = new Employee(rs.getInt("id"), rs.getString("name"), rs.getDate("dob").toLocalDate());
				System.out.println(employee1);
				System.out.println(employee2);
				System.out.println("----------------------");
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		scan.close();
	}
}
