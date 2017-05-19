package sheet4Arrays;

import javax.swing.JOptionPane;
public class ExJOptionPane {

	public static void main(String[] args) {
		for(int i = 0; i<3; i++){
			String input = JOptionPane.showInputDialog("Enter number" + (i+1));
		}

	}

}
