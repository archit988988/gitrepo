package th;

public class thr extends Thread {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.print(" t"+i);
		}
	}

}
