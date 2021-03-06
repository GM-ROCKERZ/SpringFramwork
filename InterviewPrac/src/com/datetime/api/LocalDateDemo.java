package com.datetime.api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateDemo {

	public static void main(String[] args) {

/*		LocalDate date = LocalDate.parse("2020-07-09");
		
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());*/
		
		LocalDate bday = LocalDate.of(2052,03,10);
		
		System.out.println(bday.minusDays(10));
		System.out.println(bday.minusMonths(2));
		System.out.println(bday.minusWeeks(30));
		System.out.println(bday.minusYears(1));
		
		System.out.println(bday);
		
/*		LocalDate interviewDate = LocalDate.of(2016,02,20);
		System.out.println(interviewDate.atTime(12,30));
		System.out.println(interviewDate.atTime(13,05,40));
		System.out.println(interviewDate.atTime(LocalTime.of(14, 59)));*/
		
/*		LocalDate launchbook =LocalDate.of(2019, 05, 12);
		System.out.println(launchbook.toEpochDay());
		
		LocalDate carnivalStart = LocalDate.of(2050, 12, 31);
		LocalDate carnivalEnd = LocalDate.of(2051, 1, 2);
		
		Period periodbetween = Period.between(carnivalStart, carnivalEnd);
		
		System.out.println(periodbetween);
		*/
		
/*		DateTimeFormatter formater = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		LocalDate date = LocalDate.of(2020, 07,11);
		
//		System.out.println(date.format(formater));
		
        System.out.println(formater.format(date));	*/	
		
		
		

		
		
	}

}
