package com.control.controller;

import java.util.Scanner;

public class IfTask {

	public void taskIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();
		int total = kor + eng + math;
		double avg = total / 3.0;
		System.out.printf("평균 : %f \n", avg);
		if (total >= 250)
			System.out.println("우수생입니다.");
	}
	
	public void taskIf2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("A 연봉 : ");
		int a = sc.nextInt();
		System.out.println("B 연봉 : ");
		int b = sc.nextInt();
		System.out.println("C 연봉 : ");
		int c = sc.nextInt();
		
		if (a >= 5000) {
			System.out.println("A는 고액연봉자입니다");
		}
		
		if (b >= 5000) {
			System.out.println("B는 고액연봉자입니다");
		}
		
		if (c >= 5000) {
			System.out.println("C는 고액연봉자입니다");
		}
	}
	
	public void taskIf3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("짝수다");
		}
		if (num % 2 == 1) {
			System.out.println("홀수다");
		}
	}
}
