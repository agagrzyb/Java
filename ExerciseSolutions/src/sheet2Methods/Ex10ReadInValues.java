package sheet2Methods;

import java.util.Scanner;
public class Ex10ReadInValues{
	public static void main (String [] args){
		Ex10ReadInValues ex10 = new Ex10ReadInValues();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first value: ");
		double value1 = input.nextDouble();
		
		System.out.print("Enter second value: ");
		double value2 = input.nextDouble();
		
		System.out.print("Enter third value: ");
		double value3 = input.nextDouble();
		
		double value = ex10.getTotal(value1, value2, value3);
		System.out.println("Total value: " + value);
		input.close();
	}
	public double getTotal(double value1, double value2, double value3){
		return value1 + value2 + value3;
	}
} //end of class

