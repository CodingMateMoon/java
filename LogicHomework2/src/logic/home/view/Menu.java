package logic.home.view;

import java.util.Scanner;

import logic.home.model.*;

public class Menu {

	static Scanner sc = new Scanner(System.in);

	public static void mainMenu() {
		int menu;
		boolean flag = true;
		do {
			System.out.println("--------------------------");
			System.out.println("***** 프로그래밍 기본 기능 테스트 프로그램 *****");
			System.out.println("1. 변수 테스트");
			System.out.println("2. 기본 자료형 테스트");
			System.out.println("3. if문 테스트");
			System.out.println("4. switch문 테스트");
			System.out.println("5. for문 테스트");
			System.out.println("6. while문 테스트");
			System.out.println("7. do~while문 테스트");
			System.out.println("8. break문 테스트");
			System.out.println("9. continue문 테스트");
			System.out.println("10. static 메소드 사용 테스트");
			System.out.println("11. non-static 메소드 사용 테스트");
			System.out.println("12. 프로그램 종료");
			System.out.print("메뉴 번호 입력 : ");
			menu = sc.nextInt();
			System.out.println("-------------------------");

			switch (menu) {
			case 1:
				subVarMenu();
				break;
			case 2:
				subPTypeMenu();
				break;
			case 3:
				subIfMenu();
				break;
			case 4:
				subSwitchMenu();
				break;
			case 5:
				subForMenu();
				break;
			case 6:
				subWhileMenu();
				break;
			case 7:
				subDoWhileMenu();
				break;
			case 8:
				subBreakMenu();
				break;
			case 9:
				subContinueMenu();
				break;
			case 10:
				subStaticMethodMenu();
				break;
			case 11:
				subNonStaticMethodMenu();
				break;
			case 12:
				System.out.println("프로그램 종료");
				flag = false;
				break;
			}
		} while (flag);
	}

	public static void subVarMenu() {
		int menu;
		boolean flag = true;
		VariableSample vs = new VariableSample();
		do {
			System.out.println("*** 변수 테스트 부메뉴 ***");
			System.out.println("1. 내 신상정보 변수에 담아 출력하기");
			System.out.println("2. 사원정보를 키보드로 입력받아 출력하기");
			System.out.println("3. 기본 자료형 변수의 초기값 확인하기");
			System.out.println("4. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				
			}
		} while (flag);
	}

	public static void subPTypeMenu() {
	}

	public static void subIfMenu() {
	}

	public static void subSwitchMenu() {
	}

	public static void subForMenu() {
	}

	public static void subWhileMenu() {
	}

	public static void subDoWhileMenu() {
	}

	public static void subBreakMenu() {
	}

	public static void subContinueMenu() {
	}

	public static void subStaticMethodMenu() {
	}

	public static void subNonStaticMethodMenu() {
	}
}
