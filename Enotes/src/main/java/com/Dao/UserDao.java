package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.User.UserDetails;

public class UserDao {
	private Connection conn;
	
	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean addUser(UserDetails us) {
		boolean f = false;
		
		try {
			String query = "INSERT INTO USER (NAME, EMAIL, PASSWORD) VALUES (?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, us.getName());
			ps.setString(2, us.getEmail());
			ps.setString(3, us.getPassword());
			int i =ps.executeUpdate();
			if(i == 1) {
				f = true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	public UserDetails loginuser(UserDetails us) {
		UserDetails  user = null;  
		try {
			String qurey = "SELECT * FROM USER WHERE EMAIL = ? AND PASSWORD = ?";
			PreparedStatement ps = conn.prepareStatement(qurey);
			ps.setString(1,us.getEmail());
			ps.setString(2,us.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				user = new UserDetails();
				user.setId(rs.getInt("id"));
	            user.setName(rs.getString("name")); // Retrieve the name from the result
	            user.setEmail(rs.getString("email")); // Set email from the parameter
	            user.setPassword(rs.getString("password")); // Set password from the parameter
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	
}
