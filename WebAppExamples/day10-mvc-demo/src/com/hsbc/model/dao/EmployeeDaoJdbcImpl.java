package com.hsbc.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.beans.Employee;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	@Override
	public int save(Employee employee) {
		int generatedId = 0;
		try {
			Connection connection = DBUtility.getConnection();
			String insertQuery = "insert into employee(name, dob) values(?, ?)";
			PreparedStatement statement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, employee.getName());
			statement.setDate(2, Date.valueOf(employee.getDob()));
			statement.executeUpdate();
			ResultSet keys = statement.getGeneratedKeys();
			while(keys.next()) {
				generatedId = keys.getInt(1);
			}
			keys.close();
			statement.close();
			connection.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return generatedId;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = new ArrayList<Employee>(); 
		try {
			Connection connection = DBUtility.getConnection();
			String selectQuery = "select * from employee";
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				Employee employee = new Employee();
				employee.setId(result.getInt("id"));
				employee.setName(result.getString("name"));
				employee.setDob(result.getDate("dob").toLocalDate());
				employees.add(employee);
			}
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return employees;
	}

	@Override
	public Employee findById(int id) {
		Employee employee = null;
		try {
			Connection connection = DBUtility.getConnection();
			String selectQuery = "select * from employee where id = ?";
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				employee = new Employee();
				employee.setId(result.getInt("id"));
				employee.setName(result.getString("name"));
				employee.setDob(result.getDate("dob").toLocalDate());
			}
			result.close();
			statement.close();
			connection.close();
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return employee;
	}

}
