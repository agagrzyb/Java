package sheet10Inheritance;

public class Triangle extends Shape{
	//member variables

	//constructors
	public Triangle(){

	}
	public Triangle(Colour colour){
		super(colour);
	}
	//methods, setters and getters
	public void draw(){
		System.out.println("\nDrawing a Triangle");
	}
	//toString
	@Override
	public String toString() {
		return "-----Triangle class-----\n" + super.toString();
	}
}
