package sheet10Inheritance;

public class MainForShape {

	public static void main(String[] args) {
		System.out.println("-----Shape class-----\nABSTRACT class - nothing to display");
		//Shape p = new Shape(Colour.GREEN);
		//System.out.println(p);
		Rectangle r = new Rectangle(Shape.Colour.BLUE, 2.4, 2.5);
		System.out.println(r.getArea());
		System.out.println(r);
		Triangle t = new Triangle(Shape.Colour.PINK);
		System.out.println(t);
		Circle c = new Circle(Shape.Colour.GREY, 12);
		System.out.println(c);
		Rectangle r2 = new Rectangle(Shape.Colour.ORANGE, 3, 4);
		System.out.println(r2.getArea());
		System.out.println(r2);
		Triangle t2 = new Triangle(Shape.Colour.WHITE);
		System.out.println(t2);
		Circle c2 = new Circle(Shape.Colour.YELLOW, 9);
		System.out.println(c2);
		System.out.println("\nArray print out : ");

		//create a Shape array
		Shape [] allShapes = {r,t,c,r2,t2,c2};
		//print out its colours
		for(Shape one: allShapes){
			System.out.println("Colour : " + one.getColour());
		}
		// if the shape is a Circle, syso shape and radius
		for(Shape one: allShapes){
			if(one instanceof Circle){
				System.out.println("Circle : "+ ((Circle)one).getRadius());
			}
		}
		//if the shape is Rectangle syso shape and area
		for(Shape one: allShapes){
			if(one instanceof Rectangle){
				System.out.println("Rectangle : "+ ((Rectangle)one).getArea());
			}
		}
		//draw each shape
		//can't use syso  as draw() is void.
		for(Shape one : allShapes){
			one.draw();
		}
	}

}