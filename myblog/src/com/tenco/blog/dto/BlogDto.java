package com.tenco.blog.dto;

//클래스명 바꾸는법 알트 + 쉬프트 + r
public class BlogDto {
	
	private int id;
	private String title;
	private String content;
	private int readCount;
	private int userId;
	
	
	@Override
	public String toString() {
		return "BlogDto [id=" + id + ", title=" + title + ", content=" + content + ", readCount=" + readCount
				+ ", userId=" + userId + "]";
	}

	public BlogDto() {
		
	}
	
	public BlogDto(String title, String content, int userId) {
		this.title = title;
		this.content = content;
		this.userId = userId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}
