package com.breakContinue.controller;

public class BreakContinueController {

	public void basicBreak() {
		// 반복문을 종료시키는 예약어
		/*
		 * for (int i = 0; i < 100; i++) { System.out.println(i); if (i == 10) break; }
		 */

		for (int i = 0;; i++) {
			System.out.println(i);
			if (i == 10)
				break;
		}
	}

	public void basicContinue() {

		int i = 0;
		while (i < 100) {
			i++;
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}
	}

	public void randomTest() {
		// Math클래스에 있는 random메소드를 이용!
		// Math클래스의 random메소드는 static이기 때문에
		// 클래스명.으로 접근가능 --> Math.random()
		System.out.println((int) (Math.random() * 42) + 1);
	}

	public static void print() {
		System.out.println("난 static이야");
	}
}
