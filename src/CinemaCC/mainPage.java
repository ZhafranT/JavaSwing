package CinemaCC;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class mainPage {

	public mainPage() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JScrollPane ScrollPane = new JScrollPane();
		JMenuBar MenuBar = new JMenuBar();
		JMenuItem MenuItem = new JMenuItem();
		JLabel label = new JLabel();
		
		Image image;
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\logo.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\user.png").getImage();
		
		this.setPreferredSize(new Dimension(500,500));
		
		label.setIcon(new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\poster1.jpg"));
		label.setIcon(new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\poster2.jpg"));
		label.setIcon(new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\poster3.jpg"));
		label.setIcon(new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\poster4.jpg"));
		label.setIcon(new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\poster5.jpg"));
		label.setIcon(new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\poster6.jpg"));
	
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
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		Image image = null;
		g2D.drawImage(image, 100, 100, null);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mainPage();
	}

}
