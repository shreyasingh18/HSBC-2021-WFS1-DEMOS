package com.hsbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBUtility {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(Driver.class.getName());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsbc_db?useSSL=false", "root", "root");
		return con;
	}
}
