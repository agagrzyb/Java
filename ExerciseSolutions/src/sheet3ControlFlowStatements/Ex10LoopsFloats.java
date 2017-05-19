package sheet3ControlFlowStatements;

public class Ex10LoopsFloats{
	public static void main(String[]args){
		
		Ex10LoopsFloats ex10 = new Ex10LoopsFloats();
		
		double num1 = 10.28;
		double num2 = 0.23;
		double num3 = 3125.23;
		
		ex10.allDifferentOrTwoOrMoreAreTheSame(num1, num2, num3);
		ex10.largestAndSmallest(num1, num2, num3);
		ex10.numbersAverage(num1, num2, num3);
		}
		
		public void allDifferentOrTwoOrMoreAreTheSame(double num1, double num2, double num3){
			if( num1!=num2 && num2!=num3 && num1!=num3){
				System.out.print("Numbers are all different : \n" + num1 + ", " + num2 + ", " + num3);
			}else if(num1==num2 && num2==num3 && num1==num3) {
				System.out.print("All numbers are the same : \n" + num1 + ", " + num2 + ", " + num3);
			}else if(num1==num2) {
				System.out.print("Two numbers are the same : \n" + num1 + ", " + num2 + ", " + num3);
			}else if(num2==num3) {
				System.out.print("Two numbers are the same : \n" + num1 + ", " + num2 + ", " + num3);
			}else if(num1==num3) {
				System.out.print("Two numbers are the same : \n" + num1 + ", " + num2 + ", " + num3);
			}else{
				System.out.println("Something went wrong...");
			}
			System.out.println("\n");
		}
		public void largestAndSmallest(double num1, double num2, double num3){
			if(num1>num2 && num1>num3){
				System.out.print("Number 1 is the largest : \n" + num1 + ", " + num2 + ", " + num3);
			}else if(num2>num1 && num2>num3){
				System.out.print("Number 2 is the largest : \n" + num1 + ", " + num2 + ", " + num3);
			}else if(num3>num1 && num3>num2){
				System.out.print("Number 3 is the largest : \n" + num1 + ", " + num2 + ", " + num3);
			}else{
				System.out.println("Some numbers may be the same...");
			}
			System.out.println("\n");
			if(num1<num2 && num1<num3){
				System.out.print("Number 1 is the smallest : \n" + num1 + ", " + num2 + ", " + num3);
			}else if(num2<num1 && num2<num3){
				System.out.print("Number 2 is the smallest : \n" + num1 + ", " + num2 + ", " + num3);
			}else if(num3<num1 && num3<num2){
				System.out.print("Number 3 is the smallest : \n" + num1 + ", " + num2 + ", " + num3);
			}else{
				System.out.println("Some numbers may be the same...");
			}
			System.out.println("\n");
		}
		
		public void numbersAverage(double num1, double num2, double num3){
			double average;
			average = (num1 + num2 + num3)/3;
			System.out.printf("The average is %.2f\n", average);
		}
}