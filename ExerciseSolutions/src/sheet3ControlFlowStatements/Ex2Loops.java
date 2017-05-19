package sheet3ControlFlowStatements;

public class Ex2Loops{
	public static void main(String [] args){
		int a = 100;
		while(a <= 200){
			System.out.println("a While Loop output is " + a);	
			a+= 2;
		}
		
		for(int b = 100; b<=200; b += 2){
			System.out.println("a For Loop output is " + b);
		
		}
	}
}