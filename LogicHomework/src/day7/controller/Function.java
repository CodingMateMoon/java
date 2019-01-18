package day7.controller;

import java.util.Scanner;

public class Function {

	Scanner sc = new Scanner(System.in);

	public void calculator() {
		int a, b, result = 0;
		char c;
		System.out.print("첫번째 정수 : ");
		a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		b = sc.nextInt();
		sc.nextLine();
		System.out.print("연산 문자 : ");
		c = sc.nextLine().charAt(0);
		switch (c) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;

		case '*':
			result = a * b;
			break;

		case '/':
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				result = 0;
			} else
				result = a / b;
			break;
		}
		System.out.println(a + " " + c + " " + b + " = " + result);
	}

	public void totalCalculator() {
		int i, a, b, temp, sum = 0;
		System.out.print("입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();

		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}

		for (i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + "부터 " + b + "까지 정수들의 합계 : " + sum);
	}

	public void profile() {
		int age;
		String name, gender, nature, result = "";
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("나이 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		gender = sc.nextLine();
		System.out.print("성격 : ");
		nature = sc.nextLine();
		result += "이름 : " + name + "\n";
		result += "나이 : " + age + "세\n";
		result += "성별 : " + gender + "\n";
		result += "성격 : " + nature + "\n";
		System.out.print(result);
	}

	public void sungjuk() {
		String name;
		int grade, room, num;
		char gender;
		double score;
		char credit;
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("학년 : ");
		grade = sc.nextInt();
		System.out.print("반 : ");
		room = sc.nextInt();
		System.out.print("번호 : ");
		num = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		gender = sc.nextLine().charAt(0);
		System.out.print("성적 : ");
		score = sc.nextDouble();
		if (score >= 90) {
			credit = 'A';
		} else if (score >= 80) {
			credit = 'B';
		} else if (score >= 70) {
			credit = 'C';
		} else if (score >= 60) {
			credit = 'D';
		} else {
			credit = 'F';
		}
		String gen = gender == 'M' ? "남학생" : "여학생";
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.1f이고 %c 학점입니다.", grade, room, num, gen, name, score, credit);
	}

	public void printStarNumber() {
		System.out.print("정수 하나 입력 : ");
		int i, j, n = sc.nextInt();
		if (n > 0) {
			for (i = 0; i < n; i++) {
				for (j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println(i + 1);
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}

	public void sumRandomNumber() {
		int i, n = (int) (Math.random() * 100) + 1, sum = 0;
		for (i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("난수까지의 합 : " + sum);
	}

	public void continueGugudan() {
		int i, dan, except, result;
		System.out.print("단수 : ");
		dan = sc.nextInt();
		if (dan > 0) {
			System.out.print("제외할 배수 : ");
			except = sc.nextInt();
			for (i = 1; i < 10; i++) {
				result = dan * i;
				if (result % except != 0)
					System.out.println(dan + " * " + i + " = " + result);
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}

	public void shutNumber() {
		int a = (int) Math.random() * 6 + 1;
		int b = (int) Math.random() * 6 + 1;
		int result = a + b;
		int input;
		char c;
		do {
			System.out.print("입력 : ");
			input = sc.nextInt();
			sc.nextLine();
			if (input != result) {
				System.out.println("틀렸습니다.");
				System.out.print("계속하시겠습니까?(y/n) : ");
				c = sc.nextLine().charAt(0);
				if (c == 'n' || c == 'N')
					break;
			} else {
				System.out.println("맞췄습니다.");
			}
		} while (input != result);
	}
}
