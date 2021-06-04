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
import javax.swing.JPanel;

public class welcomePage {

	public welcomePage() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		
		Image image;
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\logo.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\next.png").getImage();
		
		this.setPreferredSize(new Dimension(500,500));
		
		label.setIcon(new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\wp3.png"));
		label.setIcon(new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\wp1.png"));
		label.setIcon(new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\wp2.png"));
		
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
		g2D.drawImage(image, 0, 0, null);
	} 

	public static void main(String[] args) {
		new welcomePage();

	}

}
