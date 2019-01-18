package com.control.controller;

import java.util.Scanner;

public class ForEx {

	public void printNum() {
		Scanner sc = new Scanner(System.in);
		int i, sum = 0;
		for (i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		for (i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
		
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지 합 : " + sum);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (i = 1; i <= num; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
		sum = 0;
		for (i = 1; i <= num; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("입력받은 정수까지의 짝수의 합 " + sum);
	}
	
	public void printNineNine() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int i, num = sc.nextInt();
		
		if (num < 1 || num > 9 )
			System.out.println("잘못입력하셨습니다. 프로그램 종료!");
		else {
			for (i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d \n", num, i, num * i);
			}
		}
	}
}
