package com.hsbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class TestTransaction {

	public static void main(String[] args) {
		try {
			Connection con = DBUtility.getConnection();
			Scanner scan = new Scanner(System.in);
			con.setAutoCommit(false); // you need to use commit() to see the changes in the table
			PreparedStatement pstmt = con.prepareStatement("insert into employee(name, dob) values(?, ?)");
			for(int i = 1; i <= 5; i++) {
				System.out.println("Enter name");
				pstmt.setString(1, scan.next());
				System.out.println("Enter dob");
				pstmt.setDate(2, Date.valueOf(LocalDate.parse(scan.next())));
				pstmt.executeUpdate();
				if(i == 3) {
					con.rollback();
				}
			}
			con.commit();
			pstmt.close();
			scan.close();
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
