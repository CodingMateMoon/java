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
		System.out.println("1���� 100���� �� : " + sum);
		
		System.out.print("���� �Է� : ");
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
		System.out.println("�Է¹��� ���������� ¦���� �� " + sum);
	}
	
	public void printNineNine() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int i, num = sc.nextInt();
		
		if (num < 1 || num > 9 )
			System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷� ����!");
		else {
			for (i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d \n", num, i, num * i);
			}
		}
	}
}
