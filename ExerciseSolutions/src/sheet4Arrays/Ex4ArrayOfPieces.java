package sheet4Arrays;

public class Ex4ArrayOfPieces {

	public static void main(String[] args) {
		double[] prices = {12.50, 11.20, 10.90, 4.99, 5.66, 25.40, 14.30, 33.00, 24.50, 1.25, 2.20, 3.48};
		double[] incrPrices = new double[prices.length];
		
		
		for(int i=0;i<prices.length;i++){
			incrPrices[i] = prices[i] * 1.04;
		}
		System.out.println("Old price\tNew price");
		for(int i = 0; i<prices.length;i++){	
			
			System.out.println(prices[i] + "\t\t" + incrPrices[i]);
		}	
	
	}
}
/*for(int i=0;i<prices.length;i++){
	System.out.printf("%.2f\n" , prices[i]);
	}
	System.out.println("\nNew price increased by 4% : ");
	double value=1.04;
for(int i=0;i<prices.length;i++){
	prices[i] = prices[i] * value;
					
	System.out.printf("%.2f\n" , prices[i]);
}
*/