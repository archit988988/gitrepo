package applet;
//import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class app extends JFrame 

{ JButton b ;
JButton b1 ;
JButton b2;
JButton b3 ;
JButton b4;

	JPanel j,j1,j2,j3,j4; 
	JLabel l;
	public app()
	{
		setTitle("app");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		l = new JLabel("helloooo");
		 b = new JButton("b");
		 b1 = new JButton("b1");
		 b2 = new JButton("b2");
		 b3 = new JButton("b3");
		 b4 = new JButton("b4");
        j = new JPanel();
		j1= new JPanel();
		j2= new JPanel();
		j3= new JPanel();
		j4= new JPanel();
		j.add(b);
		j1.add(b1);
		j2.add(b2);
		j3.add(b3);
		j4.add(b4);
		j.setBackground(Color.RED);
		j1.setBackground(Color.blue);
		j2.setBackground(Color.GREEN);
		j3.setBackground(Color.GRAY);
		j4.setBackground(Color.orange);
		
		j.add(l);
		add(j,BorderLayout.NORTH);
		add(j1,BorderLayout.CENTER);
		add(j2,BorderLayout.EAST);
		add(j3,BorderLayout.SOUTH);
		add(j4,BorderLayout.WEST);
		
	}
	public static void main(String[] args) {
		app a = new app();
		
		

	}

}
