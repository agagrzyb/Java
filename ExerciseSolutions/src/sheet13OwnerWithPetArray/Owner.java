package sheet13OwnerWithPetArray;

import java.util.Arrays;

public class Owner {
	//member variables
	private String name;
	private String address;
	private String phoneNumber;
	private Pet [] pets;

	//constructors
	public Owner(){

	}
	public Owner(String name, String address, String phoneNumber, Pet[] pets) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.pets = pets;
	}
	//methods
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Pet[] getPets() {
		return pets;
	}
	public void setPets(Pet[] pets) {
		this.pets = pets;
	}
	//toString
	@Override
	public String toString() {
		return "Owner : name = " + name + ", "+
				"address = " + address + ", "+
				" phoneNumber = " + phoneNumber +
				", pets = "+ Arrays.toString(pets);
	}
}
