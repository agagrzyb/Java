package sheet3ControlFlowStatements;

public class Ex11LoopsInvoicingSystem{
	public static void main(String[]args){
		Ex11LoopsInvoicingSystem Ex11 = new Ex11LoopsInvoicingSystem();
		int product = 1;
		int productOver100 = product - 100;
		double priceEuro = 15.99;
		
		Ex11.costOfTheOrder(product, productOver100, priceEuro);

	}
	public void costOfTheOrder(int product, int productOver100, double priceEuro){
		if(product<=100){
			double price = product * priceEuro;
			System.out.println("Price for first 100 items : " + price); 
		}else if(product>100){
			double price = product * priceEuro;
			System.out.printf("Price for first 100 items : %.2f\n", price);
			double discountPrice = productOver100 * (priceEuro* 0.75);
			System.out.printf("Price for 100+ items : %.2f\n", discountPrice);
			double totalPrice = price + discountPrice;
			System.out.printf("Total price is :  %.2f\n ", totalPrice);
			
		}else{
			System.out.print("Something went wrong... :( ");
		}
	}
	
}