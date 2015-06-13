import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;




public class cs extends JComponent implements ActionListener , MouseListener,MouseMotionListener,KeyListener{
    int x=0,y=0,backx=-200,backy=-100,fbackh,fbackw,reloadx=0,reloady=0,reloadcon=0,reloadh=0,reloadw=0,i=0;
	BufferedImage hand,spot,background,shot,whichhand,hand2,reload;
	private int keyspeed=6;
	int bullno=10;
	int bulletx[]=new int[bullno];
	int bullety[]=new int[bullno];
	
	int bulleth=20,hx=600,hy=500;;
	int bulletw=20;
	int bullcon=0;
	private int backh=1080;
	private int backw=1920;
	private int bullw=50;
	private int bullh=50;
	private int rec=4;
	public cs() throws IOException
	{   shot=ImageIO.read(getClass().getResource("show.png"));
		hand=ImageIO.read(getClass().getResource("B23R_BOII.png"));
		spot=ImageIO.read(getClass().getResource("circle-th.png"));
		background=ImageIO.read(getClass().getResource("ixGwY.jpg"));
		hand2=ImageIO.read(getClass().getResource("2.png"));
		reload=ImageIO.read(getClass().getResource("reload.png"));
		whichhand=hand;
	}
	AudioClip bull = JApplet.newAudioClip(getClass().getResource("205013__pepv__ak47-shot.wav"));
	
	public void paintComponent(Graphics g)
	{ 
		g.drawImage(background,backx,backy,backw,backh,null);
		g.drawImage(whichhand,hx,hy,300,300,null);
		g.drawImage(spot,x,y,bullh,bullw,null);
		for( i=0;i<bullno;i++)
		{
			g.drawImage(shot, bulletx[i], bullety[i], bulletw, bulleth, null);
		}
		g.setColor(Color.red);
		 Font font = new Font("areil", Font.PLAIN, 30);
		    
		    g.setFont(font);

		    g.drawString("bullets left= "+Integer.toString(bullno-bullcon), 40, 25); 
		    g.drawImage(reload, reloadx, reloady, reloadw, reloadh, null);
		
	}
	
	
	public static void main(String[] args) throws IOException {
		cs c = new cs();
		JFrame w= new JFrame("counter strike");
		w.setSize(1500,900);
		
		//w.setShape(new Ellipse2D.Double(0, 0,700, 700));
        w.setVisible(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.add(c);
        w.addMouseMotionListener(c);
        w.addMouseListener(c);
        w.addKeyListener(c);
        Timer t=new Timer(20,c);
        t.start();
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
		x=e.getX()-25;
		
		y=e.getY()-25;
		hx=600-(750-x)/2;
		
		//backx=x-950;
		//backy=y-500;
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stu
		 if(SwingUtilities.isLeftMouseButton(e)){
		if(bullcon<=bullno-1)
		{
		bull.play();	
		
		bulletx[bullcon]=e.getX()-10;
		bullety[bullcon]=e.getY()-10;
		bullcon++;
		}}
		repaint();
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
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		 if(SwingUtilities.isRightMouseButton(e)){
		        fbackh=backy;
		        fbackw=backx;
		        backx=-5*(x-backx)-(200);
		        backy=-5*(y-backy)-(200);
		        backh=5*backh;
		        backw=5*backw;
		        bullh=0;
		        bullw=0;
		        repaint();
		    }
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(SwingUtilities.isRightMouseButton(e)){
		backh=backh/5;
		backw=backw/5;
	    backx=fbackw;
	    backy=fbackh;
	    bullh=50;
	    bullw=50;
		repaint();
	}}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	//	if(backx>=-420&&backx<=0)
		{
		//	backx=backx+(750-x);
		}
		if(bullcon>bullno-1)
		{
			reloadcon=1;
		}
		if(reloadcon==1)
		{
			reloadx=400;
			reloady=300;
			//reloadh=200;
			//reloadw=200;
			if(reloadh>300){
				rec=-4;
			}
			if(reloadh<200)
			{
			   rec=4;
				
			}
			reloadh=reloadh+rec;
			reloadw=reloadw+rec;
		}
		
		{
			
		}
		if(hx>650)
			whichhand=hand2;
		else
			whichhand=hand;
		repaint();	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	  int n = e.getKeyCode();
	  if(n==KeyEvent.VK_LEFT)
	  {   if(backx<0){
		  backx=backx+keyspeed;
		  for(int i=0;i<bullno-1;i++)
		  {
			  bulletx[i]=bulletx[i]+keyspeed;
		  }
	  }
	  }
	  if(n==KeyEvent.VK_RIGHT)
	  {   if(backx>-420){
		  backx=backx-keyspeed;
		  for(int i=0;i<bullno-1;i++)
		  {
			  bulletx[i]=bulletx[i]-keyspeed;
		  }
	  }
	  }
	  if(n==KeyEvent.VK_UP)
	  {   if(backy<0){
		  backy=backy+keyspeed;
		  for(int i=0;i<bullno-1;i++)
		  {
			  bullety[i]=bullety[i]+keyspeed;
		  }
	  }}
	  if(n==KeyEvent.VK_DOWN)
	  {   if(backy>-400){
		  backy=backy-keyspeed;
		  for(int i=0;i<bullno-1;i++)
		  {
			  bullety[i]=bullety[i]-keyspeed;
		  }
	  }}
	  if(n==KeyEvent.VK_R)
	  {    bullcon=0;
		  reloadcon=0;
		  reloadx=0;
			reloady=0;
			reloadh=0;
			reloadw=0;
			
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
