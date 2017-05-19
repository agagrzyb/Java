package sheet5PracticeCreatingClasses;

public class MainForEx3GymMembership {

	public static void main(String[] args) {
		//Ex3GymMembership class is a template for creating an object

		Ex3GymMembership member1 = new Ex3GymMembership();
		member1.setName("Mary Brown");
		member1.setPaymentFrequency(Ex3GymMembership.MONTHLY);
		member1.setMembershipCost();
		System.out.println(member1);
		System.out.println("--------------------------");

		Ex3GymMembership member2 = new Ex3GymMembership();
		member2.setName("Joe Brown");
		member2.setPaymentFrequency(Ex3GymMembership.ONCEOFF);
		member2.setMembershipCost();
		System.out.println(member2);
		System.out.println("--------------------------");

		Ex3GymMembership member3 =  new Ex3GymMembership();
		member3.setName("Jimmy Joe");
		member3.setPaymentFrequency(Ex3GymMembership.YEARLY);
		member3.setMembershipCost();
		System.out.println(member3);
		System.out.println("--------------------------");

	}
}

/**		
 * Using String asString and String toString can print all info (4syso)
 * by calling only : System.out.println(member1);
 * 
	System.out.println("Membership number : " + Ex3GymMembership.idCounter);
	System.out.println("Name : " + member1.getName());
	System.out.println("Payment frequency  : " + member1.getPaymentFrequencyAsString());
	System.out.println("Membership cost : $" + member1.getMembershipCost());
 * 
 */
