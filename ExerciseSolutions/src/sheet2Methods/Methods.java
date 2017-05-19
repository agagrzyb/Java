package sheet2Methods;

public class Methods{
	public static void main (String [] args){
		Methods m = new Methods();
		m.printHello();
		m.printMessage("Hi");
		m.printHello();
		
	} //end of main
	public void printHello(){
		System.out.println("Hello");
	}
	public void printMessage(String message){
		System.out.println("Your text " + message);
	}
} //end of class