import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
public class gui extends JFrame {
	
	public gui()
	{
		setTitle("tut");
		setSize(1380,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public void paint(Graphics g)
	{   g.setColor(Color.red);
		g.fill3DRect(480,240,200,100,true);
	}

	public static void main(String[] args) {
	
		gui t = new gui();
		
		
		t.paint(null);
		Color mine = new Color(12,56,98);
		

	}

}
