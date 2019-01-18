package cast.practice.controller;

import java.util.Scanner;

public class CastingSample {

	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char c = sc.nextLine().charAt(0);
		System.out.printf("%c is unicode : %d \n", c, (int) c);
	}
	
	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 :");
		double eng = sc.nextDouble();
		
		System.out.print("수학 :");
		double math = sc.nextDouble();
		
		int total = (int) (kor + eng + math);
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + total / 3);
	}
	
	public void printBitCount() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		System.out.printf("%d의 2진수에 포함된 1의 갯수 : %d \n", a, Integer.bitCount(a));
	}
}
