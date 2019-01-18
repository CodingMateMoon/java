package com.whiletest.controller;

import java.util.Scanner;

public class WhileController {

	public void basicWhile() {

		// 초기식, 조건식, 증감식
		// for문과 달리 각각 다른 위치에 존재
		int i = 0; // 초기식
		while (i < 200) { // 조건식
			i++; // 증감식
			System.out.println(i);
		}

		while (true) {
			System.out.println("moon");
		}
	}

	public void printNum() {
		Scanner sc = new Scanner(System.in);
		int i = 1, sum = 0;
		while (i <= 100) {
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
		System.out.print("정수 입력 : ");
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
		System.out.println("홀수의 합 : " + sum);
	}

	public void doWhileTest() {
		// do~while while에 있는 조건식이 false라도 한번은 반드시 실행하는 반복문
		int i = 0;
		do {
			System.out.println("되니?");
			i++;
		} while (i < 5);

		/*
		 * while(i != 0) { System.out.println("그냥 while문"); }
		 */
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		boolean flag;
		do {
			flag = true;
			System.out.println("=======음료수 주문===========");
			System.out.println("1. 코카콜라");
			System.out.println("2. 사이다");
			System.out.println("3. 환타");
			System.out.println("4. 커피");
			System.out.print("주문 : ");
			String menu = "";
			int cho = sc.nextInt();
			sc.nextLine();
			switch (cho) {
			case 1:
				menu = "콜라";
				break;
			case 2:
				menu = "사이다";
				break;
			case 3:
				menu = "환타";
				break;
			case 4:
				menu = "커피";
				break;
			}
			System.out.println(menu + "를 골랐어요");
			System.out.print("계속 주문하시겠어요?");
			String cho2 = sc.nextLine();
			if (!(cho2.equals("Y") || cho2.equals("y"))) {
				//flag = true;
				break;
			}
		} while (flag);
	}
}
