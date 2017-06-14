package sheet16StringsAndStringsBuilder;

import java.util.Random;
import java.util.Scanner;

public class Exercise6_RandomWords {

	public static void main(String[] args) {
		System.out.println("-- Random Words from myArray--");
		String [] myArray = {"red"};// {"Monday", "Tuesday", "Wednesday","Thursday","Friday", "Saturday", "Sunday"};
		//int myArrayLength = myArray.length;
		//int randomNumber = (int)(Math.random() * myArray.length);	
		//int randomNumber = (int)(Math.random()*5);
		//System.out.println(randomNumber);

		String word = (myArray[new Random().nextInt(myArray.length)]);
		Scanner scanner =  new Scanner(System.in);
		System.out.println("There are " + word.length() + " letters in this randomly selected word. Please guess a letter : ");
		int counter =0;
		for(int runEightTimesOnly = 0 ;runEightTimesOnly < 3; runEightTimesOnly++){
			String input = scanner.nextLine();
			System.out.println("Letter entered : " + input);
			

			char [] letters = word.toCharArray();
			for(int i=0;i<letters.length;i++){
				
			if(i == word.indexOf(input))
					System.out.println("Letter " + input + " was found at position : " + (word.indexOf(input)+1));	
			if(i != word.indexOf(input))
					System.out.println(input  + " was not found at this position");	
				
			counter++;
			}
			System.out.println("Your next guess : ");
			//System.out.println((letters.length-1) ?"Game over..."  : "Your next guess : ");
			
		}System.out.println("Counter : " + counter);
		//String word = myWords[myArray];
		//System.out.println("How many characters is in : " + word);
		scanner.close();
		System.out.println("End of work...");
	}
}