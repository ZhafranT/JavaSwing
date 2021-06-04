package CinemaCC;

import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class userPage {

	private static JLabel Logintittle;
	private static JButton button;
	private static JLabel name;
	private static JLabel success;
	
	
	public userPage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame  frame = new JFrame();
		JMenuBar MenuBar = new JMenuBar();
		JMenuItem MenuItem = new JMenuItem();
		
		
		
		Image image;
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\logo.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\user.png").getImage();
		
		frame.setSize(350,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("CinemaCC");
		frame.add(panel);
		
		Logintittle = new JLabel("Clarissa");
		Logintittle.setBounds(150, 10, 35, 25);
		panel.add(Logintittle);
		
		button = new JButton("Transactions");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new loginPage());
		panel.add(button);
		
		button = new JButton("Update Account");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new loginPage());
		panel.add(button);
		
		button = new JButton("SIGN OUT");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new loginPage());
		panel.add(button);
		
		success = new JLabel ("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);


	}

}
