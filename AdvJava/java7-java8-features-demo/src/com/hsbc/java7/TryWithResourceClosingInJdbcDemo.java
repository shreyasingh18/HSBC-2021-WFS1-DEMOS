package com.hsbc.java7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TryWithResourceClosingInJdbcDemo {

	public static void main(String[] args) {
		try  {
			Class.forName(Driver.class.getName());
			try ( 
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsbc_db?useSSL=false", "root","root");
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("select * from users");
					
					) {
				while(rs.next()) {
					System.out.println("Id = "+rs.getInt("user_id")+
							", Name = "+rs.getString("user_name")+", Phone = "+rs.getLong("user_phone"));
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
/*
 *  try - catch, try - finally 
 * 
 * */
