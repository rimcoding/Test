package com.tenco.blog.controller;

import com.tenco.blog.dto.BlogDto;
import com.tenco.blog.service.Blogservice;

public class BlogController {

	private Blogservice blogservice;
	
	public BlogController() {
		blogservice = new Blogservice();
	}
	//외부에서 오는 요청을 담당하는 녀석
	public BlogDto requestBoardContentById(int id) {
		BlogDto responseDto = blogservice.selectByBoardId(id);
		return responseDto;
	}
	
	//하나의 게시글 삭제하기
	public int requestDeleteBoardById(int boardId, int userId) {
		
		int responseRow =  blogservice.deleteBoardById(boardId, userId);
		
		return responseRow;
	}
}
