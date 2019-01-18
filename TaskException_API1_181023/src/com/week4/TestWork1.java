package com.week4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestWork1 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		int year, month, day, yo ,hour, minute, second;
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DAY_OF_MONTH);
		hour = cal.get(Calendar.HOUR_OF_DAY);
		yo = cal.get(Calendar.DAY_OF_WEEK);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
		System.out.printf("%d년 %d월 %d일 %s요일 %d시 %d분 %d초\n", year, month, day, days[yo - 1], 
				hour, minute, second);
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 E요일 hh시 mm분 ss초");
		Date today = new Date();
		String to = sdf.format(today);
		System.out.println(to);
	}

}
