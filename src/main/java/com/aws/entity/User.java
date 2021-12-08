package com.aws.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class User {
	@Id
	private int userId;
	private String userName;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
