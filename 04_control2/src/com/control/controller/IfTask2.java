package com.control.controller;

import java.util.Scanner;

public class IfTask2 {

	public void exIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		int kor = sc.nextInt();
		System.out.println("����");
		int eng = sc.nextInt();
		System.out.println("����");
		int math = sc.nextInt();
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
	}
	
	public void exIf2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� �̸� : ");
		String name = sc.nextLine();
		System.out.println("�г� : ");
		int grade = sc.nextInt();
		System.out.println("�� : ");
		int room = sc.nextInt();
		System.out.println("��ȣ : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("���� : ");
		char gen = sc.next().charAt(0);
		System.out.println("���� : ");
		double score = sc.nextDouble();
		String gender;
		if (gen == 'M') {
			gender = "���л�";
		}
		else
			gender = "���л�";
		
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %f�̴�.", grade, room, num, gender, name, score);
	}
	
	public void exIf3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� :");
		int a = sc.nextInt();
		System.out.println("���� �Է� :");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("������ �Է� :");
		char opr = sc.next().charAt(0);
		if (a < 0 || b < 0 || (opr != '+' && opr != '-' && opr != '*' && opr != '/')) {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�. ���α׷��� �����մϴ�");
		}
		else if (opr == '+')
			System.out.println(a + "+" + b + " = " + (a + b));
		else if (opr == '-')
			System.out.println(a + "-" + b + " = " + (a - b));
		else if (opr == '*')
			System.out.println(a + "*" + b + " = " + (a * b));
		else if (opr == '/')
			System.out.println(a + "/" + b + " = " + ((double) a / b));
				
	}
	
	public void exIf4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int num = sc.nextInt();
		
		if (1 <= num && num <= 10) {
			if (num % 2 == 0)
				System.out.println("¦����");
			else
				System.out.println("Ȧ����");
		}
		else
			System.out.println("�ݵ�� 1~10������ ������ �Է��ؾ� �մϴ�");
	}
	
	public void exIf5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ű");
		double height = sc.nextDouble() / 100;
		System.out.println("������");
		double weight = sc.nextDouble();
		
		
		double bmi = weight / (height * height);
		
		if (bmi < 20)
			System.out.println("��ü��");
		else if (20 <= bmi && bmi < 25)
			System.out.println("����ü��");
		else if (25 <= bmi && bmi < 30)
			System.out.println("��ü��");
		else
			System.out.println("��");
	}
	
	public void elseiftest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		String input = sc.nextLine();
		if(input.equals("50"))
			System.out.println("�λ��� Ȳȥ��׿�!");
		else if (input.equals("40"))
			System.out.println("�λ��� 40����~");
		else if (input.equals("30"))
			System.out.println("������ ���ϴ� �ϲ�!");
		else
			System.out.println("���� �� �� �Ծ�ߵǿ�!");
		
		System.out.print("����� ���� : ");
		int level = sc.nextInt();
		String msg = "";
		if (level > 100)
			msg = "����ó׿�!";
		else if (level > 80)
			msg = "�߼��ó׿�!";
		else if (level > 50)
			msg = "�ϼ��ó׿�!";
		else
			msg = "������������!";
		System.out.println(msg);
	}
	
	public void ifInIf() {
		int age = 20;
		char gender = '��';
		if (age > 19)
		{
			System.out.println("�����Դϴ�. ��������");
			if (gender == '��')
				System.out.println("�������� ������~");
			else
				System.out.println("���������� ������~");
		}
		else
			System.out.println("�̼������Դϴ�. ������ �� �����ϴ�.");
	}
}
