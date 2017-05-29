package sheet10Inheritance;

import sheet10Inheritance.ShapeParent.Colour;

public class MainForShapeParent {
	public static void main(String[] args) {
		System.out.println("------------------FurnitureParent class--------------------");
		ShapeParent p = new ShapeParent(Colour.GREEN);
		System.out.println(p);
	}
}
