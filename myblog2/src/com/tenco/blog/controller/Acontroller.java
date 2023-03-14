package com.tenco.blog.controller;

import com.tenco.blog.dao.ADao;
import com.tenco.blog.service.AService;

public class Acontroller {

	private AService aService;
	
	public Acontroller() {
		aService = new AService();
	}
	
	public String select(String msg) {
		
		String result1 = aService.select(msg);
		
		return result1;
	};
}
