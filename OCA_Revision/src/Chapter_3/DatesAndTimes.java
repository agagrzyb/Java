package Chapter_3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

/*
 * LocalDate
 * LocalTime
 * LocalDateTime
 * 
 * constructors are private, static mathods: now(), of()
 * 
 * */
public class DatesAndTimes {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		System.out.println("The date now : " + date1);
		
		LocalTime time1 = LocalTime.now();
		System.out.println("The time now : " + time1);
		
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println("Date and Time : " + dateTime1);
		
		LocalDate myBirthday = LocalDate.of(1984, Month.MARCH, 1);
		System.out.println("My Birthday : " + myBirthday);
		
		LocalTime time2 = LocalTime.of(11, 8);
		System.out.println("LocalTime using LocalTime.of() method : " + time2);
		
		LocalDateTime dateTime2 = LocalDateTime.of(2017, 8, 17, 11, 11);
		System.out.println("LocalDateTime.of() method : " + dateTime2);
		
		//localDate and localTime are immutable... must be reassign !
		LocalDateTime midnightNYE = LocalDateTime.of(2017, Month.DECEMBER, 31, 23, 59);
		midnightNYE.plusMinutes(1);
		System.out.println(midnightNYE);
		midnightNYE = midnightNYE.plusMinutes(1);
		System.out.println(midnightNYE);
		
		LocalDate today = LocalDate.now();
		today = today.plusMonths(3);
		System.out.println(today);
		today = today.plus(3, ChronoUnit.MONTHS);
		System.out.println(today);
		
		LocalDate date3 = LocalDate.of(2018, 1, 1);
		LocalTime time3 = LocalTime.of(9, 0);
		LocalDateTime dateTime3 = LocalDateTime.of(2018, Month.JANUARY, 1, 9, 0);
		System.out.println(dateTime3);
		//chain together plus() and minus() methods: 
		//add 1 year and 2 months and take off 1 hour.
		dateTime3 = dateTime3.plusYears(1).plus(2, ChronoUnit.MONTHS).minusHours(1);
		System.out.println(dateTime3);
		
		/*
		time3 = time3.plus(1, ChronoUnit.MONTHS);
		System.out.println(time3); //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Months
		*/
		
		//PERIODS
		Period ofDays = Period.ofDays(6);
		Period ofWeeks = Period.ofWeeks(2);
		Period ofMonths = Period.ofMonths(13);
		Period ofYears = Period.ofYears(3);
		Period ofYearsMonthsDays = Period.of(1, 3, 4);
		
		/* create a Date  for today
		 * create a Period of time for 4 days and 18 weeks
		 * add it onto today
		 */
		
		LocalDate today4 = LocalDate.now();
		Period days4 = Period.ofDays(4);
		Period weeks18 = Period.ofWeeks(18);
		today4 = today4.plusWeeks(18).plusDays(4);
		System.out.println(today4); //2017-12-25
		
		LocalDate christmas = LocalDate.of(2017, 12, 25);
		System.out.println("christmas : " + christmas.until(LocalDate.now()));
		
		Period ofTime = Period.of(1, 2, 3);
		System.out.println("Period ofTime = Period.of(1, 2, 3) : " + ofTime);
		
		//CANNOT chain static methods ... only last method will be added...
		Period cannotChain = Period.ofYears(2).ofWeeks(3).ofDays(4);
		System.out.println("cannot chain static methods : " + cannotChain);
		
		Period rightWay = Period.ofYears(2);
		rightWay = rightWay.plus(Period.ofWeeks(3));
		rightWay = rightWay.plus(Period.ofDays(4));
		System.out.println("rightWay of using static methods"
				+ " : " + rightWay);
		

		

	}

}
