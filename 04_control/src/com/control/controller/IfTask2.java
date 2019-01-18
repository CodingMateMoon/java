package com.control.controller;

import java.util.Scanner;

public class IfTask2 {

	public void exIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어");
		int kor = sc.nextInt();
		System.out.println("영어");
		int eng = sc.nextInt();
		System.out.println("수학");
		int math = sc.nextInt();
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
	
	public void exIf2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름 : ");
		String name = sc.nextLine();
		System.out.println("학년 : ");
		int grade = sc.nextInt();
		System.out.println("반 : ");
		int room = sc.nextInt();
		System.out.println("번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("성별 : ");
		char gen = sc.next().charAt(0);
		System.out.println("성적 : ");
		double score = sc.nextDouble();
		String gender;
		if (gen == 'M') {
			gender = "남학생";
		}
		else
			gender = "여학생";
		
		System.out.printf("%d학년 %d반 %d번 %s %s은 성적이 %f이다.", grade, room, num, gender, name, score);
	}
	
	public void exIf3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 :");
		int a = sc.nextInt();
		System.out.println("정수 입력 :");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("연산자 입력 :");
		char opr = sc.next().charAt(0);
		if (a < 0 || b < 0 || (opr != '+' && opr != '-' && opr != '*' && opr != '/')) {
			System.out.println("잘못 입력 하셨습니다. 프로그램을 종료합니다");
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
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		if (1 <= num && num <= 10) {
			if (num % 2 == 0)
				System.out.println("짝수다");
			else
				System.out.println("홀수다");
		}
		else
			System.out.println("반드시 1~10사이의 정수를 입력해야 합니다");
	}
	
	public void exIf5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("키");
		double height = sc.nextDouble() / 100;
		System.out.println("몸무게");
		double weight = sc.nextDouble();
		
		
		double bmi = weight / (height * height);
		
		if (bmi < 20)
			System.out.println("저체중");
		else if (20 <= bmi && bmi < 25)
			System.out.println("정상체중");
		else if (25 <= bmi && bmi < 30)
			System.out.println("과체중");
		else
			System.out.println("비만");
	}
	
	public void elseiftest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력: ");
		String input = sc.nextLine();
		if(input.equals("50"))
			System.out.println("인생의 황혼기네요!");
		else if (input.equals("40"))
			System.out.println("인생은 40부터~");
		else if (input.equals("30"))
			System.out.println("열심히 일하는 일꾼!");
		else
			System.out.println("나이 좀 더 먹어야되요!");
		
		System.out.print("당신의 레벨 : ");
		int level = sc.nextInt();
		String msg = "";
		if (level > 100)
			msg = "고수시네요!";
		else if (level > 80)
			msg = "중수시네요!";
		else if (level > 50)
			msg = "하수시네요!";
		else
			msg = "게임접으세요!";
		System.out.println(msg);
	}
	
	public void ifInIf() {
		int age = 20;
		char gender = '남';
		if (age > 19)
		{
			System.out.println("성인입니다. 들어오세요");
			if (gender == '남')
				System.out.println("왼쪽으로 가세요~");
			else
				System.out.println("오른쪽으로 가세요~");
		}
		else
			System.out.println("미성년자입니다. 출입할 수 없습니다.");
	}
}
