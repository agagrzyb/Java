package sheet2Methods;

public class Ex6AverageTotalReturned{
	public static void main(String [] args){
			
		Ex6AverageTotalReturned m = new Ex6AverageTotalReturned();
		
		double answer1 = m.getAverage(12.99, 10.99, 10);
		System.out.println("result " + answer1);
		
		double answer2 = m.getTotal(12.99, 10.99, 10);
		System.out.println("result " + answer2);
	}
	public double getAverage(double average1, double average2, int average3) {
		double result;
		result = (average1 + average2 + average3)/3;	
	
	return result;
	}
	public double getTotal(double average1, double average2, int average3){
		double result;
		result = average1 + average2 + average3;	
	
	return result;
		
	}

}