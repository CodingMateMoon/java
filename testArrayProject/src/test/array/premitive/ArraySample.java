package test.array.premitive;

import java.util.Arrays;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class ArraySample {
	
	Scanner sc = new Scanner(System.in);
	public void test1() {
		int[] arr = new int[10];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			sum += arr[i];
		}
		System.out.println(sum);
	}
	
	public void test2() {
		int[] arr = new int[10];
		int min, max;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;	
		}
		min = arr[0];
		max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("최소값 : " + min + " 최대값 : " + max);
	}
	
	public void test3() {
		byte[] arr = new byte[10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (byte)(Math.random() * 127 + 1);
			if (arr[i] % 2 == 0)
				sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
	}
	
	public void test4() {
		String s;
		int sum = 0;
		System.out.print("문자열 입력 : ");
		s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			int val = s.substring(i, i + 1).charAt(0) - '0';
			sum += val;
		}
		System.out.println(sum);
	}
	
	public void test5() {
		String s;
		int sum = 0;
		System.out.print("문자열 입력 : ");
		s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}
		System.out.println(sum);
	}
	
	public void test6() {
		String personID = "881225-12345678";
		int year, month, day;
		String gender, dayOfWeek = null;
		year = Integer.parseInt("19" + personID.substring(0, 2));
		
		month = Integer.parseInt(personID.substring(2, 4)) - 1;
		day = Integer.parseInt(personID.substring(4, 6));
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		if (personID.substring(7, 8).equals("1")) {
			gender = "남자";
		}
		else
			gender = "여자";
		GregorianCalendar cal = new GregorianCalendar(year, month, day);
		GregorianCalendar cal2 = new GregorianCalendar(2018, 9, 12);
		switch(cal.get(cal.DAY_OF_WEEK)) {
		case 1:
			dayOfWeek = "일";
			break;
		case 2:
			dayOfWeek = "월";
			break;
		case 3:
			dayOfWeek = "화";
			break;
		case 4:
			dayOfWeek = "수";
			break;
		case 5:
			dayOfWeek = "목";
			break;
		case 6:
			dayOfWeek = "금";
			break;
		case 7:
			dayOfWeek = "토";
			break;
		}
		System.out.println(year);
		System.out.println(month + 1);
		System.out.println(day);
		System.out.println(" " + cal.get(cal.YEAR) + (cal.get(cal.MONTH) + 1) + cal.get(cal.DATE));
		System.out.println("태어난 요일 : " + dayOfWeek);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + (2018 - cal.get(cal.YEAR) + 1));
		System.out.println("현재 요일 : " + days[cal2.get(cal2.DAY_OF_WEEK) - 1]);
	}
}
