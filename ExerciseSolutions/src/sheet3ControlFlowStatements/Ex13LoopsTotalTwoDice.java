package sheet3ControlFlowStatements;

import java.lang.Math;
public class Ex13LoopsTotalTwoDice{
	public static void main(String[]args){
			
		int dice1;
		int dice2;
		double roll;
		
		Ex13LoopsTotalTwoDice ex13 = new Ex13LoopsTotalTwoDice();
		ex13.mathRand(dice1, dice2, roll);
		
		public void mathRand(int dice1, int dice2, double roll){
		dice1 = (int)(Math.random()*6)+1;
		dice2 = (int)(Math.random()*6)+1;
		roll = dice1+dice2;
		
		System.out.println("The first dice : " + dice1);
		System.out.println("The second dice : " + dice2);
		System.out.println("Your total roll is " + roll);
		}
	}
}
	
