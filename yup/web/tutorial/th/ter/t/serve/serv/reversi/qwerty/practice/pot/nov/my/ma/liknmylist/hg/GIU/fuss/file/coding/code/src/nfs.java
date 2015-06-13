


import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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


public class nfs extends JComponent implements ActionListener, MouseMotionListener, MouseListener,KeyListener{
	  BufferedImage im,hand1,hand2,hand,ball,bat,divider,mycar,whichtree,car,playagain,tree2,car2,whichcar;
	   public  nfs() throws IOException
	   {mycar = ImageIO.read(getClass().getResource("car_topview.png"));
		car= ImageIO.read(getClass().getResource("0d93b48f2670512b50a98bbe609d014f.png"));
	  	 im = ImageIO.read(getClass().getResource("CF06-behind-stumps.jpg"));
	  	divider = ImageIO.read(getClass().getResource("R7FO9.png"));
	  	playagain = ImageIO.read(getClass().getResource("replay_button_by_ismolbil-d4332bk.png"));
	  	hand1 = ImageIO.read(getClass().getResource("hand_7.png"));
	  	hand2 = ImageIO.read(getClass().getResource("hand_2.png"));
		ball = ImageIO.read(getClass().getResource("tennis-ball.png"));
		bat= ImageIO.read(getClass().getResource("Cropped-Tree.png"));
		car2= ImageIO.read(getClass().getResource("large-car-front-0-9207.png"));
		tree2= ImageIO.read(getClass().getResource("bare_tree_png_by_doloresdevelde-d5f61yl.png"));
		whichcar=car;
		whichtree=bat;
	  	hand=hand1;
	   }
	   int px=0,py=0,t1=5,ax=700,ay=0;
	int x1=100,y1=500,vx=1,vy=1;
	static int hx=10;
	int gas=1;
	int count1=0;
	int lx=0;
	int ly=0;
	int lv=1;
	int plx=550;
	int ply=1;
	int six=100;
	int siy=20;
	double co2x=1500;
	double cox=0;
	private String name="0";
	int xpoly[]={500,700,1000,200};
	int ypoly[]={0,0,750,750};
	int mycarx=500,mycary=600,mycarspeed=20,carx=500,cary=-50,mycarh=200,mycarw=100,carcon=0;
	double carw=50;
	double carh=50;
	private int wi;
	private int hi;
	
	 static int ax1[]=new int[5];
	 static int ay1[]=new int[5];
	 static int bw1[]=new int[5];
	static int co[]=new int[5];
	 static int bh1[]=new int[5];
	 static int x[]=new int[5];
	 static int y[]=new int[5];
	 static int bw[]=new int[5];
	static int count[]=new int[5];
	 static int bh[]=new int[5];
	
   public void paintComponent(Graphics g){
	g.setColor(Color.green);
	g.fillRect(0, 0, 1500, 900);
	g.drawLine(500,0, 200, 750);
	g.drawLine(700,0, 1000, 750);
	g.setColor(Color.black);
	g.fillPolygon(xpoly, ypoly, xpoly.length);
//	g.drawImage(hand, x, y, 2*x, 2*y, 20, 20, 200, 300, null);
	//g.setColor(Color.red);
	//g.fillRect(ax, ay, bw,bh);
	//g.drawImage(bat,ax-90,ay ,bw, bh, null);
	//g.drawImage(bat, 400-(ax-700), ay, bw, bh, null);
	
	
	
	for(int i=0;i<4;i++)
	{
	g.drawImage(whichtree,ax1[i]-90,ay1[i] ,bw1[i], bh1[i], null);
	g.drawImage(whichtree, 500-(ax1[i]-700), ay1[i], bw1[i], bh1[i], null);
	
	}
	for(int i=0;i<2;i++)
	{
		g.drawImage(divider,x[i], y[i], bw[i], bh[i], null);
	}
	
	g.drawImage(mycar, mycarx, mycary, mycarw, mycarh, null);
	g.drawImage(whichcar, carx, cary, (int)carw, (int)carh, null);
//	g.setColor(Color.white);
//	g.fillRect(300, 200, wi, hi);
	g.drawImage(playagain, 300, 200, wi, hi, null);
   }
   
     AudioClip song=JApplet.newAudioClip(getClass().getResource("178126__zagi2__game-over.wav"));
    
     AudioClip song1=JApplet.newAudioClip(getClass().getResource("48544__flick3r__rezzo-4.wav"));
     
     AudioClip song2=JApplet.newAudioClip(getClass().getResource(""));
     AudioClip song3 = song1;
	private int t=5;
	double gs;
	public static void main(String[] args) throws IOException {
	JFrame window = new JFrame("archit");
	nfs game = new nfs ();
	window.add(game);
	
	window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	window.setAlwaysOnTop(true);
	window.setSize(1500,900);
	window.setVisible(true);
	Timer t = new Timer(20 ,game);
	 t.start();
	window.addMouseMotionListener(game);
	window.addMouseListener(game);
	window.addKeyListener(game);
	for(int i=0;i<5;i++)
	{
		ax1[i]=800+i*100;
		ay1[i]=-70+i*150-bh1[i];
		bw1[i]=70+i*50;
		bh1[i]=70+i*50;
		co[i]=i*50;
		x[i]=570;
		y[i]=-100+i*180+70-bh[i];
		bh[i]=100+i*140;
		bw[i]=20+i*70;
		count[i]=i*70;
		
	}
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		x1=e.getX();
		y1=e.getY();
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
	      ply++;
	   if(ply%100==0)
	   {
		   hx=-hx;
	   }
	   if(hx<0){
		   whichcar=car;
		   whichtree=bat;
	   }
	   else
	   { whichcar=car2;
	     whichtree=tree2;
	   }
	   
		if(px<=0)
	    {     
	    	song3.loop();
	    	px=1000;
	    }
	    else
	    	px--;
		
	    
	    
	    	
		for(int i=0;i<5;i++)
	{
		ax1[i]= (ax1[i]+gas+1+co[i]/15);
		ay1[i]= (ay1[i]+gas+2+co[i]/10);
		co[i]++;
		bh1[i]=bh1[i]+1;
		bw1[i]=bw1[i]+1;
		if(ay1[i]>600)
		{   co[i]=0;
			ax1[i]=800;
			ay1[i]=-70;
			bw1[i]=70;
			bh1[i]=70;
		}
	
	y[i]=y[i]+gas+1+count[i]/10;
	bw[i]=bw[i]+1;
	count[i]++;
	bh[i]=bh[i]+2;
	if(y[i]>700)
	{
		y[i]=-100;
		bw[i]=20;
		bh[i]=100;
		count[i]=0;
	}
	}
	cary=cary+4+carcon/10;
	carcon++;
	carx=carx-2*lv;
	carh=carh+1.5;
	carw=carw+1.5;
	if(cary>700)
	{    if(lv>0)
	{
		carx=600;
	}
	else
		carx=500;
		carcon=0;
		carh=50;
		carw=50;
		cary=-50;
		lv=-lv;
	}
	
	
	for(int i=0;i<4;i++)
	{
	  if(mycarx+mycarw>ax1[i]+40&&mycary<ay1[i]+bh[i]-40)
	  {  
		  //song3=song;
		 mycarw=0;
		 mycarh=0;
		 mycarspeed=0;
		 lx=1;
		 hi=300;
		 wi=500;
	  }}
	  if(mycarx+mycarw>carx&&mycarx<carx+carw&&mycary<cary+carh&&mycary+mycarh>cary)
	  {  //song3=song;
	     
		  mycarw=0;
			 mycarh=0;
			 mycarspeed=0;
			 lx=1;
			 hi=300;
			 wi=500;
	  }
		  
	
	
	
		repaint();
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		if(lx!=0)
		{
			
		if(x1>300&&x1<800&&y1<500&&y1>200)
		{//song3=song1;
			
			mycarx=500;
			mycary=600;
			mycarw=100;
			mycarh=200;
			lx=0;
			hi=0;
			wi=0;
			mycarspeed=20;
		}
		repaint();
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
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int n=e.getKeyCode();
		if(n==KeyEvent.VK_LEFT)
		{
			mycarx=mycarx-mycarspeed;
		}
		
		if(n==KeyEvent.VK_RIGHT)
		{
			mycarx=mycarx+mycarspeed;
		}
		if(n==KeyEvent.VK_DOWN)
		{
			mycary=mycary+mycarspeed;
			mycarw=mycarw+2;
			mycarh=mycarh+4;
		}
		if(n==KeyEvent.VK_UP)
		{
			mycary=mycary-mycarspeed;
			mycarw=mycarw-2;
			mycarh=mycarh-4;
		}
		repaint();
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	}

