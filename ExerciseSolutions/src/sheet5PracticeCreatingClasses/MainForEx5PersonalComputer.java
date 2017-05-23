package sheet5PracticeCreatingClasses;

public class MainForEx5PersonalComputer {

	public static void main(String[] args) {
		Ex5PersonalComputer user1 = new Ex5PersonalComputer(4, 500, "WINDOWS", 15);
		 System.out.println(user1);
		 System.out.println("------------------------------------");
		 
		 Ex5PersonalComputer user2 = new Ex5PersonalComputer(16, 1, "MAC", 17);
		 System.out.println(user2);
		 System.out.println("------------------------------------");
		 
		 Ex5PersonalComputer user3 = new Ex5PersonalComputer(4, 2, "LINUX", 22);
		 System.out.println(user3);
		 System.out.println("------------------------------------");
	
	}

}
