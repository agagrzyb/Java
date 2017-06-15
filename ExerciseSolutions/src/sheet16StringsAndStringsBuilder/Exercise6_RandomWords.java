package sheet16StringsAndStringsBuilder;


import java.util.Random;
import java.util.Scanner;

public class Exercise6_RandomWords {

	public static void main(String[] args) {
		//create my String array
		String [] myArray = {"Monday", "Tuesday", "Wednesday","Thursday","Friday", "Saturday", "Sunday"};
		//pick random word from myArray
		String word = (myArray[new Random().nextInt(myArray.length)]);
		Scanner scanner =  new Scanner(System.in);
		//prompt the user...
		System.out.println("There are " + word.length() + " letters in this randomly selected word. Please guess a letter : ");
		//set counter to 0
		int counter = 0;
		//ask user to try to guess the letter 8 times
		for(int runEightTimesOnly = 0 ;runEightTimesOnly < 8; runEightTimesOnly++){
			String input = scanner.nextLine();
			System.out.println("Letter entered : " + input);
			//if the match is found...
			if(word.indexOf(input)!=-1){
				System.out.println("Letter " + input + " was found at position : " + (word.indexOf(input)+1));	
			}else{
				System.out.println(input  + " was not found");	
				counter++;// increment counter
				System.out.println("Counter of incorect guesses : " + counter);
			}
			System.out.println("Your next guess : ");
			//counter result
		}System.out.println("Counter of incorect guesses : " + counter);
		scanner.close();
		System.out.println("End of work...");
	}
}