package com.tenco.blog.dao;

import com.tenco.blog.dto.UserDto;

public class UserDao {

	
	public UserDao() {
		
	}
	
	// 1. UserDTO 를 만들어 보세요.
	public UserDto select(int userId) {
		
		//UserDTO 개체를 임의에 값을 넣어서 생성하고
		// 그결과값을 main 함수에서 출력하시오.
		UserDto kimUser = new UserDto(1, "미스터김");
		
		return kimUser;
		
		//DB에 맞는 부분을 연동하고 싶다면
		//거기에 맞는 기술들을 알아보고 분석해서 준비 하면 된다.
		
		//MySQL <-- 데이터 관리 (다중 접속 가능)
		// 드라이버..
		
		// Connection 객체가 필요 하다.
		// 주소,계정, 비번 , 데이터베이스 ,이름, 포트번호, 사용할 문자셋, 현지 시간
		
		//Connection 에서 연결자리 외 또 많이 하는 작업은
		//SQL 을 만들고 실행하는 일이다.
		//SQL 질의어를 만들기 위해선 Statement 객체가 필요하다.
		
		//connection 객체에서 Statement, PrepareStatement를 생성할 수 있다.
		//connection.createStatement() OR
		// connection.prepareStatement() 를 사용할 수 있다.
		// ? ? 에 값을 바인딩 하는 기능
		
		//prepareStatement 질의어를 생성하고 잘의어를 실행시킬 수 이싿.
		//select <-- executeQuery(0 사용 하면 된다.
		// delete, update, insert <-- executeUpdate() 사용 하면 된다.
		
		//쿼리를 실행하면 결과값은
		//executeQuery() --> ReseultSet 을 반환 한다.
		//executeUpdate() --> 적용받은 row 갯수를 반환 한다.
		
	}
}
