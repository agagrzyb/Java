package sheet15_2_Exceptions;

public class ClockClassExceptions {
	//member variables section
	private int hours;
	private int minutes;
	private int seconds;

	//constructors
	//create a constructor that will set up an initial time.
	public ClockClassExceptions(){

	}
	public ClockClassExceptions(int hours, int minutes, int seconds){
		this();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	//methods, setters & getters
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}	
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	//Increment each variable - methods
	public void incrHours(int incrHours){
		hours += incrHours;
		if(hours >= 0 && hours>23){
			hours = hours % 24;
		}
	}
	public void incrMinutes(int incrMinutes){
		minutes += incrMinutes;
		if(minutes >= 0 && minutes>59){
			hours+=1;
			minutes=minutes % 60;
		}
	}
	public void incrSeconds(int incrSeconds){
		seconds += incrSeconds;
		if(seconds >= 0 && seconds>59){
			minutes+=1;
			seconds=seconds % 60;
		}
	}
	//Reset time method
	public void resetTime(){
		 //hours = minutes = seconds =0;
		hours = 0;
		minutes = 0;
		seconds = 0;
		
		

	}

	//toString
	@Override
	public String toString() {
		return String.format("\nTime : %02d:%02d:%02d:", hours, minutes, seconds);

	}
}
