package sheet3ControlFlowStatements;

import java.util.Scanner;
public class Ex9LoopsIfElseStatements{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int value = input.nextInt();
		
		if(value>=1 && value <= 10)
			System.out.println("Value is between 1 and 10 : " + value);
		else if(value >= 11 && value <= 20)
			System.out.println("Value is between 11 and 20 : " + value);
		else if(value >= 21 && value <= 30)
			System.out.println("Value is between 21 and 30 : " + value);
		else if(value >= 31 && value <= 40)
			System.out.println("Value is between 31 and 40 : " + value);
		else if(value >= 41 && value <= 50)
			System.out.println("Value is between 41 and 50 : " + value);
		else
			System.out.println("Value is more than 50 : " + value);
		
		input.close();
	}
}