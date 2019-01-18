package com.DateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class DateTest {

	public static void main(String[] args) {

		/*Date d = new Date(2000,2, 24);
		System.out.println(d);*/
		Date today = new Date();
		Long todayLong = today.getTime();
		System.out.println(todayLong);
		System.out.println(today);
		Date day = new Date(1540194564000L);
		System.out.println(day);
		//GregorianCalendar, Calendar
		// Calendar 객체는 추상클래스이기때문에 new로 생성 불가
		// 내부에서 생성하여 그 주소값을 넘겨주는 메소드 getInstance를 사용
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1);
		
		// Calendar를 통해서 년, 월, 일 출력!
		System.out.println(cal1.get(/*Calendar.YEAR*/1) + "년");
		// 시스템 내부적으로 월을 표시할 때 0부터 시작
		// 12월 == 11, 이러한 이유로 값을 넣을때는 -1, 출력을 할 때는 +1을 해야함
		System.out.println(cal1.get(/*Calendar.MONTH*/2) + 1 + "월");
		System.out.println(cal1.get(/*Calendar.DATE*/5) + "일");
		System.out.println(cal1.get(Calendar.DAY_OF_WEEK) + "요일");
		System.out.println(cal1.get(Calendar.AM_PM));
		System.out.println(cal1.get(Calendar.HOUR) + ":" + cal1.get(Calendar.MINUTE) + ":" + cal1.get(Calendar.SECOND));
		System.out.println("HOUR OF DAY : " + cal1.get(Calendar.HOUR_OF_DAY));
		cal1.set(2019, 9, 22);
		
		System.out.println(cal1.get(/*Calendar.YEAR*/1) + "년" + cal1.get(/*Calendar.MONTH*/2) + 1 + "월" + cal1.get(/*Calendar.DATE*/5) + "일" +cal1.get(Calendar.DAY_OF_WEEK) + "요일"
 + cal1.get(Calendar.AM_PM));
		System.out.println(cal1.get(Calendar.HOUR) + ":" + cal1.get(Calendar.MINUTE) + ":" + cal1.get(Calendar.SECOND));
		
		cal1.set(Calendar.YEAR, 2000);
		cal1.set(Calendar.MONTH, 2 - 1);
		cal1.set(Calendar.DATE, 24);
		
		System.out.println(" " + cal1.get(/*Calendar.YEAR*/1) + (cal1.get(/*Calendar.MONTH*/2) + 1) + cal1.get(/*Calendar.DATE*/5)
		+ cal1.get(Calendar.DAY_OF_WEEK));
		
		GregorianCalendar day1 = new GregorianCalendar();
		System.out.println(day1);
		Calendar day2 = new GregorianCalendar();
		int year = day2.get(Calendar.YEAR);
		day2 = new GregorianCalendar(2018, 1, 22, 1, 0);
		today = new Date(day2.getTimeInMillis());
		System.out.println(today);
		
		// Date 객체를 형식에 맞춰서 출력하기 위해서는 SimpleDateFormat 이용
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 E요일 hh시 mm분 ss초");
		String to = sdf.format(today);
		System.out.println(to);
		
		// equals , hashcode -> equals 성립한 경우  hashcode 일치 시켜서 동일한 값 저장되지 않도록함
	}

}
