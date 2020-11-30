package com.ydm;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		showCal(2020, 11);
	}

	public static void showCal(int year, int month) {
		System.out.println("----------------[" + year + "년 " + month + "월]----------------");

		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%3s\t", days[i]);
		}
		System.out.println();
		int tMonth = month - 1;
		Calendar cal = Calendar.getInstance();
		cal.set(year, tMonth, 1);
		int endOfDay = cal.getActualMaximum(Calendar.DATE);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i <= endOfDay; i++) {
			if (i == 1) {
				for (int j = 1; j < dayOfWeek; j++) {
					System.out.print("	");
				}
			}
			if (i < 10) {
				System.out.print("");
			}
			System.out.printf("%3s\t", i);
			if (dayOfWeek % 7 == 0) {
				System.out.println();
			}
			dayOfWeek++;
		}
		System.out.println();
		System.out.println("----------------------------------------------");
	}
}