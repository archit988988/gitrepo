package applet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class H extends JPanel implements ActionListener,KeyListener {
	Timer t = new Timer(19,this);
	int x = 0,y=0,x1=0,y1=0,i=9,p=20,o=20;
	double vx=0,yx=0,vx1=1,yx1=0;
	public H()
	{
		t.start();
    	addKeyListener(this);
    	setFocusable(true);
    	setFocusTraversalKeysEnabled(false);
	}
    public void paintComponent(Graphics g)
    {   super.paintComponent(g);
    	g.setColor(Color.blue);
    	g.fillOval(x,y, p, o);
    	g.drawLine(0, 620, 900,620);
    	g.setColor(Color.red);
    	g.fillOval(x1,y1, 20, 20);
    	g.fillRoundRect(300, 100, 20, 60, 20, 20);
    	
    	
    	
    }
    public void actionPerformed(ActionEvent e)
    { 
    	/*y1=(int)(y1+yx1);
     
       if(y1>=600)
       {
    	   yx1=-yx1;
       }
       yx1=yx1+1;
       x1=(int)(x1+vx1);
       */
    
      x=(int)(x+vx);
      y=(int)(y+yx);
      //p=(int) (p+vx);
      //o=(int) (o+yx);
    if(x>=600||x<=0)
    
     {
    	
    	 vx=-vx;
     }
    if(y>=600||y<=0)
    {
    	 yx=-yx;
    }
      
      repaint();
    	}
    public void keyPressed(KeyEvent e)
    {
       int c = e.getKeyCode();
       if(c == KeyEvent.VK_LEFT)
       {
    	   vx=-i;
    	   //yx=0;
       }
       
       if(c == KeyEvent.VK_UP)
       {
    	   yx=-i;
    	   //vx=0;
       }
       
       if(c == KeyEvent.VK_RIGHT)
       {
    	   vx=i;
    	   //yx=0;
       }
       
       if(c == KeyEvent.VK_DOWN)
       {
    	   yx=i;
    	   //vx=0;
       }
    }
    public void keyTyped(KeyEvent e){} 
    public void keyReleased(KeyEvent e){} 
	public static void main(String[] args) {
	H m = new H();
	JFrame j = new JFrame();
	j.setTitle("gfgf");
	
	j.setSize(900,900);
	j.setVisible(true);
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	j.add(m);
	}

}

	

	
