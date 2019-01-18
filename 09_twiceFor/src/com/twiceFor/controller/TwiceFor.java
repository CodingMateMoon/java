package com.twiceFor.controller;

public class TwiceFor {

	public void basicFor() {
		int i, j;
		for (i = 0; i < 10; i++) {
			System.out.print("외곽" + i);
			for (j = 0; j < 10; j++) {
				System.out.print("내부" + j);
			}
			System.out.println();
		}
		
		b:
		for (i = 2; i < 10; i++) {
			
			System.out.println(i + "단==================");
			for (j = 1; j <= 9; j++) {
//				if (i == 3) break b;
				if (j % 2 == 0) continue b;
				System.out.println(i + "X" + j + "=" + i * j);
			}
		}
	}
	
	public void printPoint() {
		int i, j;
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				System.out.print("*");
			}
		}
	}
}
