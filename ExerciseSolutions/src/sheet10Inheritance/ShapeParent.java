package sheet10Inheritance;

public class ShapeParent {
	//member variables
	private Colour colour;
	public enum Colour {RED, GREEN, BLUE, YELLOW, BLACK, PINK, ORANGE, WHITE, GREY};
	
	//constructors
	public ShapeParent(){	
	}
	public ShapeParent(Colour colour) {
		this.colour = colour;
	}
	
	//methods, setters and getters
	public Colour getColour(){
		return colour;
	}
	
	public void setColour(Colour colour){
		this.colour = colour;
	}
	public void draw(){
		System.out.println("Drawing a Shape");
	}
	//toString

	@Override
	public String toString() {
		return "ShapeParent Colour : " + colour;
				
	}
	

}
