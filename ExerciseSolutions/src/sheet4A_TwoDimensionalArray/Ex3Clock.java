package sheet4A_TwoDimensionalArray;

public class Ex3Clock {

	public static void main(String[] args) {

		System.out.println("24 hours Clock : ");
		/*for(int i = 0; i<24;i++){
			for(int j = 0; j<60;j++){
				System.out.printf("\n%02d : %02d ", i, j);
			}
			System.out.println();
		}*/
		
		//loop hrs : mins : secs
		for(int i = 0; i<24;i++){
			for(int j = 0; j<60;j++){
				for(int k = 0;k<60;k++){
					System.out.printf("\n%02d : %02d : %02d ", i, j, k);
				}
			}
			System.out.println();
		}
	}

}