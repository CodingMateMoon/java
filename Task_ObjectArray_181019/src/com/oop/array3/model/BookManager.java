package com.oop.array3.model;

import java.util.Scanner;

public class BookManager {

	private BookCustom[] bar = null;
	static Scanner sc = new Scanner(System.in);
	private static int count = 0;
	{
		bar = new BookCustom[10];
	}
	
	public void menu() {
		boolean flag = true;
		do {
			System.out.println("***** 도서 관리 메뉴 *****");
			System.out.println("1. 도서 정보 추가");
			System.out.println("2. 모두 출력");
			System.out.println("7. 끝내기");
			System.out.print("번호 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				bookInput();
				break;
			case 2:
				bookAllOutput();
				break;
			case 7:
				System.out.println("프로그램 종료");
				return;
			}
		} while (flag);
	}
	
	public void bookInput() {
		if (count < 10) {
			// 제목, 출판사, 저자, 가격, 할인율
			bar[count] = new BookCustom();
			System.out.print("제목 : ");
			String title = sc.nextLine();
			bar[count].setTitle(title);
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			bar[count].setPublisher(publisher);
			System.out.print("저자 : ");
			String author = sc.nextLine();
			bar[count].setAuthor(author);
			System.out.print("가격 : ");
			int price = sc.nextInt();
			bar[count].setPrice(price);
			System.out.print("할인율 : ");
			double discountRate = sc.nextDouble();
			bar[count].setDiscountRate(discountRate);
			sc.nextLine();
			count++;
			
		}
	}
	
	public void bookAllOutput() {
		for (int i = 0; i < count; i++) {
			System.out.println(bar[i].information());
		}
	}
}
