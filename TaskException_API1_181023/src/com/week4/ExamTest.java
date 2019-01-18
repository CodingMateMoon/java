package com.week4;

import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExamString es = new ExamString();
		System.out.print("문자열 입력 : ");
		String s = sc.nextLine();
		System.out.print("문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(es.preChar(s));
		System.out.println(es.CharSu(s, ch));
	}

}
