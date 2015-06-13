import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.Timer;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class animation extends JComponent implements ActionListener, MouseMotionListener{
	  BufferedImage im;
	   public  animation() throws IOException
	   {
	  	 im = ImageIO.read(getClass().getResource("alice-goodwin-02.jpg"));
	   }
	int x,y,x1=100,y1=500,vx=1,vy=1,ax=1,ay=1,bh=100,bw=100,count=0,count1=0,lx=0,ly=0,lv=2,plx=550,ply=60,six=100,siy=20;
   public void paintComponent(Graphics g){
	//  super.paintComponent(g);
	   g.setColor(Color.black);
	   g.fillRect(0, 0, 1200, 600);
	   g.drawImage(im, 0,0, this); 
	   g.setColor(Color.RED);
	   g.fillRoundRect(x1, y1, six, siy, 10, 10);
	   g.setColor(Color.blue);
	   g.fillOval(x,y, 20, 20);
	  
	   g.fillOval(plx,ply, lx, ly);
	   g.setColor(Color.CYAN); 
	g.fillOval(500,10,bw,bh);
	
	// validate();
	 
   }
  
     AudioClip song=JApplet.newAudioClip(getClass().getResource("240213__jack__metallic-hit.wav"));
     AudioClip song3=JApplet.newAudioClip(getClass().getResource("235133__reitanna__pinkie-pie-excited-scream.wav"));
     AudioClip song1=JApplet.newAudioClip(getClass().getResource("202163__luckylittleraven__gentleguitar.wav"));
     AudioClip song2=JApplet.newAudioClip(getClass().getResource("208431__vitawrap__pop.wav"));
	public static void main(String[] args) throws IOException {
	JFrame window = new JFrame("archit");
	animation game = new animation();
	window.add(game);
	
	window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	window.setAlwaysOnTop(true);
	window.setSize(800,600);
	window.setVisible(true);
	Timer t = new Timer(5 ,game);
	 t.start();
	window.addMouseMotionListener(game);
	

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
	//song1.loop();
			   x=x+vx;   
			   y=y+vy;
		 if(x>x1&&x<x1+six&&y>=y1-20)
		 { song3.play();
			 vy=-(vy);
			 vx=vx;
		 }
		 if(y>600)
			 System.exit(0);
		 if(x>800||x<0)
			 vx=-vx;
		 if(y<0)
			 vy=-vy;
		 if(count==0){
		 if(x>500&&x<600&&y>10&&y<110)
		 {
			count++;
			bh=0;
			bw=0;
			lx=20;
			ly=20;
			song2.play();
		 }
					
			
		 }
		 if(count>0)
			 ply=ply+lv;
		 if(ply>600)
			 count1=1;
		 if(count1==0){
		 if(plx>x1&&plx<x1+six&&ply>500)
		 {
			 lx=0;
			 ly=0;
			 six=2*six;
			 count1=1;
			 song.play();
		 }}
		   repaint();
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x1=e.getX()-50;
	    // y1=e.getY();
		repaint();
		
	}
	
   
}
