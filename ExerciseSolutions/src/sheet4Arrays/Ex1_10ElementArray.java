package sheet4Arrays;
public class Ex1_10ElementArray{
	public static void main(String[]args){
		int[]nums;
		nums = new int[10];
		for(int i = 0,value = 2; i < nums.length; i++,value+=2){
			nums[i] = value;
			System.out.print(nums[i] + " ,");
		}
		System.out.println("\n Second loop print out : ");
		for(int i = 0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
	} 
}