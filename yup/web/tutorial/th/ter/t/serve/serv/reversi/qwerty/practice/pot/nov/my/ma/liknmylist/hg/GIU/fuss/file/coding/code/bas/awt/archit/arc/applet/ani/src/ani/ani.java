package ani;
import java.util.*;
import java.io.*;


public class ani {

	public static void main(String[] args) {
		int i,p=0 ;
		long x , y,t,tp;
	    
		Scanner s = new Scanner(System.in);
	
		t = s.nextInt();
		tp=t;
		 String[] ans = new String[(int) t];
		 for(i=0;i<t;i++)
		 {
			 ans[i] = "NO";
		 }
		while(t>0)
		{x = s.nextInt();
		y = s.nextInt();
		if(x==0)
		{
			if(y%2==0)
			{
				ans[p]="YES";
				p++;
				t--;
				continue;
			}
				
		}
		if(x<0&&x%2==0)
		{
			if(y<=(-x)||y>=x)
			{
				ans[p]="YES";
				p++;
				t--;
				continue;
			}
		}
		if(x>0&&(x%2!=0))
		{
			if(y>=0&&y<=(x+1))
			{
				ans[p]="YES";
				p++;
				t--;
				continue;
			}
			
		}
		if(x>1&&(x%2!=0))
		{
			if(y<0&&y>=-(x-1))
			{
				ans[p]="YES";
				p++;
				t--;
				continue;
			}
		}
		
		
		if(y>0&&y%2==0)
		{
			if(x>=0&&x<=y-1)
			{
				ans[p]="YES";
				p++;
				t--;
				continue;
			}
			if(x<0&&x>=(-y))
			{
				ans[p]="YES";
				p++;
				t--;
				continue;
			}
		}
		if(y<0&&y%2==0)
		{
			if(x>=0&&x<=y-1)
			{
				ans[p]="YES";
				p++;
				t--;
				continue;
			}
			if(x<0&&x>=y)
			{
				ans[p]="YES";
				p++;
				t--;
				continue;
			}
		}
		if(x==0&&y==0)
		{
			ans[p]="YES";
			p++;
			t--;
			continue;
		}
		p++;
		t--;
		}
		 for(i=0;i<tp;i++)
		 {
			 System.out.println(ans[i]);
		 }
	}

}
