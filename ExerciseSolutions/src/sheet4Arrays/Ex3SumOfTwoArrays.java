package sheet4Arrays;

public class Ex3SumOfTwoArrays{
	public static void main(String[]args){
		Ex3SumOfTwoArrays arrays = new Ex3SumOfTwoArrays();
		int [] firstArray = {2,4,6,8,10,12,14,16};
		int [] secondArray = {0,1,2,3,4,5,6,7};
		
		arrays.addTwoArrays(firstArray, secondArray);
	}	
	public void addTwoArrays(int [] firstArray, int [] secondArray){
	int[] sumArray= new int[firstArray.length];
		for(int i=0; i<firstArray.length;i++){
				sumArray[i] = firstArray[i] + secondArray[i];
		
		System.out.println("Sum of two arrays : " + sumArray[i]);
		}
	}	
}