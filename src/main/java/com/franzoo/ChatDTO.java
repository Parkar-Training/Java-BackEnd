package com.franzoo;

public class ChatDTO {
	
	private long toId;
	//private String receiverName;
	private long fromId;
	//private String senderName;
	private String time;
	private String message;
	public ChatDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChatDTO(long toId,  long fromId,  String time, String message) {
		super();
		this.toId = toId;
		//this.receiverName = receiverName;
		this.fromId = fromId;
		//this.senderName = senderName;
		this.time = time;
		this.message = message;
	}
	public long getToId() {
		return toId;
	}
	public void setToId(long toId) {
		this.toId = toId;
	}
//	public String getReceiverName() {
//		return receiverName;
//	}
//	public void setReceiverName(String receiverName) {
//		this.receiverName = receiverName;
//	}
	public long getFromId() {
		return fromId;
	}
	public void setFromId(long fromId) {
		this.fromId = fromId;
	}
//	public String getSenderName() {
//		return senderName;
//	}
//	public void setSenderName(String senderName) {
//		this.senderName = senderName;
//	}
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
