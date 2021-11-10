package com.franzoo.entities;

import javax.persistence.*;
;

@Entity
@Table(name="chat")
public class ChatEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable= false, length = 20)
	private long toId;
	
	@Column(nullable= false, length = 20)
	private long fromId;

	@Column(nullable = true,length = 100)
	private String createdAt;
	
	@Column(nullable = false,length = 1000)
	private String message;

	public ChatEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChatEntity(long id, long toId, long fromId, String createdAt, String message) {
		super();
		this.id = id;
		this.toId = toId;
		this.fromId = fromId;
		this.createdAt = createdAt;
		this.message = message;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ChatEntity [id=" + id + ", toId=" + toId + ", fromId=" + fromId + ", createdAt=" + createdAt
				+ ", message=" + message + "]";
	}
	
	
	
	
}
