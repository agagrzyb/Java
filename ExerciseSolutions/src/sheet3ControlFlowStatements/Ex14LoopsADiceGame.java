package sheet3ControlFlowStatements;

import java.lang.Math;
public class Ex14LoopsADiceGame{
	public static void main(String[]args){
			
		int die1;
		int die2;
		//double roll;
		double rollMultiply;
		double rollAdd;
		double rollBonus;
		double rollMinus;

		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		rollMultiply = die1*die2;
		rollAdd = die1+die2;
		rollBonus = die1*die2 + 10;
		rollMinus = die1*die2 - 4;
		
		System.out.println("The first die : " + die1);
		System.out.println("The second die : " + die2);
		System.out.println("Your normal total roll is " + rollMultiply);
		
		if(die1 == 6 || die2 == 6){
			System.out.println("Your Add only total roll is " + rollAdd);
		}else if(die1 == 3 || die2 ==3){
			System.out.println("Your total roll is " + rollBonus + " ( plus 10 bonus points )");
		}else if(die1 == 5 || die2 ==5){
			System.out.println("Your total roll is " + rollMinus + "( minus 4 points)");
		}else{}
	}
}
	
