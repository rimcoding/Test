package com.tenco.blog.service;

import com.tenco.blog.dao.UserDao;
import com.tenco.blog.dto.UserDto;

public class UserSevice {

	private UserDao userDao;
	
	public UserSevice() {
		userDao = new UserDao();
	}
	
	//입력 안했을때 입력하라고 뜸
	public String signUp(UserDto user) {
		
		String msg = "";
		if (user.getUsername().equals("")) {
			msg = "사용자 이름을 입력해주세요";
			System.out.println(msg);
			return msg;
		}
		int userDto = userDao.save(user);
		return userDto + "";
		}
	
	//회원정보 찾기
	public UserDto chechkUser(String username, String password) {
		
		boolean isValid = true;
		
		if (username.equals("")) {
			isValid = false;
		}else if(username.equals("")) {
			isValid = false;
		}
		
		UserDto userDto = null;
		if (isValid) {
			userDto = userDao.select(username, password);
		}
			return userDto;
	}
	
	public void deleteByuserId(String username, String password) {
		
		UserDto dto = chechkUser(username, password);
		if (username == dto.getUsername()) {
			userDao.delete(username, password);
		}
		userDao.delete(username, password);
	}
		
		

}
