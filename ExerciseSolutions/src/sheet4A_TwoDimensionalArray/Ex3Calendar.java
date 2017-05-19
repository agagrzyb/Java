package sheet4A_TwoDimensionalArray;

public class Ex3Calendar {

	public static void main(String[] args) {
		String [] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String [] dayHeadings = {"M", "T", "W", "T", "F", "S", "S"};
		//	int [] startingDayOfEachMonth = {6, 2, 2, 5, 0, 2, 5, 1, 4, 6, 2, 4};
		int [][] daysInEachMonth = {
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}
		};
		int startingDay=6; // starting weekday position for january 2017(sunday)
		int printCounter=startingDay; //assign startingDay do printCounter

		// loop for printing monthNames and ---
		for(int i = 0; i<monthNames.length;i++){
			System.out.println("---------------------------");
			System.out.println(monthNames[i] + " ");
			System.out.println();

			//loop for printing dayHeadings
			for(int j = 0; j<dayHeadings.length;j++){
				System.out.printf("%-4s", dayHeadings[j]);
			}
			System.out.println();

			// loop for dividing and printing spaces, when "a" is less than startingDay print spaces (only for january)
			for(int a=0;a<startingDay;a++){
				System.out.print(" -  ");
			}
			// loop to print a 2d array daysInEachMonth
			for(int k=0;k<daysInEachMonth[i].length;k++){
				System.out.printf("%-4d", daysInEachMonth[i][k]);
				// if statement for dividing month into weeks
				if(((printCounter+1) % 7) == 0){
					System.out.print("\n");
					printCounter=0; // reset printCounter so it will increment up to 7days only...
				}else{
					printCounter++;
				}
			}
			System.out.println();		

			startingDay=printCounter; // where the next month starts...assign printCounter (position from last calendar day every month) to startingDay
		}
	}	
}
