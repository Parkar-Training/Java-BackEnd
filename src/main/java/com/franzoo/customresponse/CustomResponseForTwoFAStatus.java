package com.franzoo.customresponse;

public class CustomResponseForTwoFAStatus {
	
	private boolean twoFA;
	
	private String email;

	public boolean isTwoFA() {
		return twoFA;
	}

	public void setTwoFA(boolean twoFA) {
		this.twoFA = twoFA;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CustomResponseForTwoFAStatus(boolean twoFA, String email) {
		super();
		this.twoFA = twoFA;
		this.email = email;
	}
	
	

}
