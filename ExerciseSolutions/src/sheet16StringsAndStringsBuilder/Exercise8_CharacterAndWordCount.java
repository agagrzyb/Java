package sheet16StringsAndStringsBuilder;

import java.util.Scanner;

public class Exercise8_CharacterAndWordCount {
	//ask user to input sentence,
	//output the number of characters with spaces,
	//the number of characters without the spaces
	//and the number of words in the sentence
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Have your say ! : ");
		String input = scanner.nextLine();
		System.out.println(input);
		String [] words = input.split(" ");
		System.out.println("Words : " + words.length);
		System.out.println("Characters (with spaces) : " + input.length());
		System.out.println("Characters (without spaces) : " + input.replace(" ", "").length());
		scanner.close();
	}
}