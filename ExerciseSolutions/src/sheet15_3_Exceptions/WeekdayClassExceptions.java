package sheet15_3_Exceptions;

public class WeekdayClassExceptions {
	
	//member variables
	private String weekday;
	//static class variables
	public static final String MONDAY = "monday";
	public static final String TUESDAY = "tuesday";
	public static final String WEDNESDAY = "wednesday";
	public static final String THURSDAY = "thursday";
	public static final String FRIDAY = "friday";
	public static final String SATURDAY = "saturday";
	public static final String SUNDAY = "sunday";
	//constructors
	public WeekdayClassExceptions() {
		
	}
	public WeekdayClassExceptions(String weekday) throws InvalidWeekdayException {
		super();
		setWeekday(weekday); //Unhandled exception type InvalidWeekdayException
	}	
	
	//methods, getters and setters
	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) throws InvalidWeekdayException {
		if(!weekday.equalsIgnoreCase(FRIDAY) || !weekday.equalsIgnoreCase(SATURDAY)){
			throw new InvalidWeekdayException("In the WeekdayClassExceptions class : " + weekday);
		}else{
		this.weekday = weekday;
		}
	}	
	//toString
	@Override
	public String toString() {
		return "WeekdayClassExceptions : Weekday = " + weekday;
	}
}
