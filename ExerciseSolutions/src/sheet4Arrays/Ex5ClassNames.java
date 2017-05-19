package sheet4Arrays;

public class Ex5ClassNames {

	public static void main(String[] args) {
		String [] firstNames = {"Emmmanuel", "Gabi", "Vitalie", "Kevin", "Ben", "Ewelina", "Asen", "Pat", "Stephen", "James", "James", "Agnes", "Shane", "Sean", "Jay", "Darius",
				"Damian", "Luca", "Janos"};	

		String [] secondNames = {"sEmmmanuel", "sGabi", "sVitalie", "sKevin", "sBen", "sEwelina", "sAsen", "sPat", "sStephen", "sJames", "sJames", "sAgnes", "sShane", "sSean", "sJay",
				"sDarius", "sDamian", "sLuca", "sJanos"};

		Ex5ClassNames ex5 = new Ex5ClassNames();
		ex5.firstNamePlusSecondName(firstNames, secondNames);
	}
	public void firstNamePlusSecondName(String [] firstNames, String [] secondNames){
		System.out.printf("%-14s%-14s%s\n", "First Name", "Second Name", "Full Name");
		for (int i = 0; i<firstNames.length;i++){
			System.out.printf("%-14s%-14s%s\n",firstNames[i] , secondNames[i], firstNames[i] + " " + secondNames[i]);
		}
	}

}
