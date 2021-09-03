package com.hsbc.exceptions;

import java.sql.SQLException;

class DBOperations { 
	void store(int data) {
		System.out.println("store() method starts");
		// suppose you got some exception while performing operation in the database
		if(data < 0) {
			throw new RuntimeException("data is < 0 hence you got RuntimeException"); // unchecked exception
		}
		if(data > 50) {
			try { 
				throw new SQLException("data is > 50 hence you got SQLException"); // checked exception
			} catch(SQLException e) {
				System.err.println(e);
				System.err.println(e.getMessage());
			}
		}
		System.out.println("store() method ends");
	}
}
class ServiceOperation { 
	void find(int data) throws SQLException {
		System.out.println("find() method starts");
		if(data > 50) {
			// either handle using try-catch or propagate using throws
			throw new SQLException("data is > 50 hence you got SQLException");
			// here we are throwing predefined exception
		}
		System.out.println("find() method ends");
	}
}
public class TestCheckedExceptions {

	public static void main(String[] args) {
		
		ServiceOperation so = new ServiceOperation();
		try {
			so.find(70); // if there's an exception then it will be definitely handled here
		} catch (SQLException e) {
			System.err.println(e); // caller is using console
		} 
		System.out.println("program exits");
	}

}
