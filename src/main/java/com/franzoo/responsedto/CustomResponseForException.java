package com.franzoo.responsedto;


public class CustomResponseForException {
	
	private String message;
	private String status;
	private Exception exp;
	
	public CustomResponseForException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomResponseForException(String message, String status, Exception exp) {
		super();
		this.message = message;
		this.status = status;
		this.exp = exp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Exception getExp() {
		return exp;
	}

	public void setExp(Exception exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "CustomResponseForException [message=" + message + ", status=" + status + ", exp=" + exp + "]";
	}
	
	

}
