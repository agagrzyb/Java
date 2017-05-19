package sheet5PracticeCreatingClasses;

import java.io.ObjectInputStream.GetField;

public class Ex5PersonalComputer {
	// member variables section
	private int id;						// user id
	private int ram;					// RAM
	private int hd;						// Hard Drive
	private String operatingSystem;		// Operating System
	private int monitorSize;			// Monitor Size
	private int cost;					// Cost
	static int idCounter;				// user idCounter

	// static class variables
	// Constants for RAM
	public static final int RAM_4_GB = 4;
	public static final int RAM_8_GB = 8;
	public static final int RAM_16_GB =16;
	//Constants for HARDDRIVE

	//Constants for MONITORSIZE

	// constructors
	public Ex5PersonalComputer(){
		id=idCounter;
		idCounter++;
	}
	public Ex5PersonalComputer(int ram, int hardDrive, String operatingSystem,
			int monitorSystem, int cost){
		this();


	}

	// methods, setters&getters
	//RAM
	public void setRam(int ram){
		this.ram = ram;
	}
	public int getRam(){
		return ram;
	}
	//Hard drive
	public void setHd(int hd){
		this.hd = hd;
	}
	public int getHd(){
		return hd;
	}
	//Operating System
	public void setOperatingSystem(String operatingSystem){
		this.operatingSystem = operatingSystem;
	}
	public String getOperatingSystem(){
		return operatingSystem;
	}
	//Monitor Size
	public void setMonitorSize(int monitorSize){
		this.monitorSize = monitorSize;
	}
	private int getMonitorSize() {
		return monitorSize;
	}


	// get ONLY for user id
	int getId(){
		return id;
	} 
	// toString
	public String toString(){
		return "\nUser number : " + Ex5PersonalComputer.idCounter +
				"\nRAM : " +
				"\nHard drive : " +
				"\nOperating System : " +
				"\nMonitor size : " +
				"\nCost : ";


	}

}
