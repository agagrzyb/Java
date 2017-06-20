package sheet18_Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercise1 {

	public static void main(String[] args) {

		String filename = "src/sheet18_Files/ShoppingListFile.txt";

		try{
			PrintWriter pw = new PrintWriter(filename);
			Scanner scanner =  new Scanner(System.in);
			int orderCount = 1;
			for(int i=0; i<orderCount;i++){
				System.out.println("Order : " + orderCount);
				System.out.println("Enter product name and price, type 'stop' to exit ");
				String product = scanner.nextLine();

				System.out.println("Product name and price : " + product);
				pw.println("Product name and price : " + product);
				pw.flush();

				orderCount++;
			}
			pw.close();
			scanner.close();

		}catch(FileNotFoundException e){

			JOptionPane.showMessageDialog(null, "File not found");
			e.printStackTrace();
		}

		System.out.println("End of Shopping List");

		System.out.println("Reading the file : ");
		try{

			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr); // fr- file reader from previous line
			System.out.println(br.readLine());  // IOException
			String  line = "";
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			br.close();


		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "File not found");
			e.printStackTrace();

		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "Error reading from file");
			e.printStackTrace();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Something else happened");
			e.printStackTrace();
		}finally{
			System.out.println("in a finally block");
		}


	}
}

