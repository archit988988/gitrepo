package practice;
import javax.swing.JFrame;
import java.util.*;

import java.awt.Color;
import java.awt.Graphics;


public class file extends JFrame{
	static int x , y=100;
	public file()
	{
		setTitle("fvfb");
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
    public void paint(Graphics f)
    {  f.setColor(Color.BLUE);
    	f.fill3DRect(400, 400, y, 100, true);
    	f.drawString("hooll", 67, 90);
    	f.setColor(Color.BLUE);
    }
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		file f = new file();
		int ch = s.nextInt();
		while(ch==6){
			y=y+100;
		f.paint(null);
		;}
	}

}
