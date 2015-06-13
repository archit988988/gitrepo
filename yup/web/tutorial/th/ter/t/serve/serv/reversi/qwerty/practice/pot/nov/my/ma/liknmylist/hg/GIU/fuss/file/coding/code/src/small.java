

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


public class small extends JComponent implements ActionListener, MouseMotionListener, MouseListener{
	  BufferedImage im,hand1,hand2,hand,ball,bat;
	   public  small() throws IOException
	   {
	  	 im = ImageIO.read(getClass().getResource("CF06-behind-stumps.jpg"));
	  	hand1 = ImageIO.read(getClass().getResource("hand_7.png"));
	  	hand2 = ImageIO.read(getClass().getResource("hand_2.png"));
		ball = ImageIO.read(getClass().getResource("tennis-ball.png"));
		bat= ImageIO.read(getClass().getResource(""));
	  	hand=hand1;
	   }
	   int px=0,py=0,t1=5;
	int x=680,y=0,x1=100,y1=500,vx=1,vy=1,ax=600;
	static int hx=10;
	int ay=400;
	int bh=70;
	int bw=70;
	int count=0;
	int count1=0;
	int lx=0;
	int ly=0;
	int lv=2;
	int plx=550;
	int ply=60;
	int six=100;
	int siy=20;
	double co2x=1500;
	double cox=0;
	private String name="0";
	
   public void paintComponent(Graphics g){
	   
	g.setColor(Color.black);
	g.fillRect(650, 580, 60, 100);
	g.drawImage(ball, x, y,40+y/10,40+y/10,null);
  //g.drawImage(bat,vx,vy,null);
	g.setColor(Color.red);
	g.fill3DRect(ax, ay, 30,70   , true);
   }
  
     AudioClip song=JApplet.newAudioClip(getClass().getResource("240213__jack__metallic-hit.wav"));
     AudioClip song3=JApplet.newAudioClip(getClass().getResource("235133__reitanna__pinkie-pie-excited-scream.wav"));
     AudioClip song1=JApplet.newAudioClip(getClass().getResource("202163__luckylittleraven__gentleguitar.wav"));
     AudioClip song2=JApplet.newAudioClip(getClass().getResource("208431__vitawrap__pop.wav"));
	private int t=5;
	double gs;
	public static void main(String[] args) throws IOException {
	JFrame window = new JFrame("archit");
	small game = new small ();
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
		ax=e.getX()-15;
		ay=e.getY()-35;
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		y=y+1;
		repaint();
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		
		
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
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	}
