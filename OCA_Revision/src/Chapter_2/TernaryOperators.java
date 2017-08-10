package Chapter_2;

public class TernaryOperators {

	public static void main(String[] args) {
		int x = 82;
		double profit=0;
		if(x > 80 && x < 90){
			profit = 0.2 * x;
			System.out.println("if :" + profit);
			
		}else{
			profit = 0.5 * x;
			System.out.println("else :"+ profit);
		}
		
		Double profit2 = x >= 80 && x <= 90 ? 0.2 : 
			x > 90 ? 0.5 : 0;
			System.out.println(profit2);


	}

}
