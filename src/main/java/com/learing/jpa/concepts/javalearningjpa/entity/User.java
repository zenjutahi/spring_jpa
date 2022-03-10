package com.learing.jpa.concepts.javalearningjpa.entity;

public class User {
	private long id;
	private String name;
	private String role;
	
	protected User(){
		
	}
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	
	
}
