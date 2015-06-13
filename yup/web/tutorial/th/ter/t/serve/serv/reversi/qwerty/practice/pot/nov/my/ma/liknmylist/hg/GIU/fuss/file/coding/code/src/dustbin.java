
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.Timer;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class dustbin extends JComponent implements ActionListener, MouseMotionListener, MouseListener{
	  BufferedImage im,hand1,hand2,hand,ball,mycar,car;
	   public  dustbin() throws IOException
	   {
	  	 im = ImageIO.read(getClass().getResource("reykjavic-panorama.jpg"));
	  	hand1 = ImageIO.read(getClass().getResource("hand_7.png"));
	  	hand2 = ImageIO.read(getClass().getResource("hand_2.png"));
		ball = ImageIO.read(getClass().getResource("tennis-ball.png"));
		mycar = ImageIO.read(getClass().getResource("car_topview.png"));
		car= ImageIO.read(getClass().getResource("0d93b48f2670512b50a98bbe609d014f.png"));
	  	hand=hand1;
	   }
	   int px=0,py=0,t1=5;
	int x=680,y=410,x1=100,y1=500,vx=1,vy=1,ax=1,hx=10,ay=1,bh=70,bw=70,count=0,count1=0,lx=0,ly=0,lv=2,plx=550,ply=60,six=100,siy=20;
	double co2x=1500;
	double cox=0;
	private String name="0";
	//int mycarx=500,mycary=,carx=0,cary=0;
	
   public void paintComponent(Graphics g){
	//  super.paintComponent(g);
	   //g.setColor(Color.black);
	   //g.fillRect(0, 0, 1200, 600);
	   g.drawImage(im, (int) cox,0, null);
	   g.drawImage(im, (int) co2x,0, null);
	   /*g.setColor(Color.RED);
	   g.fillRoundRect(x1, y1, six, siy, 10, 10);
	   g.setColor(Color.blue);
	   g.fillOval(x,y, 20, 20);
	  
	   g.fillOval(plx,ply, lx, ly);
	   g.setColor(Color.CYAN); 
	g.fillOval(500,10,bw,bh);
	*/
	   g.drawImage(hand, 600, 410, null);
	   g.drawImage(ball,x,y,bw,bh, null);
	   g.setColor(Color.red);
	   g.drawString(name, 600, 60);
	   g.setColor(Color.black);
	   g.drawRect(1000, 410, 20, 90);
	   g.setColor(Color.red);
	   g.fillRect(1000, 500-vy, 20, vy);
	   g.setColor(Color.black);
	   g.drawRect(1000, 520, 90, 20);
	   g.setColor(Color.red);
	   g.fillRect(1000, 520, vx, 20);
	  
	// validate();
	 
   }
  
     AudioClip song=JApplet.newAudioClip(getClass().getResource("240213__jack__metallic-hit.wav"));
     AudioClip song3=JApplet.newAudioClip(getClass().getResource("235133__reitanna__pinkie-pie-excited-scream.wav"));
     AudioClip song1=JApplet.newAudioClip(getClass().getResource("202163__luckylittleraven__gentleguitar.wav"));
     AudioClip song2=JApplet.newAudioClip(getClass().getResource("208431__vitawrap__pop.wav"));
	private int t=5;
	double gs;
	public static void main(String[] args) throws IOException {
	JFrame window = new JFrame("archit");
	dustbin game = new dustbin();
	window.add(game);
	
	window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	window.setAlwaysOnTop(true);
	window.setSize(800,600);
	window.setVisible(true);
	Timer t = new Timer(20 ,game);
	 t.start();
	window.addMouseMotionListener(game);
	window.addMouseListener(game);
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		hx=e.getX();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		gs=(700-hx)/100;
		
			cox=cox+gs;
			co2x=co2x+gs;
			
		
		
		
		if(cox<-1500)
			cox=co2x+1500;
		if(co2x<-1500)
			co2x=cox+1500;
		if(cox>0)
			co2x=cox-1500;
		if(co2x>0)
			cox=co2x-1500;
	if(t!=0&&count1==0)
		{
			vy=vy+t;
			count=vy;
			if(vy<0)
				t=-t;
			if(vy>90)
				t=-t;
			vx=vx+t1;
			
			if(vx<0)
				t1=-t1;
			if(vx>90)
				t1=-t1;
		}
	if(t1==0)
	{
		ax=vx-40;
		t=0;
		
	}
		if(t==0)
			
		{  name="count is "+Integer.toString(count);
		    py=1;
		    t1=5;
		    bw=bw-1;
		    bh=bh-1;
			y=y-vy;
			vy=vy-3;
			x=x+ax/5;
			
				
			if(y>420-count)
			{
				vy=0;
				t=5;
				count1=1;
				//y=410;
			}
		}
		 name="count is"+Integer.toString(count);
		repaint();
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(t==5){
			count1=0;
			x=680;
			y=410;
			bw=70;
			bh=70;
		}
			
		
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		if(t1!=0)
			t1=0;
		else
		t=0;
		hand=hand2;
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		hand=hand1;
	}
	}