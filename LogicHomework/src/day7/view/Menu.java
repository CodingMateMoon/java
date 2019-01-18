package day7.view;

import java.util.Scanner;

import day7.controller.Function;

public class Menu {

	public static void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int menu;
		boolean flag = true;
		do {
			System.out.println("*** 지역변수/연산자/제어문 연습 프로그램 ***");
			System.out.println("1. 간단 계산기	=> calculator() 메소드 실행되게 함");
			System.out.println("2. 작은수에서 큰수까지 합계구하기  => totalCalculator() 실행");
			System.out.println("3. 신상정보 확인하기 => profile() 실행");
			System.out.println("4. 학생정보 확인하기 => sungjuk() 실행");
			System.out.println("5. 별과 숫자 출력하기 => printStarNumber() 실행");
			System.out.println("6. 난수까지의 합게 구하기 => sumRandomNumber() 실행");
			System.out.println("7. 구구단 => continueGugudan() 실행");
			System.out.println("8. 주사위 숫자 알아맞추기 게임 => shutNumber() 실행");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 입력 : ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				new Function().calculator();
				break;
			case 2:
				new Function().totalCalculator();
				break;
			case 3:
				new Function().profile();
				break;
			case 4:
				new Function().sungjuk();
				break;
			case 5:
				new Function().printStarNumber();
				break;
			case 6:
				new Function().sumRandomNumber();
				break;
			case 7:
				new Function().continueGugudan();
				break;
			case 8:
				new Function().shutNumber();
				break;
			case 9:
				System.out.println("프로그램 종료");
				flag = false;
				break;
			
			}
		} while (flag);
	}
}
