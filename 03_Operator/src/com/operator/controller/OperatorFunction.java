package com.operator.controller;

import java.util.Scanner;

public class OperatorFunction {

	// ���� ������
	public void increment() {
		
		int su = 100;
		int su2 = 200;
		//su2 = su++;
		/*su++;
		su++;
		su++;
		su++;*/
		++su2;
		++su2;
		++su2;
		++su2;
		System.out.println(su + " " + su2);
	}
	
	public void calcuOp() {
		int su1 = 10;
		int su2 = 20;
		System.out.println(su1 * su2);
		System.out.println((double) su1 / su2);
		System.out.println(10.0 / 20);
		double result = su1 / su2;
		System.out.println(result);
	}
	
	public void calculate() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int a = sc.nextInt();
		System.out.println("���� �Է�2 : ");
		int b = sc.nextInt();
		System.out.println(a + "�Է� " + b + "�Է�");
		System.out.println("���ϱ��� : "+ a + " + " + b + " = " + (a + b) + " �Դϴ�.");
		System.out.printf("��  ���� : %d - %d = %d �Դϴ�. \n", a, b, a - b);
		System.out.printf("�������� : %d / %d = %d �Դϴ�. \n", a, b, a / b);
		System.out.printf("��������� : %d / %d �� �������� %d �Դϴ�. \n", a, b, a % b);
		System.out.printf("���ϱ��� : %d * %d = %d �Դϴ�. \n", a, b, a * b);
	}
	
	public void compare() {
		// ����񱳿���
		int su = 10;
		int su2 = 20;
		int su3 = 10;
		boolean flag = (su == su2);
		System.out.println(flag);
		
		flag = (su == su3);
		System.out.println(flag);
		
		flag = (su != su2);
		System.out.println(flag);
		
		flag = (su != su3);
		System.out.println(flag);
		
		String str = "������";
		String str1 = "������";
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
	}
	
	public void operator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�: ");
		int a = sc.nextInt();
		System.out.println("�����Է�: ");
		int b = sc.nextInt();
		
		System.out.println(a + "<" + b + "�� " + (a < b) + "�̴�.");
		System.out.println(a + "!=" + b + "�� " + (a != b) + "�̴�.");
		System.out.println(a + ">" + b + "�� " + (a > b) + "�̴�.");
		System.out.println(a + "==" + b + "�� " + (a == b) + "�̴�.");
	}
	
	public void function() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�: ");
		int a = sc.nextInt();
		System.out.println("�����Է�: ");
		int b = sc.nextInt();
		System.out.println(a + "�� 2�� ��� ? " + ((a % 2) == 0 ));
		System.out.println(b + "�� 3�� ��� ? " + ((b % 3) == 0 ));
	}
	
	public void condition() {
		char input = 'g';
		int age = 17;
		String gen = "����";
		System.out.println('A' <= input && input <= 'Z');
		// �Է¹��� ���� 19�̻��̰� ������ �� ����'
		String msg = age >= 19 && gen.equals("����") ? "���� �����Դϴ�." : "�̼��� �����Դϴ�.";
		System.out.println(msg);
		//System.out.println(19 <= age && gen.equals("����"));
		// ���̵� "admin"�̰� ��й�ȣ�� 1234�϶� true
		String id = "admin";
		String pw = "1234";
		System.out.println(id.equals("admin") && pw.equals("1234") ? "�α��� ����" : id.equals("admin") ? "�н����尡 Ʋ�Ƚ��ϴ�." : "���̵� Ʋ�Ƚ��ϴ�.");
		
		// �Է°��� Ȧ���̰� ���� 17�̻��̸� ������ ��� true
		System.out.println(age % 2 == 1 && age >= 17 && gen.equals("����"));
		
		// �빮���̰ų� �ҹ����� ��
		char a = '��';
		
	}
	
	public void complexPlus() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("���Է� : ");
		int input = sc.nextInt();
		sum += input;
		
		System.out.println("���Է� : ");
		input = sc.nextInt();
		sum += input;
		
		System.out.println("���Է� : ");
		input = sc.nextInt();
		sum += input;
		
		System.out.println("���Է� : ");
		input = sc.nextInt();
		sum += input;
		
		System.out.println("���Է°� : " + sum);
	}
}
