package Chapter_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDatesAndTimes {4

	public static void main(String[] args) {

		//LocalDate
		// SHORT, MEDIUM, LONG and FULL
		LocalDate dateNow = LocalDate.now();
		System.out.println("LocalDate : " + dateNow);
		DateTimeFormatter dtfShortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("FormatStyle.SHORT : " + dtfShortDate.format(dateNow));
		System.out.println(dateNow.format(dtfShortDate));
		
		DateTimeFormatter dtfLongDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println("FormatStyle.LONG :" + dtfLongDate.format(dateNow));
		
		//LocalTime
		LocalTime timeNow = LocalTime.now();
		System.out.println("timeNow :" + timeNow);
		DateTimeFormatter dtfShortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println("dtfShortTime.format(timeNow) : " + dtfShortTime.format(timeNow));
		//CANNOT format the time with a LONG and FULL... only MEDIUM and SHORT
		
		//LocalDateTime
		LocalDateTime myParty = LocalDateTime.of(2017, Month.MARCH, 1, 20, 30);
		System.out.println(myParty);
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT);
		System.out.println("DateTimeFormatter : " + myParty.format(dtf));
		
		//Creating my own format
		DateTimeFormatter dtfMyPattern = DateTimeFormatter.ofPattern("EEEE/MMMM/yy HH:mm:ss");
		System.out.println("dtfMyPattern : " + myParty.format(dtfMyPattern));
		
		//Thursday August 8. 2:05 PM
		//LocalDate date
		dtfMyPattern = DateTimeFormatter.ofPattern("EEEE MMMM d. h:mm a");
		System.out.println("dtfMyPattern : " + LocalDateTime.now().format(dtfMyPattern));
		
		//Parsing Dates and Times
		String strDate = "12/01/17";
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		LocalDate date1 = LocalDate.parse(strDate, formatter);
		System.out.println(date1);
		
		String strTime = "16:04:22";
		
		String strDateTime = "10 November 2017 22:59";

	}

}
