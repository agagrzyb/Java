package sheet7EmployeeAndClockClasses;

public class MainForClockClass {

	public static void main(String[] args) {
		ClockClass time1 = new ClockClass();
		time1.setHours(8);
		time1.setMinutes(30);
		time1.setSeconds(1);
		System.out.println(time1);

		System.out.println("-----------------------------");
		ClockClass time2 = new ClockClass(15, 44, 59);
		System.out.println(time2);
		time2.incrHours(10);
		System.out.println(time2);
		time2.incrMinutes(50);
		System.out.println(time2);
		time2.incrSeconds(17);
		System.out.println(time2);
		System.out.println("------------------------------");
		time2.resetTime();
		System.out.println(time2);


	}
}
