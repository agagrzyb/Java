package sheet5PracticeCreatingClasses;

import java.io.ObjectInputStream.GetField;

import javax.sql.rowset.CachedRowSet;

public class Ex5PersonalComputer {
	// member variables section // belong to the object
	private int id;						// user id
	private int ram;					// RAM
	private int hd;						// Hard Drive
	private String operatingSystem;		// Operating System
	private int monitorSize;			// Monitor Size
	private int cost;					// Cost
	static int idCounter;				// user idCounter

	// static class variables // belong to the class 
	// Constants for RAM
	public static final int RAM_4_GB = 4;
	public static final int RAM_8_GB = 8;
	public static final int RAM_16_GB =16;
	//Constants for HARDDRIVE
	public static final int IDE = 20;
	public static final int SATA = 21;
	public static final int SCSI = 22;
	public static final int SAS = 23;
	//Constants for MONITORSIZE
	public static final int SIZE_14 = 14;
	public static final int SIZE_15 = 15;
	public static final int SIZE_17 = 17;

	// constructors
	public Ex5PersonalComputer(){
		id=idCounter;
		idCounter++;
		
	}
	public Ex5PersonalComputer(int ram, int hardDrive, String operatingSystem,
			int monitorSystem){
		this();
		setRam(ram);
		setHd(hd);
		this.operatingSystem = operatingSystem;
		setMonitorSize(monitorSize);

	}

	// methods, setters&getters
	//RAM
	public void setRam(int ram){
		switch(ram){
		case RAM_8_GB:
		case RAM_16_GB:
			this.ram = ram;
			break;
		default:
			System.out.println("Invalid RAM, setting to RAM 4 GB");
			this.ram = RAM_4_GB;
			break;
		}
	}
	public int getRam(){
		return ram;
	}
	//Hard drive
	public void setHd(int hd){
		switch(hd){
		case SAS:
		case SATA:
		case SCSI:
			this.hd = hd;
			break;
		default:
			System.out.println("Invalid Hard drive, setting to IDE");
			this.hd = IDE;
			break;
		}
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
		switch(monitorSize) {
		case SIZE_15:
		case SIZE_17:
			this.monitorSize = monitorSize;
			break;
		default:
			System.out.println("Invalid monitor size, setting to Size 14");
			this.monitorSize = SIZE_14;
			break;
		}
	}
	public int getMonitorSize() {
		return monitorSize;
	}
	//Cost
	public void setCost(int cost){
		this.cost = cost;
	}
	public int getCost(){
		return cost;
	}
	// get ONLY for user id
	int getId(){
		return id;
	} 
	//get AsString
	private String getRamAsString(){
		switch(ram){
		case RAM_8_GB:
			return "RAM 8 GB";
		case RAM_16_GB:
			return "RAM 16 GB";
		default:
			return "RAM 4 GB";
		}
	}
	private String getHdAsString(){
		switch (hd) {
		case SAS:
			return "SAS";
		case SATA:
			return "SATA";
		case SCSI:
			return "SCSI";
		default:
			return "IDE";
		}
	}

	private String getMonitorSizeAsString(){
		switch (monitorSize) {
		case SIZE_15:
			return "15";
		case SIZE_17:
			return "17";
		default:
			return "14";
		}
	}
	// toString
	public String toString(){
		return "\nUser number : " + Ex5PersonalComputer.idCounter +
				"\nRAM : " + getRamAsString() +
				"\nHard drive : " + getHdAsString() +
				"\nOperating System : " + operatingSystem +
				"\nMonitor size : " + getMonitorSize() +
				"\nCost : ";

	}
}
