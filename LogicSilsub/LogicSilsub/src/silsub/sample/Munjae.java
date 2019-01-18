package silsub.sample;

import java.util.Scanner;

public class Munjae {

	public void inputTest() {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		double height;
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("키 : ");
		height = sc.nextDouble();

		if (!name.equals(null) && name.length() > 0 && age > 0 && height > 0) {

			System.out.println("확인 : " + name + "의 나이는 " + age + "세이고, 키는 " + height + "cm 이다.");
			// System.out.printf("확인 : %s의 나이는 %d세이고, 키는 %.1f cm 이다. \n", name, age,
			// height);
		}
	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("첫번째 정수 : ");
		a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		b = sc.nextInt();
		if (a > 0 && b > 0) {
			System.out.println(a + " + " + b + " = " + (a + b));
			System.out.println(a + " - " + b + " = " + (a - b));
			System.out.println(a + " * " + b + " = " + (a * b));
			System.out.println(a + " / " + b + " = " + (a / b));
			System.out.println(a + " % " + b + " = " + (a % b));
		}
	}
	
	public void test7() {
		Scanner sc = new Scanner(System.in);
		int score;
		char c = 0;
		System.out.print("점수 : ");
		score = sc.nextInt();
		if (score > 0) {
			if (90 <= score)
				c = 'A';
			else if (80 <= score)
				c = 'B';
			else if (70 <= score)
				c = 'C';
			else if (60 <= score)
				c = 'D';
			else
				c = 'F';
		}
		System.out.println("점수 : " + score + " 학점 : " + c);
	}
}
