package com.control.controller;

import java.util.Scanner;

public class IfTask {

	public void taskIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int kor = sc.nextInt();
		System.out.println("���� : ");
		int eng = sc.nextInt();
		System.out.println("���� : ");
		int math = sc.nextInt();
		int total = kor + eng + math;
		double avg = total / 3.0;
		System.out.printf("��� : %f \n", avg);
		if (total >= 250)
			System.out.println("������Դϴ�.");
	}
	
	public void taskIf2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("A ���� : ");
		int a = sc.nextInt();
		System.out.println("B ���� : ");
		int b = sc.nextInt();
		System.out.println("C ���� : ");
		int c = sc.nextInt();
		
		if (a >= 5000) {
			System.out.println("A�� ��׿������Դϴ�");
		}
		
		if (b >= 5000) {
			System.out.println("B�� ��׿������Դϴ�");
		}
		
		if (c >= 5000) {
			System.out.println("C�� ��׿������Դϴ�");
		}
	}
	
	public void taskIf3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("¦����");
		}
		if (num % 2 == 1) {
			System.out.println("Ȧ����");
		}
	}
}
