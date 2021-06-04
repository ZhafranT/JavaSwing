package CinemaCC;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginPage implements ActionListener {

	private static JLabel Logintittle;
	private static JTextField emailText;
	private static JLabel emaillabel;
	private static JLabel passwordlabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;

	public loginPage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		JFrame  frame = new JFrame();
		
		frame.setSize(350,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("CinemaCC");
		frame.add(panel);
		
		panel.setLayout(null);
		
		Logintittle = new JLabel("Login");
		Logintittle.setBounds(150, 10, 35, 25);
		panel.add(Logintittle);
		
		emaillabel = new JLabel("Email");
		emaillabel.setBounds(10, 20, 80, 25);
		panel.add(emaillabel);
		
		emailText = new JTextField(20);
		emailText.setBounds(100, 20, 165, 25);
		panel.add(emailText);
		
		passwordlabel = new JLabel("Password");
		passwordlabel.setBounds(10, 50, 80, 25);
		panel.add(passwordlabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Submit");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new loginPage());
		panel.add(button);
		
		success = new JLabel ("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		String email = emailText.getText();
		String password = passwordText.getText();
		System.out.println(email + "," + password);
		
		if(email.equals("email registered") && password.equals("qwertyuiop")) {
			success.setText("Login Success");
			
		}else {
			if(email.equals("email not registered") && password.equals("qwertyuiop"));
				success.setText("Invalid input");
		}
	} 
	
	
	
	

}
