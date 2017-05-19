package sheet4Arrays;

import javax.swing.JOptionPane;

public class Ex7OrderingSystem {

	public static void main(String[] args) {
		int [] refNums = {1000,1001,1002,1003,1004};
		String [] productNames = {"Keybord", "Mouse    ", "Monitor", "Mouse mat", "Speakers"};
		double [] prices = {49.99, 15.50, 124.99, 3.99, 23.5};

		System.out.println("Reference Number \t Product Name \t\t Price\n---------------- \t ------------- \t\t ------");
		for(int i = 0; i < refNums.length; i++){
			System.out.println(refNums[i] + "\t\t\t " + productNames[i] + "\t\t " + prices[i] );
		}

		String input = JOptionPane.showInputDialog(null, "Please enter a reference number");
		int refNum = Integer.parseInt(input);// convert string to int,
		JOptionPane.showMessageDialog(null, "Reference number : " + refNum);

		boolean isFound = false;//always set the boolean to false first
		for(int i = 0; i<refNums.length; i++){// loop to go through arrays, 
			if(refNums[i]==refNum){// if number entered is equal to number in refNums[]
				isFound=true;// condition is true and start the loop

				JOptionPane.showMessageDialog(null, "This is a " + productNames[i] + " and it costs " + prices[i]);
				String inputQuant = JOptionPane.showInputDialog(null, "How many would you like to order");
				int quantity = Integer.parseInt(inputQuant);// convert string to int
				double totalCost = quantity * prices[i]; // [i] because its an element in the array
				JOptionPane.showMessageDialog(null, "Total cost : " + totalCost);
				break; // break finishes the loop, when condition is found
			}
		}
		if(!isFound)// when the number entered is different to numbers in refNums[] , boolean is true,
			JOptionPane.showMessageDialog(null, "No product found");
	}
}