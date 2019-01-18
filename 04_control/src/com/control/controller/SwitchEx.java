package com.control.controller;

import java.util.Scanner;

public class SwitchEx {

	public void fruit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����̸�: ");
		String fruitType = sc.nextLine();

		switch (fruitType) {

		case "���":
			System.out.println("����� ������ 1000�� �Դϴ�.");
			break;
		case "�ٳ���":
			System.out.println("�ٳ����� ������ 3000�� �Դϴ�.");
			break;
		case "������":
			System.out.println("�������� ������ 2000�� �Դϴ�.");
			break;
		case "Ű��":
			System.out.println("Ű���� ������ 5000�� �Դϴ�.");
			break;
		default : System.out.println("�ٸ� ������ �Է����� ������.");
		}
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**************�ʱ� �޴�***************");
		System.out.println("1.�Է�\n2.���� \n3.��ȸ \n4.���� \n7.����");
		System.out.print("�޴���ȣ �Է� : ");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("�Է¸޴�����");
			break;
		case 2:
			System.out.println("�����޴�����");
			break;
		case 3:
			System.out.println("��ȸ�޴�����");
			break;
		case 4:
			System.out.println("�����޴�����");
			break;
		case 7:
			System.out.println("���α׷��� �����մϴ�.");
			break;
		default:
			System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. ���α׷� �����մϴ�");
			break;
		}
	}
	
	public void menu2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**************�޴�***************");
		System.out.println("������ -----------------------1000");
		System.out.println("��� ------------------------2000");
		System.out.println("���� ------------------------1000");
		System.out.println("���� ------------------------2000");
		System.out.println("Ƣ�� ------------------------3000");
		System.out.println("��Ƣ�� -----------------------8000");
		System.out.print("�޴��Է� : ");
		String menu = sc.nextLine();
		switch (menu) {
		case "������":
			System.out.println("�����̴� 1000�� �Դϴ�.");
			break;
		case "���":
			System.out.println("����� 2000�� �Դϴ�.");
			break;
		case "����":
			System.out.println("������ 1000�� �Դϴ�.");
			break;
		case "����":
			System.out.println("����� 2000�� �Դϴ�.");
			break;
		case "Ƣ��":
			System.out.println("Ƣ���� 2000�� �Դϴ�.");
			break;
		case "��Ƣ��":
			System.out.println("��Ƣ���� 8000���Դϴ�.");
			break;
		default:
			System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. ���α׷� �����մϴ�");
			break;
		}
	}
	
	public void menu3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**************�޴�***************");
		System.out.println("a.�ܹ���---------------------3000");
		System.out.println("b.����Ƣ��--------------------2000");
		System.out.println("c.ġŲ-----------------------5000");
		System.out.println("d.���̴�---------------------1000");
		System.out.println("e.�ݶ�----------------------1000");
		System.out.print("�޴��Է� : ");
		char menu = sc.nextLine().charAt(0);
		switch (menu) {
		case 'a':
			System.out.println("�ܹ��Ŵ� 3000�� �Դϴ�.");
			break;
		case 'b':
			System.out.println("����Ƣ���� 2000�� �Դϴ�.");
			break;
		case 'c':
			System.out.println("ġŲ�� 5000�� �Դϴ�.");
			break;
		case 'd':
			System.out.println("���̴ٴ� 1000�� �Դϴ�.");
			break;
		case 'e':
			System.out.println("�ݶ�� 1000�� �Դϴ�.");
			break;
		default:
			System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. ���α׷� �����մϴ�");
			break;
		}
	}
	
	public void printScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		switch (score) {
		case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91: case 90:
			System.out.println("A");
			break;
		case 89: case 88: case 87: case 86:	case 85: case 84: case 83: case 82: case 81: case 80:
			System.out.println("B");
			break;
		case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70:
			System.out.println("C");
			break;
		case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
				
		}
	}
	
	public void printScore2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		// case 5��
		switch (score) {
		case 100:
			System.out.println("A");
			break;
		case 80:
			System.out.println("B");
			break;
		case 70:
			System.out.println("C");
			break;
		case 60:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
				
		}
	}
	
	public void examResult() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������: ");
		int kor = sc.nextInt();
		System.out.println("��������: ");
		int eng = sc.nextInt();
		System.out.println("��������: ");
		int math = sc.nextInt();
		double avg = (kor + eng + math) / 3.0;
		if (avg < 60)
			System.out.println("������� �̴޷� ���հ� �Դϴ�.");
		if (kor < 40)
			System.out.println("��������� ���� �̴޷� ���հ� �Դϴ�.");
		if (eng < 40)
			System.out.println("��������� ���� �̴޷� ���հ� �Դϴ�.");
		if (math < 40)
			System.out.println("���а����� ���� �̴޷� ���հ� �Դϴ�.");
		if (avg >= 60 && kor >= 40 && eng >= 40 && math >= 40)
			System.out.println("�հ��Դϴ�.");
	}
	
	public void calcuSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �޿� �Է� : ");
		int salary = sc.nextInt();
		System.out.print("�� ���� �Է�: ");
		int sale = sc.nextInt();
		double bonusRate = 0, bonus;
//		int bonus;
		System.out.println("===============");
		System.out.println("����� : " + sale);
		if (sale >= 5000) {
			bonusRate = 0.05;
		}
		else if (sale >= 3000)
			bonusRate = 0.03;
		else if (sale >= 1000)
			bonusRate = 0.01;
		bonus = sale * bonusRate;
		System.out.println("���ʽ��� : " + bonusRate);
		System.out.println("���ʽ��ݾ� : " + (int) bonus);
		System.out.println("==========================");
		System.out.println("�� �޿� : " + (int) (salary + bonus));
	}
	
	public void basicSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���̴��? (1. 10�� 2.20�� 3.30�� 4.40��) : ");
//		int choice = sc.nextInt();
//		char choice = sc.nextLine().charAt(0);
		String choice = sc.nextLine();
		switch(choice) {
		/*case 1 : System.out.println("���� �԰� ��� 10��"); break;
		case 2 : System.out.println("���� �����ϱ� ���� ��� 20��"); break;
		case 3 : System.out.println("���� ��Ű�� �����ϴ� 30��"); break;
		case 4 : System.out.println("����........"); break;
		case '��' : System.out.println("���� �԰� ��� 10��"); break;
		case '��' : System.out.println("���� �����ϱ� ���� ��� 20��"); break;
		case '��' : System.out.println("���� ��Ű�� �����ϴ� 30��"); break;
		case '��' : System.out.println("����........"); break;*/
		case "10��" : System.out.println("���� �԰� ��� 10��"); break;
		case "20��" : System.out.println("���� �����ϱ� ���� ��� 20��"); break;
		case "30��" : System.out.println("���� ��Ű�� �����ϴ� 30��"); break;
		case "40��" : System.out.println("����........"); break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
