package sheet16StringsAndStringsBuilder;

import java.util.Scanner;

public class Exercise5_SearchForALetter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		for(int runThreeTimes = 0 ;runThreeTimes < 3; runThreeTimes++){
			System.out.println("Enter a word : ");
			String word = scanner.nextLine();		
			System.out.println("Word : " + word);
			System.out.println("Enter a search character : ");
			char character = scanner.nextLine().charAt(0); // .charAt(0) will return the first character in the string/char
			System.out.println("Character : " + character);
			//converting String to a character array
			char [] letters = word.toCharArray();
			//set boolean
			boolean isFound = false;
			//loop through char [] letters array
			for(int i=0; i<letters.length; i++){ 
				//if character ifFound...
				if(letters[i] == character){
					System.out.println("Character " + character  + " was found at position : " + (i+1));
					isFound = true;	//true
				}
			}
			if(!isFound)//false
				System.out.println(character  + " was not found ");	
		}	  
		scanner.close();
		System.out.println("End of work...");
	}
}
