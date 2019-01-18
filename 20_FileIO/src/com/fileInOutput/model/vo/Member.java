package com.fileInOutput.model.vo;

import java.io.Serializable;

public class Member implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1936506481956274725L;
	private String id, pw, name;
	private int age;
	private char gender;
	private String email;
	private String tier;
	
	public Member() {
	}

	public Member(String id, String pw, String name, int age, char gender, String email, String tier) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.tier = tier;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + ", gender=" + gender + ", email="
				+ email + ", tier=" + tier + "]";
	}

	
}
