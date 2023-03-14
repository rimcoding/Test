package com.tenco.blog.service;

import com.tenco.blog.dao.BlogDao;
import com.tenco.blog.dao.IBlogDao;
import com.tenco.blog.dto.BlogDto;

public class Blogservice {

	private BlogDao blogDao;
	
	public Blogservice() {
		blogDao = new BlogDao();
	}
	
	// 하나의 게시글 찾는 로직
	public BlogDto selectByBoardId(int id) {
		
		BlogDto resultDto = blogDao.select(id);
		
		return resultDto;
	}
	
	public int deleteBoardById(int boardId, int userId) {
		int resultRow = 0;
		// 검증 userId 값과 board 테이블에 있는 작성자에 usetId 값이 같은지 확인
		BlogDto blogDto = selectByBoardId(boardId);
		if (blogDto != null) {
			int blogWriterId = blogDto.getUserId();
			if (blogWriterId == userId) {
				// 삭제 요청
				resultRow = blogDao.delete(boardId);
			}
		}
		return resultRow;
	}
	
}
