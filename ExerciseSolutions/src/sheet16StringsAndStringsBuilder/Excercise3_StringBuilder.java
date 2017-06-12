package sheet16StringsAndStringsBuilder;

public class Excercise3_StringBuilder {

	public static void main(String[] args) {

		String todayMenu = "Wednesday's Menu: Roast turkey with homemade turkey gravy, potatoes and veg of the day.";
		System.out.println(todayMenu);
		//using StringBuilder	
		//change "Wednesday" to "Thursday"	
		//change "turkey" to "beef"
		//add "Jelly and ice cream for dessert"
		//remove "and ice cream"
		
		StringBuilder sb = new StringBuilder();
		System.out.println("Using StringBuilder : " + sb);
		sb.append(todayMenu).replace(0, 9, "Thursday");
		System.out.println(sb);
		sb.replace(23, 29, "beef").replace(42, 48, "beef");
		System.out.println(sb);
		sb.append(" Jelly and ice cream for dessert.");
		System.out.println(sb);
		sb.replace(88,103, " ");
		System.out.println(sb);

	}
}
