package com.franzoo;

public class CustomResponseForFetchUser {
	
	private String name;
	private String email;
	private String mob;
	public CustomResponseForFetchUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CustomResponseForFetchUser(String name, String email, String mob) {
		super();
		this.name = name;
		this.email = email;
		this.mob = mob;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	
	

}
