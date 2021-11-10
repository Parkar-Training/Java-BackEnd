package com.franzoo.requestdto;

import lombok.Data;

@Data
public class NewPasswordDTO {
	private String otp;
	private String password;
	private String email;

	
	@Override
	public String toString() {
		return "NewPasswordDTO [otp=" + otp + ", password=" + password + ", email=" + email + "]";
	}

	public NewPasswordDTO(String otp, String password, String email) {
		super();
		this.otp = otp;
		this.password = password;
		this.email = email;
	}

	public NewPasswordDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
