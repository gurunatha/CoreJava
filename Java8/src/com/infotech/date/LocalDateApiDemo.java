package com.infotech.date;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate1 = LocalDate.now();
		System.out.println(localDate1);
		
		Clock clock = Clock.systemDefaultZone();
		LocalDate localDate2 = LocalDate.now(clock);
		System.out.println(localDate2);
		ZoneId zoneId = ZoneId.of("Australia/Darwin");
		LocalDate localDate3 = LocalDate.now(zoneId);
		System.out.println(localDate3);
		
		LocalDateTime localDateTime = LocalDateTime.now(zoneId);
		System.out.println(localDateTime);
		LocalDateTime localDateTime1 = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(localDateTime1);
		
		String text = "2017-03-25";
		String text1 = "25-03-2017";
		LocalDate localDate4 = LocalDate.parse(text1,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(localDate4);
		
		String format = LocalDate.parse(text).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(format);
		System.out.println("-----------");
		
		LocalDate localDate5 = localDate4.plusDays(2);
		System.out.println(localDate5);
		
		LocalDate localDate6 = localDate4.minusDays(2);
		System.out.println(localDate6);

		period();
	}
	
	public static void period()
	{
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime plus = localDateTime.plus(Period.ofDays(5));
		System.out.println(plus);
		
		
	}

}



















