package test.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ShowDate {

	public static void main(String[] args) {
		DateCalculator totalDay = new DateCalculator();
		System.out.println(totalDay.isLeapYear(2018) == true ? "윤년" : "평년");
		long total = totalDay.getDays();
		System.out.println("총날짜수 : " + total);
	}
}
