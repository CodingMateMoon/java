package com.control.controller;

import java.util.Scanner;

public class ControlEx {

	/*
	 * public void saveInfo() { Scanner sc = new Scanner(System.in); String[] name =
	 * new String[5]; int[] age = new int[5]; String[] address = new String[5];
	 * int[] height = new int[5]; int[] weight = new int[5]; String[] phone = new
	 * String[5]; for (int i = 0; i < 5; i++) { System.out.print("name : "); name[i]
	 * = sc.nextLine(); System.out.print("age : "); age[i] = sc.nextInt();
	 * sc.nextLine(); System.out.print("address : "); address[i] = sc.nextLine();
	 * System.out.print("height : "); height[i] = sc.nextInt();
	 * System.out.print("weight : "); weight[i] = sc.nextInt(); sc.nextLine();
	 * System.out.print("phone : "); phone[i] = sc.nextLine(); }
	 * System.out.println("=========Info==========="); for (int i = 0; i < 5; i++) {
	 * System.out.printf("%s %d %s %d %d %s \n", name[i], age[i], address[i],
	 * height[i], weight[i], phone[i]); } }
	 */

	public void test() {
		int i, sum = 0;
		for (i = 1; i <= 5; i++) {
			System.out.println(i + "번째 반복문 수행중");
		}
		System.out.println(sum);
	}

	public void basicFor() {

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

	public void printNum() {
		Scanner sc = new Scanner(System.in);
		int i = 1, sum = 0;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}

		i = 100;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		i = 1;
		while (i <= 100) {
			if (i % 2 == 1)
				System.out.println(i);
			i++;
		}
		System.out.println("정수입력 : ");
		int num = sc.nextInt();

		for (i = 1; i <= num; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}

		for (i = 1; i <= num; i++) {
			if (i % 2 == 0)
				sum += i;
		}

		System.out.println("짝수의 합 : " + sum);
	}

	public void subak() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int i, n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			if (i % 2 == 1)
				System.out.print("수");
			else
				System.out.print("박");
		}
	}
	
	public void haveChar() {
		Scanner sc = new Scanner(System.in);
		String s;
		char c;
		int i, cnt;
		boolean flag = true;
		cnt = 0;
		System.out.print("문자열 입력 : ");
		s = sc.nextLine();
		System.out.print("문자 입력 : ");
		c = sc.nextLine().charAt(0);
		for (i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (!('a' <= temp && temp <= 'z' || 'A' <= temp && temp <= 'Z')) {
				System.out.println("영문자가 아닙니다");
				flag = false;
				break;
			}
			else if (s.charAt(i) == c)
				cnt++;
		}
		if (flag)
			System.out.println("포함된 갯수 : " + cnt + "개");
	}
	


	public void saveInfo() {
		Scanner sc = new Scanner(System.in);
		String name, address, result = "";
		int i, age, totalAge = 0, height, totalHeight = 0, weight, totalWeight = 0, phone;
		for (i = 0; i < 5; i++) {
			System.out.print("이름 : ");
			name = sc.nextLine();
			System.out.print("나이 : ");
			age = sc.nextInt();
			totalAge += age;
			sc.nextLine();
			System.out.print("주소 : ");
			address = sc.nextLine();
			System.out.print("키 : ");
			height = sc.nextInt();
			totalHeight += height;
			System.out.print("몸무게 : ");
			weight = sc.nextInt();
			totalWeight += weight;
			System.out.print("전화번호 : ");
			phone = sc.nextInt();
			result += name + " " + age + "세 " + address + " " + height + "cm " + weight + "kg " + phone + "\n";
			sc.nextLine();
		}
		System.out.println("=========저장 회원=========");
		System.out.println(result);
		System.out.println(
				"평균나이 : " + totalAge / 5 + "세 / 평균 키 : " + totalHeight / 5 + "cm / 평균 몸무게 : " + totalWeight / 5 + "kg");
	}

	public void saveInfo2() {
		Scanner sc = new Scanner(System.in);
		String name, address, result = "";
		int n, i, age, totalAge = 0, height, totalHeight = 0, weight, totalWeight = 0, phone;
		System.out.print("회원 수 입력 : ");
		n = sc.nextInt();
		sc.nextLine();
		for (i = 0; i < n; i++) {
			System.out.print("이름 : ");
			name = sc.nextLine();
			System.out.print("나이 : ");
			age = sc.nextInt();
			totalAge += age;
			sc.nextLine();
			System.out.print("주소 : ");
			address = sc.nextLine();
			System.out.print("키 : ");
			height = sc.nextInt();
			totalHeight += height;
			System.out.print("몸무게 : ");
			weight = sc.nextInt();
			totalWeight += weight;
			System.out.print("전화번호 : ");
			phone = sc.nextInt();
			result += name + " " + age + "세 " + address + " " + height + "cm " + weight + "kg " + phone + "\n";
			sc.nextLine();
		}
		System.out.println("=========저장 회원=========");
		System.out.println(result);
		System.out.println(
				"평균나이 : " + totalAge / n + "세 / 평균 키 : " + totalHeight / n + "cm / 평균 몸무게 : " + totalWeight / n + "kg");
	}

	public void printItem() {
		Scanner sc = new Scanner(System.in);
		int i, id, price;
		String type, name, result = "";
		for (i = 0; i < 5; i++) {
			System.out.print("상품 id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("종류: ");
			type = sc.nextLine();
			System.out.print("상품명: ");
			name = sc.nextLine();
			System.out.print("가격: ");
			price = sc.nextInt();
			result += id + " " + type + " " + name + " " + price + "만원\n";
		}
		System.out.println(result);
	}

	public void printItem2() {
		Scanner sc = new Scanner(System.in);
		int i, price, totalPrice = 0, cnt;
		String id, type, name, result = "";
		System.out.print("저장할 상품의 개수: ");
		cnt = sc.nextInt();
		sc.nextLine();
		for (i = 0; i < cnt; i++) {
			System.out.print("상품 id: ");
			id = sc.nextLine();
			System.out.print("종류: ");
			type = sc.nextLine();
			System.out.print("상품명: ");
			name = sc.nextLine();
			System.out.print("가격: ");
			price = sc.nextInt();
			totalPrice += price;
			sc.nextLine();
			result += id + " " + type + " " + name + " " + price + "만원\n";
		}
		System.out.print(result);
		System.out.println("평균 값 : " + totalPrice / cnt);
	}

	public void hunt() {
		Scanner sc = new Scanner(System.in);
		int type, exp = 0, cnt = 0;

		type = 0;
		System.out.println("사용법");
		System.out.println("0.사냥시작 1.오크사냥 2.용사냥 3.몬스터사냥 99.끝내기");
		System.out.println("선택 : ");
		System.out.println("사냥을 시작합니다");
		do {
			System.out.print("입력 : ");
			type = sc.nextInt();
			switch (type) {
			case 1:
				System.out.println("오크사냥완료 +1 exp");
				exp++;
				cnt++;
				break;
			case 2:
				System.out.println("용사냥완료 +15 exp");
				exp += 15;
				cnt++;
				break;
			case 99:
				System.out.println("사냥을 마쳤습니다");
				System.out.println("사냥한 몹의 수는 " + cnt + "마리, 획득한 경험치는 " + exp + "exp입니다.");
				break;
			}
		} while (type != 99);
	}

	public void printMenu() {
		Scanner sc = new Scanner(System.in);
		int type;
		boolean flag = true;
		do {
			System.out.println("**********초기 메뉴**************");
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("7. 종료");
			System.out.print("메뉴 번호 입력 : ");
			type = sc.nextInt();
			switch (type) {

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
				System.out.println("프로그램을 종료합니다");
				flag = false;
				break;
			}
		} while (flag);
	}

	public void getOrder() {
		Scanner sc = new Scanner(System.in);
		int menu, cnt, price = 0;
		char input;
		boolean flag = true;
		String result = "";
		while (true) {
			System.out.println("김밥류======================");
			System.out.println("1. 원조김밥============1000원");
			System.out.println("2. 치즈김밥============1200원");
			System.out.println("3. 참치김밥============2000원");
			System.out.println("라면======================");
			System.out.println("4. 그냥라면============1200원");
			System.out.println("5. 치즈라면============1500원");
			System.out.println("6. 짬뽕라면============2000원");
			System.out.println("기타======================");
			System.out.println("7. 튀김============1200원");
			System.out.println("8. 순대============2500원");
			System.out.println("9. 오뎅============1000원");
			System.out.println("10. 음료수==========800원");
			System.out.print("메뉴선택 : ");
			menu = sc.nextInt();
			System.out.print("수량선택 : ");
			cnt = sc.nextInt();
			sc.nextLine();
			System.out.println(cnt + "개 주문하셨습니다.");

			switch (menu) {
			case 1:
				result += "원조김밥 : " + cnt + "개 - " + 1000 * cnt + "원\n";
				price += 1000 * cnt;
				break;
			case 2:
				result += "치즈김밥 : " + cnt + "개 - " + 1200 * cnt + "원\n";
				price += 1200 * cnt;
				break;
			case 3:
				result += "참치김밥 : " + cnt + "개 - " + 2000 * cnt + "원\n";
				price += 2000 * cnt;
				break;
			case 4:
				result += "그냥라면 : " + cnt + "개 - " + 1200 * cnt + "원\n";
				price += 1200 * cnt;
				break;
			case 5:
				result += "치즈라면 : " + cnt + "개 - " + 1500 * cnt + "원\n";
				price += 1500 * cnt;
				break;
			case 6:
				result += "짬뽕라면 : " + cnt + "개 - " + 2000 * cnt + "원\n";
				price += 2000 * cnt;
				break;
			case 7:
				result += "튀김 : " + cnt + "개 - " + 1200 * cnt + "원\n";
				price += 1200 * cnt;
				break;
			case 8:
				result += "순대 : " + cnt + "개 - " + 2500 * cnt + "원\n";
				price += 2500 * cnt;
				break;
			case 9:
				result += "오뎅 : " + cnt + "개 - " + 1000 * cnt + "원\n";
				price += 1000 * cnt;
				break;
			case 10:
				result += "음료수 : " + cnt + "개 - " + 800 * cnt + "원\n";
				price += 800 * cnt;
				break;
			}
			System.out.print("추가 주문하시겠습니다?(y/n) ");
			input = sc.nextLine().charAt(0);
			if (input == 'n') {
				System.out.println("*주문하신 정보는 다음과 같습니다.*");
				System.out.println("========================");
				System.out.println(result);
				System.out.println("========================");
				System.out.println("총 가격 : " + price + "원");
				break;
			}
		}
	}

	public void upDown() {
		Scanner sc = new Scanner(System.in);
		int answer = (int) (Math.random() * 100) + 1, num = -1, cnt = 0;
		while (answer != num) {
			System.out.print("1~100 사이 정수 입력: ");
			num = sc.nextInt();

			if (answer < num) {
				System.out.println("입력하신 정수보다 작습니다.");
			} else if (answer > num) {
				System.out.println("입력하신 정수보다 큽니다");
			}
			cnt++;
		}
		System.out.println("정답입니다. " + cnt + "회 만에 정답을 맞추셨습니다.");

	}

	public void primeNumber() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("정수 입력: ");
			int num = sc.nextInt();
			boolean isPrime = true;

			if (num < 2) {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
				continue;
//				num = sc.nextInt();
			}

			for (int i = 2; i * i <= num; i++) {

				if (num % i == 0) {
					isPrime = false;
				}
			}
			if (isPrime)
				System.out.println("소수다");
			else
				System.out.println("소수가 아니다");
			break;
		}
	}

	public void name() {
		Scanner sc = new Scanner(System.in);
		String name = "";
		for (int i = 0; i < 3; i++) {
			System.out.print("이름 입력: ");
			name += sc.nextLine() + " ";
		}
		System.out.println(name);
	}

	public void encode() {
		Scanner sc = new Scanner(System.in);
		String s, result = "";
		int i, num;
		System.out.print("문자열 입력 : ");
		s = sc.nextLine();
		System.out.print("0보다 큰 정수 입력 : ");
		num = sc.nextInt();

		for (i = 0; i < s.length(); i += 2) {
			char c = s.charAt(i);

			int temp, val = 0;
			if ('a' <= c && c <= 'z') {
				val = (int) 'a';
			} else if ('A' <= c && c <= 'Z') {
				val = (int) 'A';
			}
			temp = (c - val + num) % 26;
			System.out.print((char) (temp + val) + " ");
		}
	}

	public void remain() {
		Scanner sc = new Scanner(System.in);
		int remain, remain2, rcvMoney, price, cnt = 0;
		System.out.print("받으신 금액을 입력하세요 : ");
		rcvMoney = sc.nextInt();
		System.out.print("상품 가격을 입력하세요 : ");
		price = sc.nextInt();
		remain = rcvMoney - price;
		remain2 = remain;
		System.out.println("=====================");
		System.out.println("50000원권 지폐" + remain / 50000 + "장");
		remain %= 50000;
		System.out.println("10000원권 지폐" + remain / 10000 + "장");
		remain %= 10000;
		System.out.println("5000원권 지폐" + remain / 5000 + "장");
		remain %= 5000;
		System.out.println("1000원권 지폐" + remain / 1000 + "장");
		remain %= 1000;
		System.out.println("500원권 동전" + remain / 500 + "장");
		remain %= 500;
		System.out.println("100원권 동전" + remain / 100 + "장");
		remain %= 100;
		System.out.println("50원권 동전" + remain / 50 + "장");
		remain %= 50;
		System.out.println("10원권 동전" + remain / 10 + "장");
		System.out.println("=====================");
		System.out.println("거스름돈 : " + remain2 + "원");
	}
}
