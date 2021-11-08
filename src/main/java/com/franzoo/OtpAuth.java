package com.franzoo;

import lombok.Data;

@Data
public class OtpAuth {
	private String uOtp;

	public String getuOtp() {
		return uOtp;
	}

	public void setuOtp(String uOtp) {
		this.uOtp = uOtp;
	}


		

	

}
