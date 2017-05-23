package sheet6ArraysOfObjects;

public class PC {
	// member variables section // belong to the object
	private int ram;					// RAM
	private int hd;						// Hard Drive
	private String operatingSystem;		// Operating System
	private int monitorSize;			// Monitor Size
	private int cost;					// Cost

	// static class variables // belong to the class 
	// Constants for RAM
	public static final int RAM_4_GB = 4;
	public static final int RAM_8_GB = 8;
	public static final int RAM_16_GB =16;
	//Constants for HARDDRIVE
	public static final int HARD_DRIVE_500_GB = 500;
	public static final int HARD_DRIVE_1_TB = 1;
	public static final int HARD_DRIVE_2_TB = 2;
	//Constants for MONITORSIZE
	public static final int SIZE_15 = 15;
	public static final int SIZE_17 = 17;
	public static final int SIZE_22 = 22;

	// constructors
	public PC(){
		
	}
	public PC(int ram, int hd, String operatingSystem, int monitorSize){
		this();
		setRam(ram);								// validation
		setHd(hd);									// validation
		this.operatingSystem = operatingSystem;		// passing a String,
		setMonitorSize(monitorSize);				// validation
	}

	// methods, setters&getters
	//RAM
	public void setRam(int ram){
		switch(ram){
		case RAM_4_GB:
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
		case HARD_DRIVE_500_GB:
		case HARD_DRIVE_1_TB:
		case HARD_DRIVE_2_TB:
			this.hd = hd;
			break;
		default:
			System.out.println("Invalid Hard drive, setting to HARD DRIVE 500 GB");
			this.hd = HARD_DRIVE_500_GB;
			break;
		}
	}
	public int getHd(){
		return hd;
	}

	//Operating System
	public void setOperatingSystem(String operatingSystem){
		this.operatingSystem = operatingSystem; 	// WINDOWS, MAC, LINUX
	}
	public String getOperatingSystem(){
		return operatingSystem;						// WINDOWS, MAC, LINUX
	}

	//Monitor Size
	public void setMonitorSize(int monitorSize){
		switch(monitorSize) {
		case SIZE_15:
		case SIZE_17:
		case SIZE_22:
			this.monitorSize = monitorSize;
			break;
		default:
			System.out.println("Invalid monitor size, setting to Size 15");
			this.monitorSize = SIZE_15;
			break;
		}
	}
	public int getMonitorSize() {
		return monitorSize;
	}

	//Cost
	//Calculate cost
	public double calculateCost(){
		// setting default cost = 350; 
		cost = 350;
		// different costs for diff. settings
		if (ram == RAM_8_GB)
			cost += 20;
		else if(ram == RAM_16_GB)
			cost += 40;

		if(hd == HARD_DRIVE_1_TB)
			cost += 60;
		else if (hd == HARD_DRIVE_2_TB)
			cost += 80;

		if(monitorSize == SIZE_17)
			cost += 20;
		else if (monitorSize == SIZE_22)
			cost += 40;

		if(operatingSystem.equals("MAC"))
			cost +=100;
		else if (operatingSystem.equals("LINUX"))
			cost += 20;

		return cost;
	}

	public int getCost(){
		return cost;
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
		case HARD_DRIVE_1_TB:
			return "HARD_DRIVE_1_TB";
		case HARD_DRIVE_2_TB:
			return "HARD_DRIVE_2_TB";
		default:
			return "HARD_DRIVE_500_GB";
		}
	}

	private String getMonitorSizeAsString(){
		switch (monitorSize) {
		case SIZE_17:
			return "17";
		case SIZE_22:
			return "22";
		default:
			return "15";
		}
	}
	// toString
	public String toString(){
		return  "\nRAM : " + getRamAsString() +
				"\nHard drive : " + getHdAsString() +
				"\nOperating System : " + operatingSystem +
				"\nMonitor size : " + getMonitorSizeAsString() + "\"" +
				String.format("\nCost= $%.2f", calculateCost());

	}
}
