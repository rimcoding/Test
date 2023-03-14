package com.tenco.blog.service;

import com.tenco.blog.dao.UserDao;
import com.tenco.blog.dto.UserDto;

public class Userservice {

	private UserDao userDao;
	
	public Userservice() {
		userDao = new UserDao();
	}
	public UserDto select(int id) {
		
		UserDto resultDto = userDao.select(id);
		return resultDto;
	
	}
}
