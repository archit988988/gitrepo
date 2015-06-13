package applet;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class kbc extends JFrame{
	JPanel j = new JPanel();
	JLabel l1,l2;
	JButton b1,b2,b3,b4;
	public kbc()
	{
		setTitle("app");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		j.setLayout(new GridLayout(3,2));
		l1 = new JLabel("what is the CAPITAL of India?:P");
		
		l2 = new JLabel("ygiyg");
		l2.setIcon(new ImageIcon("c://Users//hp//Desktop//TV//A Beautiful Mind//ShrutiHassan10.md.jpg"));
		b1 = new JButton("delhi");
		b1.setIcon(new ImageIcon("c://Users//hp//Desktop//TV//A Beautiful Mind//ShrutiHassan10.md.jpg"));
		b2 = new JButton("I");
		b3 = new JButton("rupees");
		b4 = new JButton("none of these");
		
		b1.addActionListener(new ActionListener()
		{

			
			public void actionPerformed(ActionEvent e) {
				b2.setIcon(new ImageIcon("c://Users//hp//Desktop//TV//A Beautiful Mind//ShrutiHassan10.md.jpg"));
			j.setBackground(Color.CYAN);
			l2.setIcon(new ImageIcon("c://Users//hp//Desktop//TV//A Beautiful Mind//Shruti-Haasan-Hot-Photos-In-Yevadu-Movie-Hot Stills (3).jpg"));
			
			}
			
		});
		b2.addActionListener(new ActionListener()
		{

			
			public void actionPerformed(ActionEvent g) {
				b2.setIcon(new ImageIcon("c://Users//hp//Desktop//TV//A Beautiful Mind//Shruti-Haasan-Hot-Photos-In-Yevadu-Movie-Hot Stills (3).jpg"));
				l1.setText("bfgtbgfbg");
			}});
		
		
		j.add(l1);
		j.add(l2);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		add(j);
		validate();
	}

	public static void main(String[] args) {
		kbc k = new kbc();
	

	}

}
