package ani;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class tree extends JComponent implements ActionListener{
	
	int x3=50,y3=500,x2=100,y2=480,x1=150,y1=460,count=0,count1=0;
	
    public void paintComponent(Graphics g)
    {   g.setColor(Color.red);
    	g.fillRect(x3, y3, 300,20);
    	g.setColor(Color.blue);
    	g.fillRect(x2, y2, 200,20);
    	g.setColor(Color.CYAN);
    	g.fillRect(x1,y1, 100,20);
    	g.setColor(Color.GRAY);
    	g.fillRect(0, 520,400, 10);
    	g.fillRect(500, 520,400, 10);
    	g.fillRect(1000, 520,400, 10);
    }
	public static void main(String[] args) {
		tree tr = new tree();
		JFrame f =new JFrame("tree of hanoi");
		f.setLocation(0, 0);
		f.setVisible(true);
		f.setSize(1500,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(tr);
		 Timer t = new Timer(5, tr);
         t.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(count==0)
		y1=y1-2;
		if(y1<300)
		{   if(count1==0){
			x1=x1+2;
			count=1;
			if(x1>650)
				count1=1;}
		}
		if(count1==1)
		{    y1=y1+2;
			if(y1>500)
				count1=2;
		}		if(count1==2)
		{
			y2=y2-2;
			if(y2<300)
			{
				count1=3;
			}}
				if(count1==3){
//				x2=x2+2;
//				if(x2>1100)
//					count1=4;
//				}
//			
//			if(count1==4)
//			{
//				y2=y2+2;
//				if(y2>500)
//					count1=5;
//			}
//		    if(count1==5){
//		    	y1=y1-2;
//		    	if(y1<300)
//		    		count1=6;
//		    }
//			if(count1==6)
//			{
//				x1=x1+2;
//				if(x1>1150)
//					count1=7;
//			}
//			if(count1==7)
//			{
//				y1=y1+2;
//				if(y1>480)
//					count1=8;
//			}
//			if(count1==8)
//			{
//				y3=y3-2;
//				if(y3<300)
//					count1=9;
//			}
//			if(count1==9)
//			{
//				x3=x3+2;
//				if(x3>550)
//					count1=10;
//			}
//			if(count1==10){
//				y3=y3+2;
//			if(y3>500){
//				count1=11;}
//			}
//			if(count1==11)
//			{
//				y1=y1-2;
//				if(y1<300)
//					count1=12;
//			}
//			if(count1==12)
//			{
//				x1=x1-2;
//				if(x1<150)
//					count1=13;
//			}
//			if(count1==13)
//			{
//				y1=y1+2;
//				if(y1>500)
//				count1=14;
//				
//			}
//			if(count1==14)
//			{
//				y2=y2-2;
//				if(y2<300)
//					count1=15;
//			}
//			if(count1==15)
//			{
//				x2=x2-2;
//				if(x2<600)
//					count1=16;
//			}
//			if(count1==16)
//			{
//				y2=y2+2;
//				if(y2>480)
//					count1=17;
//			}
//			if(count1==17){
//				y1=y1-2;
//			if(y1<300)
//				count1=18;}
//			if(count1==18)
//			{
//				x1=x1+2;
//				if(x1>650)
//					count1=19;
//				
//			}
//			if(count1==19)
//			{
//				y1=y1+2;
//				if(y1>460)
//					count1=20;
//			}
		repaint();
	}

}
