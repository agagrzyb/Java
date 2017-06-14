package sheet16StringsAndStringsBuilder;

import java.util.Scanner;

public class Excercise7_ComparingWords {

	public static void main(String[] args) {
		//ask the user to input two words and compare them
		Scanner scanner = new Scanner(System.in);{
			System.out.println("Enter a word : ");
			String input1 = scanner.nextLine();
			System.out.println("Enter another word : ");
			String input2 = scanner.nextLine();
			System.out.println(input1 + " and " + input2);
			int result = input1.compareTo(input2);
			if(result > 0)
				System.out.println(input1 + " follows " + input2);
			else
				System.out.println(input1 + " precedes " + input2);
		}
		scanner.close();
	}
}
