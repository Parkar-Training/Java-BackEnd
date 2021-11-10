package com.franzoo.customresponse;

public class CustomResponseForSendMessage {

	private String msg;
	private long toId;
	private long fromId;
	private String time;
	private String message;
	
	public CustomResponseForSendMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomResponseForSendMessage(String msg, long toId, long fromId, String time, String message) {
		super();
		this.msg = msg;
		this.toId = toId;
		this.fromId = fromId;
		this.time = time;
		this.message = message;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public long getToId() {
		return toId;
	}
	public void setToId(long toId) {
		this.toId = toId;
	}
	public long getFromId() {
		return fromId;
	}
	public void setFromId(long fromId) {
		this.fromId = fromId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
