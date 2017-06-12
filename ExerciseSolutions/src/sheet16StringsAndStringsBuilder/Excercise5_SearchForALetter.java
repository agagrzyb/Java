package sheet16StringsAndStringsBuilder;

import java.util.Scanner;

public class Excercise5_SearchForALetter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		for(int runThreeTimes = 0 ;runThreeTimes < 3; runThreeTimes++){
			System.out.println("Enter a word : ");
			String word = scanner.nextLine();		
			System.out.println("Word : " + word);
			System.out.println("Enter a search character : ");
			String character = scanner.nextLine();
			System.out.println("Character : " + character);
			//converting String to a character array
			char [] letters = word.toCharArray();
			for(int i=0; i<letters.length; i++){ 
				if(i == word.indexOf(character)){
					//System.out.println("\nCharacter " + character  + " was found at position : " + letters[i]);
					System.out.println("\nCharacter " + character  + " was found at position : " + (word.indexOf(character)+1));
				}else{
					System.out.println(character  + " was not found ");	
				}
			}
		}
		scanner.close();
		System.out.println("End of work...");
	}
}
