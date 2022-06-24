package com.turkcell;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class _37_Date {
	
	public static void main(String[] args) {
		/*
		 * Date date = new Date();
		 * System.out.println(date);
		 * // aylar 0 dan baslar
		 * System.out.println(date.getMonth());
		 * int nowYear = date.getYear() + 1900; // 1900 baslangic kabul eder
		 * System.out.println(nowYear);
		 * System.out.println(new Date(System.currentTimeMillis()));
		 */
		
		// dateTutorialLocale();
		calendarTutorial();
		
	}
	
	public static void dateTutorialLocale() {
		
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss ", locale);
		
		Date date = new Date();
		// System.out.println(date);
		String format = dateFormat.format(date);
		System.out.println(format);
		
	}
	
	// calendar
	public static void calendarTutorial() {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
	}
}
