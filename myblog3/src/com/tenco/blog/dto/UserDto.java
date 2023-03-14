package com.tenco.blog.dto;

public class UserDto {
	private int id;
	private String username;
	private String password;
	private String address;
	
	public UserDto() {
	}
	
	public UserDto(String username, String password, String address) {
		
		this.username = username;
		this.password = password;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", username=" + username + ", password=" + password + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
