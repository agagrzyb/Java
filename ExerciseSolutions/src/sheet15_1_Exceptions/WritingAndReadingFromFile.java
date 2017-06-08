package sheet15_1_Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.processing.Filer;
import javax.swing.JOptionPane;

public class WritingAndReadingFromFile {

	public static void main(String[] args) {
		
		String filename = "src/sheet15_1_Exceptions/Thursday.txt"; // filename

		try{

			PrintWriter pw = new PrintWriter(filename); // "src/sheet15_1_Exceptions/Thursday.txt"

			pw.println("Hello");
			pw.println("Hi there!");
			pw.println("Exceptions... exceptions everywhere...");
			pw.flush();
			pw.close();

		}catch(FileNotFoundException e){

			JOptionPane.showMessageDialog(null, "File could not be created");
			e.printStackTrace();
		}

		System.out.println("End of Main");


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
			System.out.println("A finally block will ALWAYS execute");
		}
	}
}
