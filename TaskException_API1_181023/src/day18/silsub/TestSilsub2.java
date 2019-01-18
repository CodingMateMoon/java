package day18.silsub;

import java.util.Scanner;

public class TestSilsub2 {

	public static void main(String[] args) {
		new TestSilsub2().silsub2();
	}

	public void silsub2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 1 : ");
		int a = sc.nextInt();
		System.out.print("정수 입력 2 : ");
		int b = sc.nextInt();
		try {
			if (new NumberProcess().checkDouble(a, b)) {
				System.out.println("배수이다");
			} else {
				System.out.println("배수가 아니다");
			}
		} catch (NumberRangeException nre) {
			nre.printStackTrace();
		}
	}
}
