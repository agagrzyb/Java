package sheet16StringsAndStringsBuilder;

public class Exercise2_UpdateTheMenu {
	public static void main (String [] args){

		String todayMenu = "Wednesday's Menu: Roast turkey with homemade turkey gravy, potatoes and veg of the day.";
		System.out.println(todayMenu);
		//change "Wednesday" to "Thursday"
		todayMenu = todayMenu.replace("Wednesday", "Thursday");
		System.out.println(todayMenu);
		//change "turkey" to "beef"
		todayMenu = todayMenu.replace("turkey", "beef");
		System.out.println(todayMenu);
		//add "Jelly and ice cream for dessert"
		todayMenu = todayMenu.concat(" Jelly and ice cream for dessert.");
		System.out.println(todayMenu);
		//remove "and ice cream"
		todayMenu = todayMenu.replaceAll(" and ice cream ", " ");
		System.out.println(todayMenu);

	}
}
