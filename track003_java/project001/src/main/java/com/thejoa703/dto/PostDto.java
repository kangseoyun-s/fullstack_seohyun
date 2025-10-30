package com.thejoa703.dto;

import java.time.LocalDateTime;

public class PostDto {
	private int id;
	private int AppUserId;
	private String title;
	private String content;
	private String pass;
	private LocalDateTime createdAt; 
	private int hit;
	private String email;
	// 생성자 / toString / get+set
	
	public PostDto(int id, int AppUserId, String title, String content, String pass, LocalDateTime createdAt, int hit,
			String email) {
		super();
		this.id = id;
		this.AppUserId = AppUserId;
		this.title = title;
		this.content = content;
		this.pass = pass;
		this.createdAt = createdAt;
		this.hit = hit;
		this.email = email;
	}
	public PostDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PostDto(int id, int appUserId, String title, String content, String pass, LocalDateTime createdAt, int hit) {
		super();
		this.id = id;
		this.AppUserId = appUserId;
		this.title = title;
		this.content = content;
		this.pass = pass;
		this.createdAt = createdAt;
		this.hit = hit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAppUserId() {
		return AppUserId;
	}
	public void setAppUserId(int AppUserId) {
		this.AppUserId = AppUserId;
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "PostDto [id=" + id + ", appUserId=" + AppUserId + ", title=" + title + ", content=" + content
				+ ", pass=" + pass + ", createdAt=" + createdAt + ", hit=" + hit + "]";
	}
	
}
