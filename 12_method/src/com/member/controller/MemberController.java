package com.member.controller;

import com.method.model.vo.Function;
import com.method.model.vo.Member;

public class MemberController {
	private Member m;
	private Function fn = new Function();
	
	public MemberController() {
		m = fn.addMember();
	};
	
	public void loginCheck() {
		fn.loginMember(m);
	}
	
	public Member getMember() {
		return m;
	}
	
	public void updateMember(Member b) {
//		Member m = new Member();
	}
}
