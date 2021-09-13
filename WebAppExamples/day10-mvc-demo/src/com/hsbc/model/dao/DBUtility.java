package com.hsbc.model.dao;
/*
 * Database Connectivity is established in the class
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBUtility {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(Driver.class.getName());
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsbc_db", "root", "root");
		return connection;
	}
}
