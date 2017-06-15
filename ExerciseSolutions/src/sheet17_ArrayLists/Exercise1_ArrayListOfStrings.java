package sheet17_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.w3c.dom.NameList;

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
		//store all names in an array of Strings
		String [] allNames = {name1 , name2 , name3, name4, name5 , name6 , name7, name8, name9 , name10 , name11, name12};
		ArrayList<String>  nameList = new ArrayList<>();
		//add array by calling the ArrayList's addAll() method
		//turn the array of strings into a list by calling the static method Arrays.asList()... Arrays.asList(allNames)
		nameList.addAll(Arrays.asList(allNames));
		System.out.println(nameList);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name : ");
		String input = scanner.nextLine();
		System.out.println("Name entered : " + input);

		//print name if true and position 
		boolean isFound = false;
		for(int i = 0; i < nameList.size(); i++){
			if(nameList.get(i).equals(input)){
				System.out.println(input + " was found at position : " + (i+1));
				isFound = true;
			}
		}
		if(!isFound){
			System.out.println(input + " was not found!");
			//System.exit(0);
		}
		//prompt the user for a name to remove from list
		System.out.println("Enter the name you want to be removed from list : ");
		String input2 = scanner.nextLine();
		System.out.println("Please remove : " + input2);
		nameList.remove(input2);
		System.out.println(input2 + " has been sucessuly removed from the list");
		System.out.println("Current Name List : " + nameList);
		//change somebody's name in the list
		System.out.println("Rename first name in the list : " );
		String input3 = scanner.nextLine();		
		nameList.set(0, input3);
		System.out.println("Current Name List : " + nameList);
		//print the number of names you have in the list
		System.out.println("Current number of names in the list : " + (nameList.size()+1));
		//sort the list in alphabetically order and print it
		Collections.sort(nameList);
		System.out.println("Alphabetically order " + nameList);
		//remove the name at position 7 in the list
		nameList.remove(7);
		System.out.println("Removing Name from position 7 ...");
		System.out.println("Current Name List : " + nameList);
		//insert "Santa" at the beginning
		System.out.println("Insertig Santa at the beginning of the list...");
		nameList.add(0, "Santa ");
		System.out.println("Current Name List : " + nameList);
		//check if the list is empty, now empty the list and check it again
		System.out.println(nameList.isEmpty() ?  "Name List is empty. ": "Name List is not empty.");
		System.out.println("Clearing in progress...");
		nameList.clear();
		System.out.println(nameList.size() == 0 ? "Name list has been cleared ": " Name list has not been cleared");
		scanner.close();
	}
}

