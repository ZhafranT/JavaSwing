package CinemaCC;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class movieDetailPage {

	private static JLabel Logintittle;
	private static JTextField TextAreaText;
	private static JButton button;
	
	public movieDetailPage() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JLabel label = new JLabel();
		JTextArea TextArea = new JTextArea();
		
		Image image;
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\poster1.png").getImage();
		this.setPreferredSize(new Dimension(500,500));
		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(label);
		add(panel);
		validate();
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("CinemaCC");
		frame.pack();
		frame.setVisible(true);
		
		Logintittle = new JLabel("Five Feet Apart");
		Logintittle.setBounds(150, 10, 35, 25);
		panel.add(Logintittle);
		
		button = new JButton("Back");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new loginPage());
		panel.add(button);
		
		button = new JButton("Watch Trailer");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new loginPage());
		panel.add(button);
		
		button = new JButton("Buy Tickets");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new loginPage());
		panel.add(button);
		
		TextAreaText = new JTextField("Author : Rachael Lippincott");
		TextAreaText.setBounds(150, 10, 35, 25);
		panel.add(TextAreaText);
		
		TextAreaText = new JTextField("Duration : 117 min");
		TextAreaText.setBounds(150, 10, 35, 25);
		panel.add(TextAreaText);
		
		TextAreaText = new JTextField("Sypnosis : A pair of teenagers with cystic fibrosis meet in "
				+ "a hospital and fall in love, though there disease means they must avoid "
				+ "close physical contact");
		
		TextAreaText.setBounds(150, 10, 35, 25);
		panel.add(TextAreaText);
	}

	private void validate() {
		// TODO Auto-generated method stub
		
	}

	private void add(JPanel panel) {
		// TODO Auto-generated method stub
		
	}

	private void setPreferredSize(Dimension dimension) {
		// TODO Auto-generated method stub
		
	}

}
