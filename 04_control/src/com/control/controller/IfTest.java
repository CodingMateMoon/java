package com.control.controller;

import java.util.Scanner;

public class IfTest {

	public void basicIf() {
		int su = 10;
		if (su > 90) {
			System.out.println("���� �� ũ�׿�!");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String id = sc.nextLine();
		
		if (id.equals("admin")) {
			System.out.println("�α��� ����");
		}
	}
	
	public void exIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� / �Ĺ� : ");
		String type = sc.nextLine();
		
		if (type.equals("����")) {
			System.out.println("����");
		}
	}
	
	public void exIf2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��� : ");
		int input = sc.nextInt();
		
		if (input >= 8 && input <= 12) {
			System.out.println("�ʵ��̳׿�");
		}
		
		if (input >= 13 && input <= 16) {
			System.out.println("�ߵ��̳׿�");
		}
		
		if (input >= 17 && input <= 19) {
			System.out.println("����̳׿�");
		}
	}
	
	public void exIf3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int pay = sc.nextInt();
		
		if (pay * 12 >= 5000) {
			System.out.println("��� �����ڳ׿�! ���ν��~!");
		}
	}
}
