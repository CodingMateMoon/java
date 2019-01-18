package com.member.model.vo;

import java.io.Serializable;

public class Member implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1577621986984114967L;
	private String id, pw, phone, email;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String pw, String phone, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.phone = phone;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", phone=" + phone + ", email=" + email + "]";
	}
	
	

}
