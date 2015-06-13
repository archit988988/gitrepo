package applet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class move extends JPanel implements ActionListener {
	Timer t = new Timer(5,this);
	int x = 0,y=0,x1=400,y1=400;
	double vx=2,yx=2,vx1=3,yx1=3;
    public void paintComponent(Graphics g)
    {   super.paintComponent(g);
    	g.setColor(Color.blue);
    	g.fillOval(x,y, 20, 20);
    	g.drawLine(0, 620, 900,620);
    	g.setColor(Color.red);
    	g.fillOval(x1,y1, 20, 20);
    	g.fillRoundRect(300, 100, 20, 60, 2, 2);
    	
    	
    	t.start();
    }
    public void actionPerformed(ActionEvent e)
    {  if(x<0||x>880)
    {
    	vx=-vx;
    	
    }
    if(y<0||y>600)
    {
    	yx=-yx;
    }
      if(x1<0||x1>880)
    {
    	vx1=-vx1;
    	
    }
    if(y1<0||y1>600)
    {
    	yx1=-yx1;
    }
    	x = (int) (x+vx);
    	y=(int)(y+yx);
    	x1 = (int) (x1+vx1);
    	y1=(int)(y1+yx1);
    	vx=vx+0.02;
    	yx=yx+0.02;
    	/*if(x1-x<0.01&&y1-y<0.01)
    	{
    		vx=-vx;
    		vx1=-vx1;
    		yx=-yx;
    		yx1=-yx1;
    	}*/
    if(x>=300||x<=320&&y==100||y==160)
    {
    	vx=-vx;
    	yx=-yx;
    }

    	repaint();
    }
	public static void main(String[] args) {
	move m = new move();
	JFrame j = new JFrame();
	j.setTitle("gfgf");
	
	j.setSize(900,900);
	j.setVisible(true);
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	j.add(m);
	}

}
