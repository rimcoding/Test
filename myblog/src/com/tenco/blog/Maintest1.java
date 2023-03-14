package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.dto.BlogDto;
import com.tenco.blog.utils.DbHelper;

public class Maintest1 {

	public static void main(String[] args) {
		
		//코드 테스트
		//		DbHelper dbHelper = DbHelper.getInstance();
		//		dbHelper.getConnection();
		//		System.out.println("main 에서 주소값 찍음 :" +dbHelper);
		
		BlogController blogController = new BlogController();
//		BlogDto dto = blogController.requestBoardContentById(30);
//		System.out.println(dto);
		
		int result = blogController.requestDeleteBoardById(3, 2);
		System.out.println(result);
	}

}
