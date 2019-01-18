package com.control.controller;

import java.util.Scanner;

public class WhileEx {

	public void printNum() {
		Scanner sc = new Scanner(System.in);
		int i = 1, sum = 0;
		while(i <= 100) {
			System.out.println(i);
			i++;
		}
		
		i = 100;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		i = 1;
		while (i <= 100) {
			if (i % 2 == 1)
				System.out.println(i);
			i++;
		} 
		System.out.println("정수입력 : ");
		int num = sc.nextInt();
		
		i = 1;
		while (i <= num) {
			if (i % 2 == 1)
				System.out.println(i);
			i++;
		}
		
		i = 1;
		while (i <= num) {
			if (i % 2 == 1) {
				sum += i;
			}
			i++;
		}
		System.out.println("입력받은 정수까지의 홀수의 합 : " + sum);
	}
	
	public void countChar() {
		Scanner sc = new Scanner(System.in);
		int i, cnt = 0;
		System.out.print("문자열 입력 : ");
		String s = sc.nextLine();
		System.out.print("문자 입력 : ");
		char c = sc.nextLine().charAt(0);
		boolean check = true;
		
		
		for (i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (('a' <= temp && temp <= 'z') || ('A' <= temp && temp <= 'Z')) {
				if (temp == c)
					cnt++;
			}
			else {
				System.out.println("영문자가 아닙니다");
				check = false;
				break;
			}
			
		}
		if (check) {
			System.out.println("포함된 갯수 : " + cnt);
			System.out.println("==================");
		}
	}
	
	public void saveInfo() {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] age = new int[5];
		String[] address = new String[5];
		int[] height = new int[5];
		int[] weight = new int[5];
		String[] phone = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("이름 : ");
			name[i] = sc.nextLine();
			System.out.print("나이 : ");
			age[i] = sc.nextInt();
			sc.nextLine();
			System.out.print("주소 : ");
			address[i] = sc.nextLine();
			System.out.print("키 : ");
			height[i] = sc.nextInt();
			System.out.print("몸무게 : ");
			weight[i] = sc.nextInt();
			sc.nextLine();
			System.out.print("연락처 : ");
			phone[i] = sc.nextLine();
		}
		System.out.println("=========저장회원===========");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s %d %s %d %d %s \n", name[i], age[i], address[i], height[i],
					weight[i], phone[i]);
		}
	}
}
