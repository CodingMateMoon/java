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
		System.out.println("�����Է� : ");
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
		System.out.println("�Է¹��� ���������� Ȧ���� �� : " + sum);
	}
	
	public void countChar() {
		Scanner sc = new Scanner(System.in);
		int i, cnt = 0;
		System.out.print("���ڿ� �Է� : ");
		String s = sc.nextLine();
		System.out.print("���� �Է� : ");
		char c = sc.nextLine().charAt(0);
		boolean check = true;
		
		
		for (i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (('a' <= temp && temp <= 'z') || ('A' <= temp && temp <= 'Z')) {
				if (temp == c)
					cnt++;
			}
			else {
				System.out.println("�����ڰ� �ƴմϴ�");
				check = false;
				break;
			}
			
		}
		if (check) {
			System.out.println("���Ե� ���� : " + cnt);
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
			System.out.print("�̸� : ");
			name[i] = sc.nextLine();
			System.out.print("���� : ");
			age[i] = sc.nextInt();
			sc.nextLine();
			System.out.print("�ּ� : ");
			address[i] = sc.nextLine();
			System.out.print("Ű : ");
			height[i] = sc.nextInt();
			System.out.print("������ : ");
			weight[i] = sc.nextInt();
			sc.nextLine();
			System.out.print("����ó : ");
			phone[i] = sc.nextLine();
		}
		System.out.println("=========����ȸ��===========");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s %d %s %d %d %s \n", name[i], age[i], address[i], height[i],
					weight[i], phone[i]);
		}
	}
}
