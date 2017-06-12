package sheet16StringsAndStringsBuilder;

import java.util.Scanner;

public class Exercise4_Reverse {
	public static void main(String[]args) {

		System.out.println("Have your say...");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();		
		System.out.println("Your say : " + input);
		sc.close();
		//Palindrome...
		//converts the string to an array of characters (first for loop),
		//reverses the array into a second array (second for loop),
		//and then converts back to a string.
		int len = input.length();
		char [] tempCharArray = new char[len];
		char [] charArray = new char[len];
		//put original string in an array of chars
		for(int i=0; i<len; i++){
			tempCharArray[i] = input.charAt(i);
		}
		// reverse array of chars
		for(int j = 0; j < len; j++){
			charArray[j] = tempCharArray[len -1 -j];
		}
		String reverse = new String(charArray);
		System.out.println("Your say reversed : " + reverse);

		//convert the palindrome string to a string builder, using the reverse() method in the StringBuilder class.
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();  // reverse it
		System.out.println("StringBuilder : " + sb);
	}
}
