package cast.practice.controller;

import java.util.Scanner;

public class CastingSample {

	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		char c = sc.nextLine().charAt(0);
		System.out.printf("%c is unicode : %d \n", c, (int) c);
	}
	
	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		double kor = sc.nextDouble();
		
		System.out.print("���� :");
		double eng = sc.nextDouble();
		
		System.out.print("���� :");
		double math = sc.nextDouble();
		
		int total = (int) (kor + eng + math);
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + total / 3);
	}
	
	public void printBitCount() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int a = sc.nextInt();
		System.out.printf("%d�� 2������ ���Ե� 1�� ���� : %d \n", a, Integer.bitCount(a));
	}
}
