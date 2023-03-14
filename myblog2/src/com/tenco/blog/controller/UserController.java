package com.tenco.blog.controller;

import com.tenco.blog.dao.UserDao;
import com.tenco.blog.dto.UserDto;
import com.tenco.blog.service.Userservice;

public class UserController {

	private Userservice userservice;
	
	public  UserController() {
		userservice = new Userservice();
	}
	public UserDto select(int id) {
		UserDto responseDto = userservice.select(id);
		return responseDto;
		
		
	}

}
