package sheet16StringsAndStringsBuilder;

public class Exercise1_ComparingStrings {
	public static void main (String [] args){

		String strA = new String ("Monday");
		String strB = new String ("Monday");
		String strC = "Tuesday";  //SCP
		String strD = "Tuesday";  //SCP
		String strE = new String ("Tuesday");


		//strA and strB do not refer to the same object
		System.out.println("Monday and Monday do not refer to the same object: strA == strB : " + (strA == strB));
		//strC and strD do refer to the same object 
		System.out.println("Tuesday and Tuesday do refer to the same object : strC == strD : " + (strC == strD));
		// using .equals() show that strA and strB contain the same letters AND strC and strD contain the same letters
		System.out.println();
		//strD and strE do not refer to the same object
		System.out.println("Tuesday and Tuesday do not refer to the same object : strE == strD : " + (strE == strD));
		// using toUpperCase() make strC refer to "Tuesday", now check if strC and strD still refer to the same object
		System.out.println();
		// using .equals() test if strC and strD contain the same letters
		System.out.println();

	}

}