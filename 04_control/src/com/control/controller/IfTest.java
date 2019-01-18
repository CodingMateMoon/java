package com.control.controller;

import java.util.Scanner;

public class IfTest {

	public void basicIf() {
		int su = 10;
		if (su > 90) {
			System.out.println("수가 참 크네요!");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String id = sc.nextLine();
		
		if (id.equals("admin")) {
			System.out.println("로그인 성공");
		}
	}
	
	public void exIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("동물 / 식물 : ");
		String type = sc.nextLine();
		
		if (type.equals("동물")) {
			System.out.println("동물");
		}
	}
	
	public void exIf2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇살 : ");
		int input = sc.nextInt();
		
		if (input >= 8 && input <= 12) {
			System.out.println("초딩이네요");
		}
		
		if (input >= 13 && input <= 16) {
			System.out.println("중딩이네요");
		}
		
		if (input >= 17 && input <= 19) {
			System.out.println("고딩이네요");
		}
	}
	
	public void exIf3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월급 : ");
		int pay = sc.nextInt();
		
		if (pay * 12 >= 5000) {
			System.out.println("고액 연봉자네요! 한턱쏘세요~!");
		}
	}
}
