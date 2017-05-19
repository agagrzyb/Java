package sheet4A_TwoDimensionalArray;

public class Ex4TotalSales {

	public static void main(String[] args) {
		System.out.println("The sales slips : ");
		System.out.println("Salesperson \t Product \t Total");
		int [][] company ={ 
				{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4},
				{1, 2, 3, 1, 4, 5, 3, 3, 2, 3, 4, 4, 1, 3, 5}
		};

		for(int i = 0; i<company.length; i++){
			for(int j = 0; j<company[i].length;j++){
				System.out.println(company[i][j]);
			}
		}
	}

}
