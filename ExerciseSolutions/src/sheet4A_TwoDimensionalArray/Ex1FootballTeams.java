package sheet4A_TwoDimensionalArray;

public class Ex1FootballTeams {

	public static void main(String[] args) {
		// 2d array to store teams and names
		String [][] teams = {
				{"Man Utd", "Rooney"},   	//team1, player1, player2, player3...
				{"Man City", "Terry"}, 		//team2, player1, player2, player3...
				{"Liverpool","Torres"}, 	//team3, player1, player2, player3...
				{"Barcelona","Fabregas"}	//team4, player1, player2, player3...
		};
		//loop for printing an array
		for(int i=0;i<teams.length;i++){
			for(int j=0;j<teams[i].length;j++){
				System.out.print(teams[i][j] + " ");

			}
			System.out.println();
		}
	}
}
