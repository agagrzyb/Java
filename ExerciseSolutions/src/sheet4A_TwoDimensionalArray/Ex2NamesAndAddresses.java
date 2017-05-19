package sheet4A_TwoDimensionalArray;

import java.util.Scanner;
public class Ex2NamesAndAddresses {

	public static void main(String[] args) {
		String[][] namesAndAddresses= { 
				{"Joe", "12 Main Street, ", "Finglas, ", "Dublin 11."}, 				//S.o.pln(names[0][0]+names[0][1]+names[0][2]+names[0][3]);
				{"Mary","36 Amiens Street, ",  "Dublin 1."},							//[1][0],[1][1],[1][2]
				{"Pat","26 South Main Street, ", "Wexford, ", "Co.Wexford."}};			//[2][0][2][1][2][2][2][3]

		// loop for printing an array
		for(int i = 0;i<namesAndAddresses.length;i++){
			for(int j = 0; j<namesAndAddresses[i].length;j++){
				System.out.print(namesAndAddresses[i][j] + " ");	
			}
			System.out.println();
		}
		System.out.println("******************************");
		// prompt the user to put the name
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Name to find address : ");
		String name = scanner.nextLine();
		scanner.close();
		System.out.println("Full address : ");
		
		boolean isFound = false;//always set the boolean to false first
		//loop through the 2d array
		for (int i = 0; i<namesAndAddresses.length; i++) {
			// j=1, so the counter starts from position 1 not 0
			for (int j = 1; j<namesAndAddresses[i].length; j++) {
				// if first position in the array == to name from scanner input
				if (namesAndAddresses[i][0].equalsIgnoreCase(name)){
					// condition is true and start the loop
					isFound=true;
					//print 2d array
					System.out.print(namesAndAddresses[i][j] + " ");
				}
			}
		}
		if(!isFound)// when the number entered is different to numbers in refNums[] , boolean is true,
			System.out.println("No such name ...no address.");
	}
}