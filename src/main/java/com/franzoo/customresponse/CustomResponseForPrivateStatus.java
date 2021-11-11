package com.franzoo.customresponse;

public class CustomResponseForPrivateStatus {
	
	private String isPrivate;
	private String email;
	public CustomResponseForPrivateStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomResponseForPrivateStatus(String isPrivate, String email) {
		super();
		this.isPrivate = isPrivate;
		this.email = email;
	}
	public String getIsPrivate() {
		return isPrivate;
	}
	public void setIsPrivate(String isPrivate) {
		this.isPrivate = isPrivate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "CustomResponseForPrivateStatus [isPrivate=" + isPrivate + ", email=" + email + "]";
	}
	
	

}
