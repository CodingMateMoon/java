package com.operator.controller;

import java.util.Scanner;

public class OperatorFunction {

	// 증감 연산자
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
		
		System.out.println("정수 입력 : ");
		int a = sc.nextInt();
		System.out.println("정수 입력2 : ");
		int b = sc.nextInt();
		System.out.println(a + "입력 " + b + "입력");
		System.out.println("더하기결과 : "+ a + " + " + b + " = " + (a + b) + " 입니다.");
		System.out.printf("빼  기결과 : %d - %d = %d 입니다. \n", a, b, a - b);
		System.out.printf("나누기결과 : %d / %d = %d 입니다. \n", a, b, a / b);
		System.out.printf("나머지결과 : %d / %d 의 나머지는 %d 입니다. \n", a, b, a % b);
		System.out.printf("곱하기결과 : %d * %d = %d 입니다. \n", a, b, a * b);
	}
	
	public void compare() {
		// 동등비교연산
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
		
		String str = "유병승";
		String str1 = "유병승";
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
	}
	
	public void operator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력: ");
		int a = sc.nextInt();
		System.out.println("정수입력: ");
		int b = sc.nextInt();
		
		System.out.println(a + "<" + b + "은 " + (a < b) + "이다.");
		System.out.println(a + "!=" + b + "은 " + (a != b) + "이다.");
		System.out.println(a + ">" + b + "은 " + (a > b) + "이다.");
		System.out.println(a + "==" + b + "은 " + (a == b) + "이다.");
	}
	
	public void function() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력: ");
		int a = sc.nextInt();
		System.out.println("정수입력: ");
		int b = sc.nextInt();
		System.out.println(a + "는 2의 배수 ? " + ((a % 2) == 0 ));
		System.out.println(b + "는 3의 배수 ? " + ((b % 3) == 0 ));
	}
	
	public void condition() {
		char input = 'g';
		int age = 17;
		String gen = "남자";
		System.out.println('A' <= input && input <= 'Z');
		// 입력받은 값이 19이상이고 남자일 때 조건'
		String msg = age >= 19 && gen.equals("남자") ? "성년 남자입니다." : "미성년 남자입니다.";
		System.out.println(msg);
		//System.out.println(19 <= age && gen.equals("남자"));
		// 아이디가 "admin"이고 비밀번호가 1234일때 true
		String id = "admin";
		String pw = "1234";
		System.out.println(id.equals("admin") && pw.equals("1234") ? "로그인 성공" : id.equals("admin") ? "패스워드가 틀렸습니다." : "아이디가 틀렸습니다.");
		
		// 입력값이 홀수이고 값이 17이상이며 남자인 경우 true
		System.out.println(age % 2 == 1 && age >= 17 && gen.equals("남자"));
		
		// 대문자이거나 소문자인 값
		char a = '가';
		
	}
	
	public void complexPlus() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("수입력 : ");
		int input = sc.nextInt();
		sum += input;
		
		System.out.println("수입력 : ");
		input = sc.nextInt();
		sum += input;
		
		System.out.println("수입력 : ");
		input = sc.nextInt();
		sum += input;
		
		System.out.println("수입력 : ");
		input = sc.nextInt();
		sum += input;
		
		System.out.println("총입력값 : " + sum);
	}
}
