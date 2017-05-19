package sheet3ControlFlowStatements;

import java.util.Scanner;
public class Ex6LoopsTotalingFromTheConsole{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st integer: ");
		int value1 = input.nextInt();
		System.out.print("Enter 2nd integer: ");
		int value2 = input.nextInt();
		System.out.println("Value 1 + Value 2 is: " + (value1 + value2));
		System.out.print("Enter 3rd integer: ");
		int value3 = input.nextInt();
		input.close();
	
		int total = value1 + value2 + value3;
		System.out.println("Total result is: " + total);
	
	}
}	
