package sheet2Methods;

public class ExerMethods{
	public static void main (String [] args){
		ExerMethods m = new ExerMethods();
		m.addTwoNumbers(3, 5);
		m.multiplyTwoNumbers(3, 5);
		m.divideTwoNumbers(20, 5);
		m.subtractTwoNumbers(20, 5);
		m.remainderTwoNumbers(20, 3);
		
	} //end of main
	public void addTwoNumbers(int a, int b){
		int result;
		result = a + b;
		System.out.printf("The total of %d and %d is %d\n", a, b, result);
	}
	public void multiplyTwoNumbers(int a, int b){
		int result;
		result = a * b;
		System.out.printf("%d multiply by %d is %d\n", a, b, result);
	}
	
	public void divideTwoNumbers(int a, int b){
		int result;
		result = a / b;
		System.out.printf("%d divided by %d is %d\n", a, b, result);
	}
	
	public void subtractTwoNumbers(int a, int b){
		int result;
		result = a - b;
		System.out.printf("%d minus %d is %d\n", a, b, result);
	}
	
	public void remainderTwoNumbers(int a, int b){
		int result;
		result = a % b;
		System.out.printf("The remainder %d %% %d is %d", a, b, result);
	}
	
} //end of class
/*
class Remainder {

  public static void main (String args[]) {

    int i = 10;
    int j = 3;

    System.out.println("i is " + i);
    System.out.println("j is " + j);
  
    int k = i % j;
    System.out.println("i%j is " + k);
  }

}*/