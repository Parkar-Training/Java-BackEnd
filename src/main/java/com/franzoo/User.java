package com.franzoo;



//import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;


@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uid;
	
	@Column(nullable = false , unique = true , length = 50)
	@Email
	@NotNull(message = "It should not be null")
	@NotBlank
	private String email;
	
	@Column(nullable = false , unique = true , length = 10)
	@NotBlank
	@Size(min = 10 , max = 10)
	@NotNull(message = "It should not be null")
	private String mob;
	
	@Column(nullable = false , length = 50)
	@NotNull(message = "It should not be null")
	@NotBlank
	private String name;
	
	@Column(nullable = false , length = 64)
	@NotNull(message = "It should not be null")
	@NotBlank
	private String password;
	
	@Column(nullable = false,length = 100)
	private String created_at="";
	
	@Column(nullable = false)
	private String is_Private = "0";
	
	@Column(nullable = false , length = 4)
	private String OTP;
	
	public String getIs_Private() {
		return is_Private;
	}
	public void setIs_Private(String is_Private) {
		this.is_Private = is_Private;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getOTP() {
		return OTP;
	}
	public void setOTP(String oTP) {
		OTP = oTP;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", email=" + email + ", mob=" + mob + ", name=" + name + ", password=" + password
				+ ", created_at=" + created_at + ", is_Private=" + is_Private + ", OTP=" + OTP + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long uid, String email, @Size(min = 10, max = 10) String mob, String name, String password,
			String created_at, String is_Private, String oTP) {
		super();
		this.uid = uid;
		this.email = email;
		this.mob = mob;
		this.name = name;
		this.password = password;
		this.created_at = created_at;
		this.is_Private = is_Private;
		OTP = oTP;
	}
	
	
	
	
}

	
	

	
	

