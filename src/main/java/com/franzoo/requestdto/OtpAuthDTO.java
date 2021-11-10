package com.franzoo.requestdto;

import lombok.Data;

@Data
public class OtpAuthDTO {
	private String otp;
	private String email;

	
	
	public OtpAuthDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OtpAuthDTO(String otp, String email) {
		super();
		this.otp = otp;
		this.email = email;
	}

	@Override
	public String toString() {
		return "OtpAuthDTO [otp=" + otp + ", email=" + email + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	

		

	

}
