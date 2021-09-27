package com.hsbc.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.beans.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public void save(Employee employee) {
		jdbc.update("insert into employee(name, salary) values(?,?)", employee.getName(), employee.getSalary());
	}

	@Override
	public List<Employee> fetchEmployees() {
		List<Employee> list = jdbc.query("select * from employee", 
				(rs, rowNum)->  new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary")));
		return list;
	}
}
