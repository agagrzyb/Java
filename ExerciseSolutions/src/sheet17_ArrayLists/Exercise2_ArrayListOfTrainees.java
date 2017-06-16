package sheet17_ArrayLists;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Exercise2_ArrayListOfTrainees {

	//member variables
	private String name;
	private String address;
	private LocalDate birthday;

	//constructors
	public Exercise2_ArrayListOfTrainees() {

	}
	public Exercise2_ArrayListOfTrainees(String name, String address, LocalDate birthday) {
		super();
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	}

	//methods, setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	//the equals() method that will be called by the ArrayList's contains()
	public boolean equals(Object obj){
		Exercise2_ArrayListOfTrainees other = (Exercise2_ArrayListOfTrainees)obj;

		if (this.name.equals(other.name) && this.address.equals(other.address)
				&& this.birthday.equals(other.birthday)){
			return true;
		}else{
			return false;
		}
	}
	//

	//toString
	@Override
	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "\nTrainee:"+ 
		"\nName = " + name + 
		"\nAddress = " + address + 
		"\nBirthday = " + birthday.format(format);
	}

	public static void main(String[] args) {
		Exercise2_ArrayListOfTrainees trainee1 = new Exercise2_ArrayListOfTrainees("Mary", "Finglas Training Centre",
				LocalDate.of(1984, Month.APRIL, 01));
		Exercise2_ArrayListOfTrainees trainee2 = new Exercise2_ArrayListOfTrainees("John", "1 Grafton street",
				LocalDate.of(1977, Month.DECEMBER, 24));
		Exercise2_ArrayListOfTrainees trainee3 = new Exercise2_ArrayListOfTrainees("Agnes", "Finglas, Main Street",
				LocalDate.of(1957, Month.MAY, 17));

		ArrayList<Exercise2_ArrayListOfTrainees> trList = new ArrayList<>();
		trList.add(trainee1);
		trList.add(trainee2);
		trList.add(trainee3);
		System.out.println(trList);
		// equals(Object obj) method
		Exercise2_ArrayListOfTrainees trainee3Copy = new Exercise2_ArrayListOfTrainees("Agnes", "Finglas, Main Street",
				LocalDate.of(1957, Month.MAY, 17));
		System.out.println("trList contains trainee3Copy ? : " + trList.contains(trainee3Copy));
		//change somebody's address...
		trList.get(1).setAddress("Cliffs of Moher, Galway");
		System.out.println("\nCurrent list with changed address : " + trList);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the name : ");		
		String input = scanner.nextLine();
		System.out.println("Name entered : " + input);
		//loop through the Trainees in the array list
		//if the name is found, print that person's birthday
		scanner.close();

		boolean isFound = false;
		for(int i=0; i< trList.size(); i++){
			if(trList.get(i).getName().equals(input)){
				DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				System.out.println("Match found, DOB : " + trList.get(i).birthday.format(format));
				isFound=true;
				//remove that trainee from the previous step
				//System.out.println("Removing selected Trainee from the list : " + trList.get(i));
				trList.remove( trList.get(i));
				System.out.println("------Current Trainee List : ------------" + trList);
			}	
		}
		if(!isFound){
			System.out.println(input + " not found.");
		}
		System.out.println();
		
	}
}