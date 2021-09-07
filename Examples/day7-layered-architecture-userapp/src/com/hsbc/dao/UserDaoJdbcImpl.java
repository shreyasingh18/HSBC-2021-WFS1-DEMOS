package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.beans.User;
import com.hsbc.exceptions.UserNotFoundException;

public class UserDaoJdbcImpl implements UserDao {
	public UserDaoJdbcImpl() {
		System.out.println("UserDaoJdbcImpl() is created");
	}

	@Override
	public int save(User user) {
		int id = 0;
		try {
			Connection con = DBUtility.getConnection();
			String insertQuery = "insert into users(user_name, user_phone) values(?, ?)";
			PreparedStatement pstmt = con.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, user.getName()); 
			pstmt.setLong(2, user.getPhone());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys(); // get the generated key
			while(rs.next()) {
				id = rs.getInt(1);
			}
			pstmt.close();
			con.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		if(id == 0) 
			throw new RuntimeException("Storing in the DB failed"); // if id is 0 it means store failed
		return id;
	}

	@Override
	public User findById(int id) throws UserNotFoundException {
		User user = null;
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from users where user_id = ?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery(); 
			while(rs.next()) {
				user = new User();
				user.setUserId(rs.getInt("user_id"));
				user.setName(rs.getString("user_name"));
				user.setPhone(rs.getLong("user_phone"));
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User[] findAll() {
		User[] users = null;
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from users");
			ResultSet rs = pstmt.executeQuery(); 
			List<User> list = new ArrayList<User>();
			while(rs.next()) {
				User user = new User();
				user.setUserId(rs.getInt("user_id"));
				user.setName(rs.getString("user_name"));
				user.setPhone(rs.getLong("user_phone"));
				list.add(user);
			}
			users = list.toArray(new User[list.size()]);
			rs.close();
			pstmt.close();
			con.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
}
