package sheet3ControlFlowStatements;

import java.util.Scanner;
public class Ex7LoopsTotalOf10Values{
	public static void main(String[]args){


		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 values: ");

		int numValues = 10;
		double total = 0;

		for(int value = 0; value < numValues; value++){
			//System.out.println("Value: ");
			System.out.println("Running total: " + total);
			total += input.nextInt();
		}
		System.out.println("Total: " + total);
		System.out.println("Average: " + (total / numValues));
		input.close();
	}
}