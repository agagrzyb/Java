package sheet3ControlFlowStatements;

public class Ex1Loops{
	public static void main(String [] args){
		int a = 0;
		while(a<23){
			System.out.print(a + ",");
			a++;
		}
		
		a = 0;
		do{
			System.out.print(a + ",");
			a++;
		}while (a<23);
		
		a = 0;
		for( ;a<23;a++){
			System.out.print(a + ",");
		}
	}
}