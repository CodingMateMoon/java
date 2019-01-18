package com.DateTest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class DatePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gc = new GregorianCalendar(2018, 11 - 1, 3);
		long date = gc.getTimeInMillis();

		Date today = new Date(date);
		System.out.println(gc);
		System.out.println(today);
//		System.out.println(gc.get(Calendar.DAY));

		gc = new GregorianCalendar();
		int year = gc.get(Calendar.YEAR);
		int month = gc.get(Calendar.MONTH) + 1;
		int day = gc.get(Calendar.DAY_OF_MONTH);
		String todayDate = String.valueOf(year) + "." + String.valueOf(month) + "." + String.valueOf(day);
		StringTokenizer st = new StringTokenizer(todayDate, ".");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		String[] yearMonthDay = todayDate.split("[.]");
		for (String s : yearMonthDay) {
			System.out.println("캘린더 :  " + s);
		}
		System.out.println("오늘 날짜 :  " + todayDate);
		String[] dayOfWeek = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(dayOfWeek[gc.get(Calendar.DAY_OF_WEEK) - 1]);
		// Sunday 1, Saturday 7
		gc = new GregorianCalendar(2018, 10, 9);
//		Date startDay = new Date(gc.getTimeInMillis());
		Date startDay = gc.getTime();
		gc = new GregorianCalendar(2018, 10, 10);
//		Date endDay = new Date(gc.getTimeInMillis());
		Date endDay = gc.getTime();
		int count = 0;
		System.out.println("--------------Test--------------");
		System.out.print("startDay : ");
		System.out.println(startDay);
		
		while (startDay.getTime() < endDay.getTime()) {
			startDay = addDay(startDay);
			System.out.println(startDay);
			count++;
		}
		System.out.println(count);
		ArrayList<String> al = getDateRange("2018.01.20", "2018.01.23");
		int stayCount = getStayCount("2018.01.20", "2018.01.23");
		for (String s : al) {
			System.out.println(s);
		}
		System.out.println(al.size());
		System.out.println("stayCount : " + stayCount);
		Date testDate = matchReservation("9", 2018, 11);
		System.out.print("testDate : " );
		System.out.println(testDate);
	}

	public static Date addDay(Date date) {
		// TODO you may want to check for a null date and handle it.
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		
		return cal.getTime();
	}
	
	public static ArrayList<String> getDateRange(String entranceDay, String checkoutDay){
		ArrayList<String> al = new ArrayList<String>();
		int[] entYearMonthDay = splitDay(entranceDay);
		int eYear = entYearMonthDay[0];
		int eMonth = entYearMonthDay[1];
		int eDay = entYearMonthDay[2];
		int[] checkYearMonthDay = splitDay(checkoutDay);
		int cYear = checkYearMonthDay[0];
		int cMonth = checkYearMonthDay[1];
		int cDay = checkYearMonthDay[2];
		Calendar cal = Calendar.getInstance();
		GregorianCalendar gc = new GregorianCalendar(eYear, eMonth - 1, eDay);
		Date startDay = new Date(gc.getTimeInMillis());
		gc = new GregorianCalendar(cYear, cMonth - 1, cDay);
		Date endDay = gc.getTime();
		while (startDay.getTime() < endDay.getTime()) {
			cal.setTime(startDay);
			String date = cal.get(Calendar.YEAR) + "." + addZero(cal.get(Calendar.MONTH) + 1) + "." 
					+ addZero(cal.get(Calendar.DAY_OF_MONTH));
			al.add(date);
			cal.add(Calendar.DATE, 1);
			startDay = cal.getTime();
		}
		return al;
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

	public static int[] splitDay(String day) {
		String[] temp = day.split("[.]");
		int[] yearMonthDay = new int[3];
		for (int i = 0; i < 3; i++) {
			yearMonthDay[i] = Integer.parseInt(temp[i]);
		}
		return yearMonthDay;
	}
	
	public static Date matchReservation(String startDay, int year, int month) {
		GregorianCalendar gc = new GregorianCalendar(year, month - 1, Integer.parseInt(startDay));
		Date startDate = new Date(gc.getTimeInMillis());
		ArrayList<String> al = new ArrayList<String>();
		Calendar cal = Calendar.getInstance();
		cal.setTime(startDate);
		for (int i = 0; i < 15; i++) {
//			cal.setTime(startDate);
			System.out.println("cal.getTime() : " + cal.getTime());
			al.add(cal.get(Calendar.YEAR) + addZero(cal.get(Calendar.MONTH) + 1) 
			+ addZero(cal.get(Calendar.DAY_OF_MONTH)));
			cal.add(Calendar.DATE, 1);
//			startDate = cal.getTime();
		}
		return cal.getTime();
	}
	
	public static int getStayCount(String entranceDay, String checkoutDay) {
		int stayCount = 0;
		int[] entYearMonthDay = splitDay(entranceDay);
		int eYear = entYearMonthDay[0];
		int eMonth = entYearMonthDay[1];
		int eDay = entYearMonthDay[2];
		int[] checkYearMonthDay = splitDay(checkoutDay);
		int cYear = checkYearMonthDay[0];
		int cMonth = checkYearMonthDay[1];
		int cDay = checkYearMonthDay[2];
		Calendar cal = Calendar.getInstance();
		GregorianCalendar gc = new GregorianCalendar(eYear, eMonth - 1, eDay);
		Date startDay = new Date(gc.getTimeInMillis()); // gc.getTime()과 같음
		gc = new GregorianCalendar(cYear, cMonth - 1, cDay);
		Date endDay = gc.getTime();
		while (startDay.getTime() < endDay.getTime()) {
			cal.setTime(startDay);
			cal.add(Calendar.DATE, 1);
			startDay = cal.getTime();
			stayCount++;
		}
		return stayCount;
	}
}
