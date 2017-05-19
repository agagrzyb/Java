package sheet5PracticeCreatingClasses;

public class MainForEx4EmailAccount {

	public static void main(String[] args) {
		Ex4EmailAccount user1 = new Ex4EmailAccount("user1@gmail.com",
				"*****************************************", Ex4EmailAccount.FREE);
		System.out.println(user1);
		System.out.println("------------------------------------");
		
		Ex4EmailAccount user2 = new Ex4EmailAccount("user2@gmail.com",
				"***************", Ex4EmailAccount.BASIC);
		System.out.println(user2);
		
		System.out.println("------------------------------------");
		Ex4EmailAccount user3 = new Ex4EmailAccount("user3gmail.com", 
				"********", Ex4EmailAccount.PREMIUM);
		System.out.println(user3);

	}
}
/* LONG WAY-----------------------------------------------------------------------------
 * 	Ex4EmailAccount email1 = new Ex4EmailAccount();
		email1.setEmailAddress("emailaddress1@gmail.com");
		email1.setPassword("*********");
		email1.setLimit(1);
		System.out.println("User number : " + Ex4EmailAccount.idCounter);
		System.out.println("Email address: " + email1.getEmailAddress());
		System.out.println("Password: " + email1.getPassword());
		System.out.println("Maximum storage limit : " + email1.getLimit());
		System.out.println("---------------------------------------");
		Ex4EmailAccount email2 = new Ex4EmailAccount();
		email2.setEmailAddress("emailaddress2@gmail.com");
		email2.setPassword("***********");
		System.out.println("User number : " + Ex4EmailAccount.idCounter);
		System.out.println("Email address: " + email2.getEmailAddress());
		System.out.println("Password: " + email2.getPassword());
		System.out.println("Maximum storage limit : " + email2.getLimit());
 */