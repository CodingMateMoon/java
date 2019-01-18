package howAboutThere;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {
		
	public DateCalculator() {}
	
	public static long getDays() {
		long sumDays = 0L;
		GregorianCalendar gc = new GregorianCalendar();
		int i, year = gc.get(Calendar.YEAR);
		int month = gc.get(Calendar.MONTH) + 1;
		int day = gc.get(Calendar.DAY_OF_MONTH);
		for (i = 1; i < year; i++) {
			if (isLeapYear(i)) {
				sumDays += 366;
			} else {
				sumDays += 365;
			}
		}

		for (i = 1; i < month; i++) {
			if (i == 4 || i == 6 || i == 9 || i == 11) {
				sumDays += 30;
			} else if (i == 2) {
				if (isLeapYear(Calendar.YEAR)) {
					sumDays += 29;
				} else {
					sumDays += 28;
				}
			} else {
				sumDays += 31;
			}
		}

		sumDays += day;
		return sumDays;
	}

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}
}
