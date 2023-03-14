package com.tenco.blog.utils;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * Connection 객체를 생성하고 반환하는 처리
 *
 */
public class DbHelper {

	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "myblog";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "bloguser";
	private static final String DB_PASSWORD = "1q2w3e4r5t";
	
	private Connection conn;
	
	// 싱글톤 패턴
	//1.기본 생성자를 만들어서 private 설정 (다른곳에서 접근 못하게) 
	private DbHelper() {}
	
	//2. 자기 자신을 private으로 선언
	private static DbHelper dbHelper;
	
	//3. 어디서든지 접근 가능한 static  메소드를 만들어 준다.
	// 메소드를 호출해야지만 주소값을 받을 수 있다.
	public static DbHelper getInstance() {
		if (dbHelper == null) {
			dbHelper = new DbHelper();
		}
		return dbHelper;
	}
	
	public Connection getConnection() {
		if(conn == null) {
			// 한번도 생성하지 않았다면 동작
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
				System.out.println(">> DB 연결 완료 <<");
			} catch (Exception e) {
				System.out.println(">> DBHelper 에서 오류가 발생 했어! <<");
				e.printStackTrace();
			}
		}
		// todo 추후 삭제 예정
		//System.out.println(" DbHelper 안에서 주소 찍어 보기 " + this);
		return conn;
	}
	
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn = null;
	}
	
	
}
