package sheet4A_TwoDimensionalArray;

import java.util.Random;
public class Ex4B_ArraysLargestSmallestSearchingSorting {

	public static void main(String[] args) {
		int [] myElementsArray = new int [50];

		//printing a 50elements array.
		for(int i =0; i<myElementsArray.length; i++){
			System.out.print(myElementsArray[i] + " ");
		}
		System.out.println("\nNew Array populated with random numbers : ");

		for(int i=0; i<myElementsArray.length;i++){
			myElementsArray[i] = (int)(Math.random() * 100);
			System.out.print((myElementsArray[i] + 1) + " ");
		}

		Ex4B_ArraysLargestSmallestSearchingSorting ex4B = new Ex4B_ArraysLargestSmallestSearchingSorting();
		//	ex4B.findSmallestElement(myElementsArray);

		//	public void findSmallestElement(int [] myElementsArray){
		int smallest = myElementsArray[0];
		int largest = myElementsArray[0];

		for(int n : myElementsArray)
			if(n < smallest){
				smallest = n;
			}
		System.out.printf("\nThe smallest number in this array is %d", smallest);
		//}


	}
}

/*
Random random = new Random();		//creates an instance of the Random class
int num = random.nextInt(100) + 1; 	//random.nextInt(100)+1 will return a random number between 0 and 99,  +1 displays number between 1 and 100
 */
