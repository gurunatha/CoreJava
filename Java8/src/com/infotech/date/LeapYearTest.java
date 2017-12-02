package com.infotech.date;

import java.time.LocalDate;
import java.util.Calendar;

public class LeapYearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		
		LocalDate date1 = LocalDate.of(2000, 5, 25);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));
		
		System.out.println(date1.isLeapYear());
		int dayOfYear = date.getDayOfYear();
		System.out.println(dayOfYear);

	}

}
