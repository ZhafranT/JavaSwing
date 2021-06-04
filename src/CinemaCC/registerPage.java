package CinemaCC;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class registerPage {

	private static JLabel Logintittle;
	private static JTextField nameText;
	private static JLabel namelabel;
	private static JTextField emailText;
	private static JLabel emaillabel;
	private static JLabel passwordlabel;
	private static JPasswordField passwordText;
	private static JLabel phonenumberlabel;
	private static JTextField phonenumberText;
	private static JLabel DOBlabel;
	private static JTextField DOBText;
	private static JLabel genderlabel;
	private static JTextField genderText;
	private static JLabel citylabel;
	private static JTextField cityText;
	private static JButton button;
	private static JLabel success;
	
	
	public registerPage() {
		// TODO Auto-generated constructor stub
		JPanel panel = new JPanel();
		JFrame  frame = new JFrame();
		
		frame.setSize(450,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("CinemaCC");
		frame.add(panel);
		
		panel.setLayout(null);
		
		Logintittle = new JLabel("Register");
		Logintittle.setBounds(150, 10, 35, 25);
		panel.add(Logintittle);
		
		namelabel = new JLabel("Name");
		namelabel.setBounds(10, 20, 80, 25);
		panel.add(namelabel);
		
		nameText = new JTextField(20);
		nameText.setBounds(100, 20, 165, 25);
		panel.add(nameText);
		
		emaillabel = new JLabel("email");
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
		
		phonenumberlabel = new JLabel("Phone Number");
		phonenumberlabel.setBounds(10, 20, 80, 25);
		panel.add(phonenumberlabel);
		
		phonenumberText = new JTextField();
		phonenumberText.setBounds(100, 50, 165, 25);
		panel.add(phonenumberText);
		
		DOBlabel = new JLabel("DOB");
		DOBlabel.setBounds(10, 20, 80, 25);
		panel.add(DOBlabel);
		
		DOBText = new JTextField();
		DOBText.setBounds(100, 50, 165, 25);
		panel.add(DOBText);
		
		genderlabel = new JLabel("Gender");
		genderlabel.setBounds(10, 20, 80, 25);
		panel.add(genderlabel);
		
		genderText = new JTextField();
		genderText.setBounds(100, 50, 165, 25);
		panel.add(genderText);
		
		citylabel = new JLabel("City");
		citylabel.setBounds(10, 20, 80, 25);
		panel.add(citylabel);
		
		cityText = new JTextField();
		cityText.setBounds(100, 50, 165, 25);
		panel.add(cityText);
		
		button = new JButton("Submit");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new loginPage());
		panel.add(button);
		
		success = new JLabel ("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);

		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new registerPage();
	}

}
