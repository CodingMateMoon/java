package com.member.run;

import com.member.controller.MemberController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberController mc = new MemberController();
		mc.saveData();
		mc.loadData();
	}

}
