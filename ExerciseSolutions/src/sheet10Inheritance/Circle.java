package sheet10Inheritance;

public class Circle extends Shape{
	//member variables
	private int radius;
	//constructors
	public Circle() {

	}
	public Circle(Colour colour, int radius) {
		super(colour);
		this.radius = radius;

	}
	//methods, setters and getters

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw(){
		System.out.println("\nDrawing a Circle");
	}


	//toString
	@Override
	public String toString() {
		return "-----Circle class-----\n" + super.toString()+
				"\nRadius is : " + radius +" cm";
	}
}
