import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
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

		public class check extends JComponent implements ActionListener, MouseMotionListener{
			 Image im;
			   public check() throws IOException
			   {
			  	 im = ImageIO.read(getClass().getResource("alice-goodwin-02.jpg"));
			   }
			int x,y,x1=100,y1=500,vx=1,vy=1,ax=1,ay=1,bh=100,bw=100,count=0,count1=0,lx=0,ly=0,lv=2,plx=550,ply=60,six=100,siy=20;
		   public void paintComponent(Graphics g){
			  
//			   g.setColor(Color.RED);
//			   g.fillRoundRect(x1, y1, six, siy, 10, 10);
//			   g.setColor(Color.blue);
//			   g.fillOval(x,y, 20, 20);
//			  
//			   g.fillOval(plx,ply, lx, ly);
//			   g.setColor(Color.CYAN); 
//			g.fillOval(500,10,bw,bh);
			 g.drawImage(im,30,20, null); 
			 
		   }
		  
		 
			public static void main(String[] args) throws IOException {
			JFrame window = new JFrame("archit");
			check game = new check();
			window.add(game);
			
			window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			window.setAlwaysOnTop(true);
			window.setSize(1200,600);
			window.setVisible(true);
			Timer t = new Timer(5 ,game);
			 t.start();
			window.addMouseMotionListener(game);
		

			}
			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			
		   
		}


	


