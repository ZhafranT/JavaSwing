package CinemaCC;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class transactionPage {

	private static JLabel Logintittle;
	private static JLabel transactionlabel;
	private static JButton button;
	private static JLabel success;
	
	public transactionPage() {
		JPanel panel = new JPanel();
		JFrame  frame = new JFrame();
		
		frame.setSize(350,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("CinemaCC");
		frame.add(panel);
		
		panel.setLayout(null);
		
		Logintittle = new JLabel("Transaction History");
		Logintittle.setBounds(150, 10, 35, 25);
		panel.add(Logintittle);
		
		transactionlabel = new JLabel("There is no transactions");
		transactionlabel.setBounds(10, 20, 80, 25);
		panel.add(transactionlabel);
		
		button = new JButton("Back");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new loginPage());
		panel.add(button);
		
		success = new JLabel ("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);

		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new transactionPage();

	}

}
