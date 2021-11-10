package com.franzoo.service;

import org.springframework.stereotype.Service;

import com.franzoo.entities.User;
import com.franzoo.exception.InvalidRequestException;
import com.franzoo.requestdto.NewPasswordDTO;

@Service
public class Validations {

	public void signUpValidation(User user) {
		
		//String email = "/^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/";
		String email = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		
		if(user.getEmail().matches(email) == false) {
			throw new InvalidRequestException("Invalid Email");
		}
		
		//String mobileNumberRegex = "/^(\\+\\d{1,3}[- ]?)?\\d{10}$/";
		String mobileNumberRegex = "^\\d{10}$";
		if (user.getMob().matches(mobileNumberRegex) == false){
			
			throw new InvalidRequestException("Invalid Mobile Number");
		}
		
		
	}
	public void forgetPasswordOtpValidation(NewPasswordDTO newPassword,User user) {
		
		if(!newPassword.getEmail().equals(user.getEmail())) {
			throw new InvalidRequestException("Email not Found");
		}
		if(!newPassword.getOtp().equals(user.getOTP())) {
			throw new InvalidRequestException("Invalid OTP");
		}
	
	}
	
	
	

}
