package com.tenco.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.blog.dto.UserDto;
import com.tenco.blog.utils.DbHelper;

public class UserDao implements IUserDao {
	
	private DbHelper dbHelper;

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public UserDao() {
		dbHelper = new DbHelper();
		conn = dbHelper.getConnection();
	}
	
	@Override
	public int save(UserDto user) {
		
		String query = " INSERT INTO user(username, password, address) "
				+ " VALUES "
				+ "    ( ? , ? , ? ) ";
		
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt .setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getAddress());
			resultRow = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println(" >> userDao save 에서 에러 발생 <<");
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public UserDto select(String username, String password) {
		
		UserDto resultUser = null;
		
		String query = " SELECT * "
				+ " FROM user "
				+ " WHERE username = ? AND password = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserDto dto = new UserDto();
				dto.setId(rs.getInt("id"));
				dto.setUsername(rs.getString("username"));
				dto.setPassword(rs.getString("password"));
				dto.setAddress(rs.getString("address"));
				resultUser = dto;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultUser;
	}

	
	@Override
	public void delete(String username,String password) {
		
		String query = " DELETE FROM user "
								+ "WHERE username = ? AND password = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("UserDao delete 에러 발생");
			e.printStackTrace();
		}
		
	}

	

}
