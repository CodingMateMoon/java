package kh.java.operator;

import java.util.Scanner;

public class TestOperator {

	public static void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println("결과 : " + (num / 100) * 100);
	}
	
	public static void test2() {
		Scanner sc = new Scanner(System.in);
		int totalFruit, basketFruit, basket;
		System.out.print("과일의 갯수 : ");
		totalFruit = sc.nextInt();
		System.out.print("바구니 과일 수 : ");
		basketFruit = sc.nextInt();
		basket = totalFruit / basketFruit + 1;
		System.out.println(totalFruit + "개의 과일을 담으려면 " + basket + "개가 필요합니다.");
		System.out.println("마지막 바구니 과일 수 : " + (totalFruit % basketFruit));
	}
	
	public static void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char c = sc.nextLine().charAt(0);
		System.out.print(c + " -> ");
		if ('A' <= c && c <= 'Z') {
			c += 32;
		}
		else {
			c -= 32;
		}
		System.out.println(c);
		
	}
}
