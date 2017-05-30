package sheet10Inheritance;

//ABSTRACT Class
public abstract class Shape {
	//member variables
	private Colour colour;
	public enum Colour {RED, GREEN, BLUE, YELLOW, BLACK, PINK, ORANGE, WHITE, GREY};

	//constructors
	public Shape(){	
	}
	public Shape(Colour colour) {
		this.colour = colour;
		draw();
	}

	//methods, setters and getters
	public Colour getColour(){
		return colour;
	}

	public void setColour(Colour colour){
		this.colour = colour;
	}
	//abstract method : 
	//-cannot have a body, must be in an abstract class, must be overridden in all child classes.
	public abstract void draw(); //System.out.println("Drawing a Shape");

	//toString

	@Override
	public String toString() {
		return "Shape Colour : " + 
				colour.toString().toLowerCase();

	}
}
