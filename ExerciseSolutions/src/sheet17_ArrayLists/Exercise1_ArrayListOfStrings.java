package sheet17_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Exercise1_ArrayListOfStrings {

	public static void main(String[] args) {
		String name1 = "name1";
		String name2 = "name2";
		String name3 = "name3";
		String name4 = "name4";
		String name5 = "name5";
		String name6 = "name6";
		String name7 = "name7";
		String name8 = "name8";
		String name9 = "name9";
		String name10 = "name10";
		String name11 = "name11";
		String name12 = "name12";

		String [] allNames = {name1 , name2 , name3, name4, name5 , name6 , name7, name8, name9 , name10 , name11, name12};
		ArrayList<String>  nameList = new ArrayList<>();
		nameList.addAll(Arrays.asList(allNames));
		System.out.println(nameList);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name : ");
		String input = scanner.nextLine();
		System.out.println("Name entered : " + input);
	}
}