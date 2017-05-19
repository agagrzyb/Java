package sheet3ControlFlowStatements;

public class Ex5LoopsHeightAndBreadthOfARectangleSquare{
	public static void main(String [] args){
		
		double height = 10;
		double length = 20;
		
		Ex5LoopsHeightAndBreadthOfARectangleSquare rect = new Ex5LoopsHeightAndBreadthOfARectangleSquare();
		rect.calculateRectangle(height, length);
	}	
		public void calculateRectangle(double height, double length){
			double area = height * length;
			double perimeter = 2*height + 2*length;
			System.out.println("Area of Rectangle: " + area);
			System.out.println("Perimeter of Rectangle: " + perimeter);
		
			if(height == length){
				System.out.println("The area and perimeter of the square are: " + area + " and " + perimeter);
			}else{
				System.out.println("The area and perimeter of the rectangle are: " + area + " and " + perimeter);
			}
		}
}