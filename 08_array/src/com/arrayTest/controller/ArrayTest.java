package com.arrayTest.controller;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public void testVari() {
		Scanner sc = new Scanner(System.in);
		int[] grade = new int[3];

		grade[0] = 90;
		grade[1] = 100;
		grade[2] = 80;

		for (int i = 0; i < grade.length; i++)
			System.out.println(grade[i]);

		int[] grade2 = { 90, 100, 80 };
		for (int i = 0; i < grade2.length; i++)
			System.out.println(grade2[i]);

		int[] num = new int[1000];

		for (int i = 0; i < 1000; i++) {
			num[i] = i + 1;
		}

		for (int i = 0; i < 1000; i++) {
			System.out.println(num[i]);
		}

		String[] names = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("이름" + i + " : ");
			names[i] = sc.nextLine();
		}
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println(names[i]);
//		}
		
		for (String name : names) {
			System.out.println(name);
		}

		
		char[] array = new char[26];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = (char) ('A' + i);
//		}
		for (int i = 0, a = 'A'; i < array.length; i++, a++) {
			array[i] = (char) a;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		for (char a :array) // for in 문
			System.out.print(a);
	}
	
	//얕은 복사 하기
	public void shallowCopy() {
		String[] names = {"이정복", "강도원", "한혜진", "손성식"};
//		String[] name2 = names;
		String[] name2 = new String[names.length];
//		System.arraycopy(names, 2, name2, 2, 2);
		// clone() : 객체복사시에도 사용
		name2 = names.clone();
		for(String s : names) {
			System.out.print(s + " ");
		}
		System.out.println("원본주소" + names.hashCode());
		System.out.println("==========");
		for (String n : name2)
			System.out.print(n + " ");
		System.out.println("복사주소" + name2.hashCode());
	}
	
	public void deepCopy() {
		String[] name = {"이정복", "강도원", "한혜진", "손성식"};
		String[] name2 = new String[name.length];
		System.arraycopy(name, 0, name2, 0, 4);
		// for문 이용 복사
		for (int i = 0; i < name.length; i++) {
			name2[i] = name[i];
		}
		String[] name3 = name.clone();
		System.out.println(Arrays.toString(name) + " " + name.hashCode());
		System.out.println(Arrays.toString(name3) + " " + name3.hashCode());
	}

	public void printFruit() {
		String[] fruit = { "딸기", "바나나", "복숭아", "키위", "사과" };
		String[] fruit2 = new String[5];
		int i, j;
		int[] rand = new int[5];
		rand[0] = (int)(Math.random() * 5);
		for (i = 0; i < 5; i++) {
			int temp = (int)(Math.random() * 5);
			for (j = 0; j < i; j++) {
				if (temp == rand[j]) {
					temp = (int)(Math.random() * 5);
					j = -1;
				}
			}
			rand[i] = temp;
		}
		
		for (i = 0; i < 5; i++) {
			fruit2[rand[i]] = fruit[i];
		}
		System.out.println(Arrays.toString(rand));
		System.out.println(Arrays.toString(fruit2));
		
//		for (i = 0; i < fruit.length; i++) {
//			if (fruit2[i].equals("복숭아")) {
//				System.out.println(fruit[i] + "의 위치 : " + i);
//			}
//		}
	}

	public void printChar() {
		Scanner sc = new Scanner(System.in);
		char[] array = new char[5];
		int i;
		for (i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 입력 : ");
			array[i] = sc.nextLine().charAt(0);
		}
		for (i = 0; i < 5; i++) {
			System.out.print(array[i]);
		}
	}

	public void intSum() {
		Scanner sc = new Scanner(System.in);
		int i, result = 0;
		;
		int[] num = new int[5];
		for (i = 0; i < 5; i++) {
			System.out.print("정수 " + (i + 1) + " : ");
			num[i] = sc.nextInt();
		}

		for (i = 0; i < num.length; i++) {
			result += num[i];
		}
		System.out.println(result);
	}
	
	public void stringCount() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값 : ");
		String s = sc.nextLine();
		char[] array = new char[s.length()];
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			array[i] = s.charAt(i);
		}
		System.out.print("검색값 : ");
		char find = sc.nextLine().charAt(0);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == find)
				cnt++;
		}
		System.out.println("입력하신 문자열 " + s +"에서 찾으시는 문자 " + find
				+ "은 " + cnt + "개 입니다.");
	}
	
	public void securityNumber() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("주민번호 입력(9208021222222) : ");
//		String num = sc.nextLine();
		String num = "9208021222222";
		char[] nums = num.toCharArray();
		for (int i = 7; i < nums.length; i++) {
			nums[i] = '*';
		}
		for (char c : nums) {
			System.out.print(c);
		}
	}
	
	public void bitonic() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int i, cnt = 0, n = sc.nextInt();
		for (i = 0; i < n; i++) {
			if (i <= n / 2) {
				System.out.println(++cnt);
			}
			else {
				System.out.println(--cnt);
			}
		}
	}

	public void rotto() {
		int[] rottoNums = new int[6];
		int i, j;
		
		for (i = 0; i < rottoNums.length; i++) {
			int temp = (int) ((Math.random() * 45) + 1);
			for (j = 0; j < i; j++) {
				if (temp == rottoNums[j]) {
					temp = (int) ((Math.random() * 45) + 1);
					j = -1;
				} 
			}
			rottoNums[i] = temp;
		}
		
		/*
		for (j = 0; j < i; j++) {
			if (rottoNums[j] == rottoNums[i]) {
				i--;
				break;
			}
		}
		*/
		
//		Arrays.sort(rottoNums);
		for (i = 0; i < rottoNums.length; i++) {
			int minIndex = i;
			for (j = i + 1; j < rottoNums.length; j++) {
				if (rottoNums[minIndex] > rottoNums[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = rottoNums[i];
				rottoNums[i] = rottoNums[minIndex];
				rottoNums[minIndex] = temp;
			}
		}
		System.out.println(Arrays.toString(rottoNums));
	}
}
