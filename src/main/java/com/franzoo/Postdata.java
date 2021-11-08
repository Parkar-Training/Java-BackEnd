package com.franzoo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="postdata")
public class Postdata {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long postId;
	
	@Column(nullable=true,length=100)
	private String userId;

	@Column(nullable=true,length=20)
	private String timestamp;
    
	@Column(nullable=true,length=20)
	private String like_count;
     
	@Column(nullable=true,length=20)
	private String comment;
	
	@Column(nullable=true,length=20)
	private String post_data;

	public long getPostId() {
		return postId;
	}
	public void setPostId(long postId) {
		this.postId = postId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String current_timestamp) {
		this.timestamp = current_timestamp;
	}
	
	public String getLike_count() {
		return like_count;
	}
	public void setLike_count(String like_count) {
		this.like_count = like_count;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getPost_data() {
		return post_data;
	}
	public void setPost_data(String post_data) {
		this.post_data = post_data;
	}
	
}

