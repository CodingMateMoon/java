package com.DateTest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class ReservationDateTest {

	public static void main(String[] args) {

		int length = 5;
		for (int i = 0; i < length; i++) {
			int randomId = (int) (Math.random() * 4) + 1;
			String name = "name" + i;
			int numPayType = (int) (Math.random() * 3) + 1;
			int numrState = (int) (Math.random() * 3) + 1;
			int numMemberCount = (int) (Math.random() * 8) + 1;
			int year = (int) (Math.random() * 2) + 2017;
			int month = (int) (Math.random() * 12) + 1;
			int totalDay = getTotalDays(year, month);
//		int day = (int) (Math.random() * 31) + 1;
			int day = 1;
			do {
				day = (int) (Math.random() * 31) + 1;
			} while (day > totalDay);
			int liveCount = (int) (Math.random() * 30) + 1;
			GregorianCalendar gc = new GregorianCalendar(year, month, day);
			Date entrance = new Date(gc.getTimeInMillis());
			Date checkout = entrance;
			while (liveCount-- > 0) {
				checkout = addDay(checkout);
			}

			String entranceDay = makeStringDay(entrance);
			String checkoutDay = makeStringDay(checkout);
			String memo = "인원수는 " + numMemberCount + "입니다.";
			String randomPayType = "";
			String randomrState = "";
			switch (numPayType) {
			case 1:
				randomPayType = "현금";
				break;
			case 2:
				randomPayType = "카드";
				break;
			case 3:
				randomPayType = "제휴";
				break;
			}

			switch (numrState) {
			case 1:
				randomrState = "미입금";
				break;
			case 2:
				randomrState = "잔금";
				break;
			case 3:
				randomrState = "완료";
				break;
			}
			System.out.println(entranceDay + " " + checkoutDay);
		}
	}

	public static Date addDay(Date date) {
		// TODO you may want to check for a null date and handle it.
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);

		return cal.getTime();
	}

	public static String makeStringDay(Date date) {
		// TODO you may want to check for a null date and handle it.
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String result = cal.get(Calendar.YEAR) + "." + addZero(cal.get(Calendar.MONTH) + 1) + "."
				+ addZero(cal.get(Calendar.DAY_OF_MONTH));
		return result;
	}

	public static int getTotalDays(int year, int month) {
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else if (month == 2) {
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		} else {
			return 31;
		}
	}

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public static String addZero(int day) {
		String sDay;
		if (day < 10) {
			sDay = "0" + day;
		} else {
			sDay = "" + day;
		}
		return sDay;
	}
}
