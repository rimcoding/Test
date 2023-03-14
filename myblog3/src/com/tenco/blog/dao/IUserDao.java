package com.tenco.blog.dao;

import com.tenco.blog.dto.UserDto;

public interface IUserDao {
	
	int save(UserDto user);
	UserDto select(String username, String password);
	void delete(String username,String password);
	
}
