package sheet6ArraysOfObjects;

public class MainForPC {

	public static void main(String[] args) {
		PC pc1 = new PC(4, 500, "WINDOWS", 15); //350
		PC pc2 = new PC(16, 1, "MAC", 17);		//570
		PC pc3 = new PC(4, 2, "LINUX", 22);     //490

		//Put all PC objects into an array

		PC [] allPcs = {pc1, pc2, pc3};

		printPCArray(allPcs);

	}

	public static void printPCArray(PC [] arrayOfPCs) {
		System.out.println("Inside for loop");
		// loop through and call the toString on each
		for (PC onePc : arrayOfPCs)
			// and only print PCs over 400
			if(onePc.calculateCost()>400)
				System.out.println(onePc); // one.toString()
	}

}
