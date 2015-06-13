package ani;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class proff extends JComponent implements KeyListener, ActionListener,MouseMotionListener{
	Image im,noim,im2,im3,imgun,ques1,ques2,ques3,ques4,ques5,victim,dead,dov,lockclosed,lockopen,lock,cover,cover2;
	
	
	int vx=0,vy=0,ax,ay=0,vicx=990,vicy=420,vh=64,vw=30,lockx=900,locky=200;
	 int x=100,y=400,count=1,fix=400,w=0,h=0,hx=0,hy=0,gunx=400,guny=400;
	public  proff() throws IOException
	{
		im=ImageIO.read(getClass().getResource("Cowboy_With_Guns_Standing_Wild_West_Vector_Pixel_Art.png"));
		im2=ImageIO.read(getClass().getResource("10000010PD_1200x900.jpg"));
		im3=ImageIO.read(getClass().getResource("Cowboy_Shooting_Gun_Wild_West_Vector_Pixel_Art.png"));
		imgun=ImageIO.read(getClass().getResource("zeimusu_AK-47.png"));
		noim=ImageIO.read(getClass().getResource(""));
		cover=ImageIO.read(getClass().getResource("Executiveroom.jpg"));
		cover2=ImageIO.read(getClass().getResource("Executiveroom.jpg"));
		data.bull=ImageIO.read(getClass().getResource("bullet.gif"));
		victim=ImageIO.read(getClass().getResource("addon_the_photographer.png"));
		dead=ImageIO.read(getClass().getResource("aurium_Pirate_Simple.png"));
		lockclosed=ImageIO.read(getClass().getResource("djmx1_cadenas_3.png"));
		lockopen=ImageIO.read(getClass().getResource("djmx1_cadenas_1.png"));
		data.imc=im;
		ques1=noim;
		ques2=noim;
				ques3=noim;
						ques4=noim;
								ques5=noim;
										data.ques6=noim;
										lock=lockclosed;
		dov=victim;
	}
	AudioClip song= JApplet.newAudioClip(getClass().getResource("235133__reitanna__pinkie-pie-excited-scream.wav"));
	AudioClip song1= JApplet.newAudioClip(getClass().getResource("240213__jack__metallic-hit.wav"));
	private int cont=0;


	 int xb1=x, xb2=x, xb3=x, xb4=x, xb5=x;


	int yb1=y, yb2=y, yb3=y, yb4=y, yb5=y;


	proffData data = new proffData(x, y, 0);


	private int dovconst;


	private int platx;


	private int plat2x=990;


	private int upplatx=850;


	private int holex=600,cox=0,co2x=1500;


	private int gamespeed=1;


	private int xspeed=6;
	public static void main(String[] args) throws IOException    {
		JFrame j = new JFrame("pic");
		proff pro = new proff();
		j.setLocation(0,0);
		j.setVisible(true);;
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(1400, 600);
		j.add(pro);
		Timer t = new Timer(20 , pro);
		t.start();
		j.addKeyListener(pro);
		j.addMouseMotionListener(pro);
      
	}
	public void paintComponent(Graphics g)
	{
		//g.drawImage(im,0, 0, this);
		//validate();
		//g.setColor(Color.white);
		
		g.drawImage(cover,cox,0, null);
		g.drawImage(cover2,co2x,0,null);
		
		//g.setColor(Color.green);
		g.drawImage(im2,platx,490, null);
		g.drawImage(im2,plat2x,490, null);
		g.setColor(Color.green);
		g.fillRect(upplatx,274, 200, 70);
		g.setColor(new Color(39, 91,87));
		g.fillRect(holex, 490,200, 70);
		//g.setColor(Color.blue);
		//g.fillRect(x,y, 100, 70);
		g.drawImage(data.imc,x,y,null);
		g.setColor(Color.black);
		g.fillRect(400, 300, w, h);
		g.drawImage(imgun,gunx, guny, null);
		g.drawImage(ques1, xb1, yb1, null);
		g.drawImage(ques2, xb2, yb2, null);
		g.drawImage(ques3, xb3, yb3, null);
		g.drawImage(ques4, xb4, yb4, null);
		g.drawImage(ques5, xb5, yb5, null);
		g.drawImage(data.ques6, data.xb6+67, data.yb6+20, null);
		g.drawImage(dov, vicx, vicy,null);
		g.drawImage(lock,lockx,locky,null);
		
	}
	public void actionPerformed(ActionEvent e) {
		//song.play();
		 if(x>holex-50&&x<holex+150&&y>400)
		 {
			//vx=0;
			y=y+3;
			cont=1;
			
			
		 }
		 else{
			 if(x>upplatx-50&&x<upplatx+200-50&&y<=250)
				 fix=170;
			 else
				 fix=400;
			 if(x>gunx&&x<gunx+100&&y>guny&&y<guny+70)
				 {data.imc=im3;
				  imgun=noim; 
				 }
			 
		y= y-vy;
		 vy=vy-1;
		 x=x+vx;
		 if(y>fix){
		 vy=0;
		 ay=0;
		 vx=0;}}
		 if(y>450)
		 {   cont=0;
			 h=50;
			 w=50;
			 if(hx>400&&hx<400+w&&hy>300&&hy<300+h)
			 {
				 x=100;
				 y=400;
				 h=0;y=0;
			 }
		 }
	 if(cont==1)
			 song1.play();
		 //song.play();	
	
	 if(data.bullconst==1)
	 {
		 data.ques6=data.bull;
		// for(int i=0;i<20;i++)
		 //{
		 data.bull.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		 repaint();
		 //}
  	     data.xb6=data.xb6+6;
  	 
	 }
	 else
	 {
	 data.xb6=x+67;data.yb6=y+20;
	 }
	 if(data.xb6>lockx&&data.xb6<lockx+100&&data.yb6<locky+100&&data.yb6>locky)
	 {
		 lock=lockopen;
		 data.ques6=noim;
	 }
	 if(data.xb6>vicx&&data.xb6<vicx+vw&&data.yb6>vicy-100)
	 {   song.play();
		 dov=dead;
		dovconst=1;
		
		data.ques6=noim;
		
	 }
		if(dovconst==1)
		{
			 vicy=vicy-10;
		}
	
		if(data.xb6>1300)
		{
			data.xb6=x;
			data.yb6=y;
			data.ques6=noim;
			data.bullconst=0;
		}
		{//x=x-gamespeed;
		platx=platx-gamespeed;
		plat2x=plat2x-gamespeed;
		upplatx=upplatx-gamespeed;
		holex=holex-gamespeed;
		gunx=gunx-gamespeed;
		vicx=vicx-10*gamespeed;
		cox=cox-gamespeed;
		co2x=co2x-gamespeed;
		}
		if(cox<-1500)
			cox=co2x+1500;
		if(co2x<-1500)
			co2x=cox+1500;
		if(platx<-790)
			platx=plat2x+990;
		if(plat2x<-790)
			plat2x=platx+990;
		if(upplatx<-200)
			upplatx=platx+850;
		if(holex<-200)
			holex=platx+600;
		if(vicx<-80)
		{
			vicy= 420 ;
			vicx=1390  ;
			dov=victim;
			dovconst=0;
		}
		
		
		 repaint();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
       int n= e.getKeyCode();
       if(n==KeyEvent.VK_UP)
       {
    	   vy=20;
    	   
    	   ay=4;
       }
       if(n==KeyEvent.VK_DOWN)
       {
    	   vy=20;
    	   vx=-xspeed;
    	   ay=4;
       }
       if(n==KeyEvent.VK_RIGHT)
       {
    	  
    	   vx=xspeed;
    	   
       }
       if(n==KeyEvent.VK_LEFT)
       {
    	   
    	   vx=-xspeed;
    	   
       }
       if(n==KeyEvent.VK_SPACE)
       {
    	  if(data.imc==im3)
    	   data.bullconst=1;
    	       	   
       }
       if(n==KeyEvent.VK_CONTROL)
       {
    	   vy=20;
    	   vx=xspeed;
    	   ay=4;
       }
           
           
          //  validate();
       
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
//	@Override
	@Override
	public void mouseDragged(MouseEvent e) {
		
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
		hx=e.getX();
		hy=e.getY();
	}
	
}
