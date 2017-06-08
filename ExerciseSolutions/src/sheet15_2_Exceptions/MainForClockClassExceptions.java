package sheet15_2_Exceptions;

public class MainForClockClassExceptions {

	public static void main(String[] args) {
		ClockClassExceptions time1 = new ClockClassExceptions();
		
		//try catch block
		try{
		time1.setHours(26); 	//if(hours < 0 || hours > 24){
		time1.setMinutes(333);	//if(minutes < 0 || minutes > 60){
		time1.setSeconds(121);	//if(seconds < 0 || seconds > 60){
		}catch(InvalidTimeException e){
			System.out.println("ERROR..." + e.getMessage());
			e.printStackTrace();
		}finally{
			System.out.println("In the finally block");
		}
		
		System.out.println(time1);
/*
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
*/

	}
}
