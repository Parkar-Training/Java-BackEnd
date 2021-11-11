package com.franzoo.service;

import org.springframework.stereotype.Service;

import com.franzoo.customresponse.CustomRequestForChangePassword;
import com.franzoo.entities.ChatEntity;
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
		
		String password = "";
		if (user.getPassword().matches(password)) {
			throw new InvalidRequestException("Password is Blank");
		}
		
		String name = "";
		if (user.getName().matches(name)) {
			throw new InvalidRequestException("Name is Blank");
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
	
	public void changePasswordValidation(CustomRequestForChangePassword user) {
		String blankNewPassword = "";
		if (user.getNewPassword().equals(blankNewPassword)) {
			throw new InvalidRequestException("New Password cannot be Blank");
		}
		
		if (user.getOldPassword().equals(blankNewPassword)) {
			throw new InvalidRequestException("Old Password cannot be Blank");
		}
		
		if (user.getEmail().equals(blankNewPassword)) {
			throw new InvalidRequestException("Please Enter valid Email");
		}
	}
	
	public void chatValidation(ChatEntity chat) {
		String blank = "";
		if (chat.getMessage().equals(blank)) {
			throw new InvalidRequestException("Message not entered");
		}
	}


	public void privateStatusValidation(User user) {
	//	String privateStat =
//		if(user.getIs_Private()!= "0") {
//		else if(user.getIs_Private()= "1") {
//			
//			throw new InvalidRequestException("")
//		}
//		}
//		
			
		}
	}
	
	
	


