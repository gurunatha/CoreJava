package com.infotech.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ConvertDateCalenderInToLocalDateApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		LocalDateTime localdateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		System.out.println(localdateTime);
		
		Calendar calender = Calendar.getInstance();
		LocalDateTime localDateTime1 = LocalDateTime.ofInstant(calender.toInstant(), ZoneId.systemDefault());
		System.out.println(localDateTime1);
		
		String format = localDateTime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		System.out.println(format);
		String format1 = localDateTime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
		System.out.println(format1);
		String format3 = localDateTime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		System.out.println(format3);
		String format4 = localDateTime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.US));
		System.out.println(format4);
		String format5 = localDateTime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.ENGLISH));
		System.out.println(format5);
	}

}
