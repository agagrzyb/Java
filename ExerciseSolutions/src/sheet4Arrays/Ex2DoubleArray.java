package sheet4Arrays;
import java.util.Scanner;

public class Ex2DoubleArray{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 values : ");
		
		double [] values = new double[10];
		double total = 0;
		int i = 0;
		for(	; i<values.length; i++){
			double userValue = input.nextDouble();   //  in one line....  
			values[i] = userValue;					 //  values[i] = input.nextDouble();
			total = total + userValue;
		}
		for(i=0; i<values.length;i++){
			System.out.println(values[i]);
		}
		System.out.println("Total : " + total);
		System.out.printf("Average %.2f: ", total/10);
	} 
}
