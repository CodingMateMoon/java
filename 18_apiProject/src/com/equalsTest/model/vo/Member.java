package com.equalsTest.model.vo;

import java.util.Objects;

public class Member {

	private String id, pw, nickName;

	public Member() {
	}

	public Member(String id, String pw, String nickName) {
		super();
		this.id = id;
		this.pw = pw;
		this.nickName = nickName;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", nickName=" + nickName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member) obj;
			if (this.id.equals(m.id)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	

}
