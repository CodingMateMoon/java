package com.control.controller;

import java.util.Scanner;

public class SwitchEx {

	public void fruit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("과일이름: ");
		String fruitType = sc.nextLine();

		switch (fruitType) {

		case "사과":
			System.out.println("사과의 가격은 1000원 입니다.");
			break;
		case "바나나":
			System.out.println("바나나의 가격은 3000원 입니다.");
			break;
		case "복숭아":
			System.out.println("복숭아의 가격은 2000원 입니다.");
			break;
		case "키위":
			System.out.println("키위의 가격은 5000원 입니다.");
			break;
		default : System.out.println("다른 과일은 입력하지 마세요.");
		}
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**************초기 메뉴***************");
		System.out.println("1.입력\n2.수정 \n3.조회 \n4.삭제 \n7.종료");
		System.out.print("메뉴번호 입력 : ");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("입력메뉴선택");
			break;
		case 2:
			System.out.println("수정메뉴선택");
			break;
		case 3:
			System.out.println("조회메뉴선택");
			break;
		case 4:
			System.out.println("삭제메뉴선택");
			break;
		case 7:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다. 프로그램 종료합니다");
			break;
		}
	}
	
	public void menu2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**************메뉴***************");
		System.out.println("떡볶이 -----------------------1000");
		System.out.println("김밥 ------------------------2000");
		System.out.println("오뎅 ------------------------1000");
		System.out.println("순대 ------------------------2000");
		System.out.println("튀김 ------------------------3000");
		System.out.println("떡튀순 -----------------------8000");
		System.out.print("메뉴입력 : ");
		String menu = sc.nextLine();
		switch (menu) {
		case "떡볶이":
			System.out.println("떡볶이는 1000원 입니다.");
			break;
		case "김밥":
			System.out.println("김밥은 2000원 입니다.");
			break;
		case "오뎅":
			System.out.println("오뎅은 1000원 입니다.");
			break;
		case "순대":
			System.out.println("순대는 2000원 입니다.");
			break;
		case "튀김":
			System.out.println("튀김은 2000원 입니다.");
			break;
		case "떡튀순":
			System.out.println("떡튀순은 8000원입니다.");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다. 프로그램 종료합니다");
			break;
		}
	}
	
	public void menu3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**************메뉴***************");
		System.out.println("a.햄버거---------------------3000");
		System.out.println("b.감자튀김--------------------2000");
		System.out.println("c.치킨-----------------------5000");
		System.out.println("d.사이다---------------------1000");
		System.out.println("e.콜라----------------------1000");
		System.out.print("메뉴입력 : ");
		char menu = sc.nextLine().charAt(0);
		switch (menu) {
		case 'a':
			System.out.println("햄버거는 3000원 입니다.");
			break;
		case 'b':
			System.out.println("감자튀김은 2000원 입니다.");
			break;
		case 'c':
			System.out.println("치킨은 5000원 입니다.");
			break;
		case 'd':
			System.out.println("사이다는 1000원 입니다.");
			break;
		case 'e':
			System.out.println("콜라는 1000원 입니다.");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다. 프로그램 종료합니다");
			break;
		}
	}
	
	public void printScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		switch (score) {
		case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91: case 90:
			System.out.println("A");
			break;
		case 89: case 88: case 87: case 86:	case 85: case 84: case 83: case 82: case 81: case 80:
			System.out.println("B");
			break;
		case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70:
			System.out.println("C");
			break;
		case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
				
		}
	}
	
	public void printScore2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		// case 5개
		switch (score) {
		case 100:
			System.out.println("A");
			break;
		case 80:
			System.out.println("B");
			break;
		case 70:
			System.out.println("C");
			break;
		case 60:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
				
		}
	}
	
	public void examResult() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수: ");
		int kor = sc.nextInt();
		System.out.println("영어점수: ");
		int eng = sc.nextInt();
		System.out.println("수학점수: ");
		int math = sc.nextInt();
		double avg = (kor + eng + math) / 3.0;
		if (avg < 60)
			System.out.println("평균점수 미달로 불합격 입니다.");
		if (kor < 40)
			System.out.println("국어과목의 점수 미달로 불합격 입니다.");
		if (eng < 40)
			System.out.println("영어과목의 점수 미달로 불합격 입니다.");
		if (math < 40)
			System.out.println("수학과목의 점수 미달로 불합격 입니다.");
		if (avg >= 60 && kor >= 40 && eng >= 40 && math >= 40)
			System.out.println("합격입니다.");
	}
	
	public void calcuSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 급여 입력 : ");
		int salary = sc.nextInt();
		System.out.print("월 매출 입력: ");
		int sale = sc.nextInt();
		double bonusRate = 0, bonus;
//		int bonus;
		System.out.println("===============");
		System.out.println("매출액 : " + sale);
		if (sale >= 5000) {
			bonusRate = 0.05;
		}
		else if (sale >= 3000)
			bonusRate = 0.03;
		else if (sale >= 1000)
			bonusRate = 0.01;
		bonus = sale * bonusRate;
		System.out.println("보너스율 : " + bonusRate);
		System.out.println("보너스금액 : " + (int) bonus);
		System.out.println("==========================");
		System.out.println("총 급여 : " + (int) (salary + bonus));
	}
	
	public void basicSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 나이대는? (1. 10대 2.20대 3.30대 4.40대) : ");
//		int choice = sc.nextInt();
//		char choice = sc.nextLine().charAt(0);
		String choice = sc.nextLine();
		switch(choice) {
		/*case 1 : System.out.println("꿈을 먹고 사는 10대"); break;
		case 2 : System.out.println("꿈을 실행하기 위해 사는 20대"); break;
		case 3 : System.out.println("꿈을 지키고 유지하는 30대"); break;
		case 4 : System.out.println("꿈을........"); break;
		case '가' : System.out.println("꿈을 먹고 사는 10대"); break;
		case '나' : System.out.println("꿈을 실행하기 위해 사는 20대"); break;
		case '다' : System.out.println("꿈을 지키고 유지하는 30대"); break;
		case '라' : System.out.println("꿈을........"); break;*/
		case "10대" : System.out.println("꿈을 먹고 사는 10대"); break;
		case "20대" : System.out.println("꿈을 실행하기 위해 사는 20대"); break;
		case "30대" : System.out.println("꿈을 지키고 유지하는 30대"); break;
		case "40대" : System.out.println("꿈을........"); break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
