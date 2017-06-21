package calculator;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class MyCalculator extends JFrame implements ActionListener {

	//constructor
	public MyCalculator() {
		super("My Calculator");
		setSize(350, 250); 								// callsetSize method from javax.swing.JFrame;
		setDefaultCloseOperation(EXIT_ON_CLOSE);	 	// make the 'x' button work
		setLocation(1200, 150);
		setLayout(null);								//setLayout(new FlowLayout());
		initComponents(); 								//call the method below
		setVisible(true);   							//its important to be last...
	}
	//creating components
	private void initComponents(){
		JLabel lblFirst = new JLabel("First");
		JLabel lblSecond = new JLabel("Second");
		JLabel lblResultHeading = new JLabel("Result");
		txtFirst = new JTextField();
		JLabel lblPlus = new JLabel("+");
		txtSecond = new JTextField();
		JLabel lblEquals = new JLabel("=");
		lblResult = new JLabel();
		JButton btnCalculate = new JButton("Calculate");

		lblFirst.setBounds(20, 10, 80, 40);
		lblSecond.setBounds(120, 10, 80, 40);
		lblResultHeading.setBounds(220, 10, 80, 40);
		txtFirst.setBounds(20, 45, 50, 40);	
		lblPlus.setBounds(90, 55, 20, 20);
		txtSecond.setBounds(120, 45, 50, 40);
		lblEquals.setBounds(190, 55, 20, 20);
		lblResult.setBounds(220, 45, 80, 40);
		lblResult.setBorder(new BevelBorder(BevelBorder.LOWERED));
		btnCalculate.setBounds(190, 130, 120, 30);

		// add each component onto this frame
		add(lblFirst);
		add(lblSecond);
		add(lblResultHeading);
		add(txtFirst);
		add(lblPlus);
		add(txtSecond);
		add(lblEquals);
		add(lblResult);
		add(btnCalculate);

		/*************************************************/
		btnCalculate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calculateButtonPressed();

			}
		});
	}
	private void calculateButtonPressed(){
		try{
			int num1 = Integer.parseInt(txtFirst.getText());
			try{
				int num2 = Integer.parseInt(txtSecond.getText());
				int result = num1 + num2;

				lblResult.setText(Integer.toString(result)); //lblResult.setText("" + result); // converting int to string
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(this, " 2nd number has to be an int!");
				txtSecond.requestFocus();
				txtSecond.selectAll();
			}
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this, "1st number has to be an int!");
			txtFirst.requestFocus();
			txtFirst.selectAll();
		}
	}

	/*************************************************/


	public static void main(String[] args) {
		// only one line of code...
		// frames are invisible by default
		//new MyCalculator();	// new MyCalculator().setVisible(true); 
		MyCalculator myCalc = new MyCalculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		JOptionPane.showMessageDialog(this, "Button was clicked");
	}
	//member variables/ global variables
	private JTextField txtFirst;
	private JTextField txtSecond;
	private JLabel lblResult;


}
