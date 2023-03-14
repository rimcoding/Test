package com.tenco.blog.dao;

import com.tenco.blog.dto.BlogDto;

public interface IBlogDao {
		
	// 메서드 오버로딩
	void select();	//전체 조회
	BlogDto select(int id);	//아이디 기반으로 조회
	
	int delete(int boardId);	
}
