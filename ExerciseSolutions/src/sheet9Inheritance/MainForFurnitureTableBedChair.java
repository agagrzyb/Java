package sheet9Inheritance;

public class MainForFurnitureTableBedChair {

	public static void main(String[] args) {
		
		System.out.println("------------------FurnitureParent class--------------------");
		FurnitureParent p = new FurnitureParent("Brown","Wood");
		System.out.println(p);
		System.out.println("-----------------------");
		FurnitureParent p2 = new FurnitureParent("White", "Plastic");
		System.out.println(p2);

		System.out.println("---------------------Table child class-------------------");
		Table t1 = new Table("Blue", "Glass", "Square", Table.IS_NOT_EXPANDABLE);
		System.out.println(t1);
		
		System.out.println("---------------------Bed child class---------------------");
		Bed b1 = new Bed("Oak", "Wooden", "Double bed", Bed.Headbord.YES);
		System.out.println(b1);
		
		System.out.println("---------------------Chair child class-------------------");
		Chair c1 = new Chair("Black", "Leather", "Armchair", true);
		System.out.println(c1);

	}

}
