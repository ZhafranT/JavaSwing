package CinemaCC;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class buyTiketPopUp {
	
	private static JLabel Logintittle;
	private static JButton button;
	
	public buyTiketPopUp() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		
		
		Image image;
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		image = new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\chair.png").getImage();
		
		this.setPreferredSize(new Dimension(500,500));
		
		label.setIcon(new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\user2.png"));
		label.setIcon(new ImageIcon("E:\\Eclipse File\\LabPro\\Assets\\user2.png"));

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
		
		Logintittle = new JLabel("Drag to Buy Ticket");
		Logintittle.setBounds(150, 10, 35, 25);
		panel.add(Logintittle);
		
		button = new JButton("Cancel");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new loginPage());
		panel.add(button);
	}

	private void add(JPanel panel) {
		// TODO Auto-generated method stub
		
	}

	private void validate() {
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

}
