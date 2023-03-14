package com.tenco.blog;

import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDto;
import com.tenco.blog.utils.DbHelper;

public class MainTest1 {
	
	public static void main(String[] args) {
	
		// 저장하는 기능
		UserDto userDto = new UserDto("아이유", "12345", "부산");
		UserController userController = new UserController();
		String result = userController.requestSignUP(userDto, "localhost");
		System.out.println(result);
		
		//찾는 기능
//		UserDto loginUser = userController.SingIn("홍길동", "1234");
//		System.out.println(loginUser.getUsername());
//		
		//
		//제거 기능
//		UserDto loginUser = userController.SingIn("홍길동", "1234");
//		System.out.println(loginUser);
//		userController.userIdDelete("홍길동", "1234");
		
	}
}
