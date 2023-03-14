package com.tenco.blog.controller;

import com.tenco.blog.dto.UserDto;
import com.tenco.blog.service.UserSevice;

public class UserController {
	
	private UserSevice userSevice;
	
	public UserController() {
		userSevice = new UserSevice();
	}
	
	public String requestSignUP(UserDto user,String host) {
		String response = "외부에서는 회원가입이 안됩니다.";
		if (host.equals("localhost")) {
			response = userSevice.signUp(user);
		}
		return response;
	}
	public UserDto SingIn(String username, String password) {
		
		UserDto responseUserDto = userSevice.chechkUser(username, password);
		return responseUserDto;
	}
	public void userIdDelete(String username,String password) {
		
		userSevice.deleteByuserId(username, password);
	}
}
