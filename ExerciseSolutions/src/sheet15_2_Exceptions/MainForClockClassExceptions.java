package sheet15_2_Exceptions;

public class MainForClockClassExceptions {

	public static void main(String[] args) {
		ClockClassExceptions time1 = new ClockClassExceptions();
		time1.setHours(8);
		time1.setMinutes(30);
		time1.setSeconds(1);
		System.out.println(time1);

		System.out.println("-----------------------------");
		ClockClassExceptions time2 = new ClockClassExceptions(15, 44, 59);
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
