package com.method.model.vo;

import java.util.Scanner;

public class Function {
	int su1 = 10;
	int su2 = 20;
	Scanner sc = new Scanner(System.in);
	// 반환형도 없고 매개변수도 없는 메소드
	public void plus() {

		System.out.println(su1 + su2);
	}

	// 반환형이 없고, 매개변수가 있는 메소드
	public void plus(int su1, int su2) {
		System.out.println(su1 + su2);
	}

	// 반환형은 있고 매개변수가 없는 메소드
	public int plus2() {
		int result = su1 + su2;
		return result;
	}

	public int plus(int su1, int su2, int su3) {
		int result = 0;
		su1 += 1;
		su2 += 1;
		return su1 + su2;
	}

	public String plusString(String a, String b) {
		
		return a + b;
	}
	
	public int plusInt(int a, int b) {
		int result = 0;
		if (a > b) {
			System.out.println("에러");
			// 프로그램을 종료시킴
//			System.exit(1);
			return 0;
		}
		/*for (int i = b; i <= a; i++) {
			result += i;
		}*/
		for (; a <= b; a++) {
			result += a;
		}
		return result;
	}
	
	public boolean isChar(char c) {
		
		boolean result;
		if ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z') {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	// 참조형 자료형을 매개변수로 이용해보자
	// 배열을 이용하여 메소드 구현!
	public void arrayTest(int[] nums){
		nums[0] = 0;
		nums[1] = 1;
		nums[2] = 2;
//		return nums;
	}
	
	public Member addMember() {
		Member m= new Member("moon", "12345");
		return m;
	}
	
	public boolean loginMember(Member m) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		if (m.getId().equals(id) && m.getPw().equals(pw)) {
			System.out.println("로그인 성공");
			return true;
		}
		else {
			System.out.println("로그인 실패!");
			return false;
		}
	}
}