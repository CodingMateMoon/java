package com.member.controller;

import java.util.Scanner;
import com.member.model.vo.*;

public class MainMenu {

	private Member[] member = new Member[5];
	private MemberController mc = new MemberController();
	public void menu() {
		for (int i = 0; i < 5; i++) {
			member[i] = new Member();
		}
		// 5명 저장, 5명 각각 처리할 수 있게 로직 작성
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("*****회원관리*****");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원정보수정");
			System.out.println("4. 조회");
			System.out.println("5. 종료");
			System.out.print("입력 : ");
			int cho = sc.nextInt();
			switch (cho) {
				case 1:	mc.addMember(); break;
				case 2: mc.login(); break;
				case 3: mc.updateMember(); break;
				case 4: mc.show(); break;
				case 5: System.out.println("종료"); return;
			}
		}
	}
}
