package sheet3ControlFlowStatements;

public class Ex4Loops{
	public static void main(String [] args){
		int numOfLives = 8;
		do {
			System.out.println("Number of lives: " + numOfLives);
			numOfLives--;
		}while(numOfLives > 0);
	}
}
