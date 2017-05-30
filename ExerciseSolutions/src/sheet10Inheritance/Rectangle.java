package sheet10Inheritance;


public class Rectangle extends Shape{
	//member variables
	private double height;
	private double width;
	private double area;
	//constructors
	public Rectangle(){

	}
	public Rectangle(Colour colour, double height, double width) {
		super(colour);
		this.height = height;
		this.width = width;
	}
	//methods, setters and getters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}public void draw(){
		System.out.println("\nDrawing a Rectangle");
	}
	public double getArea(){
		area = height * width;
		return area;
	}

	//toString
	@Override
	public String toString() {
		return "-----Rectangle class-----\n" +super.toString() + 
				"\nRectangle height : " + height + 
				"\nRectangle width : " + width +
				"\nRectangle area : " + area;
	}







}
