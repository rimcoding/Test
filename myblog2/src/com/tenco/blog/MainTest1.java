package com.tenco.blog;

import com.tenco.blog.controller.Acontroller;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDto;

public class MainTest1 {

	public static void main(String[] args) {
		
		// main -> AC -> AS -> AD
		// 결과를 받아보기
		Acontroller ac = new Acontroller();
		String acResult = ac.select("혼자함");
		System.out.println(acResult);
		
		
		UserController controller = new UserController();
		UserDto acResult2 = controller.select(1);
		System.out.println(acResult2);
	}
}
