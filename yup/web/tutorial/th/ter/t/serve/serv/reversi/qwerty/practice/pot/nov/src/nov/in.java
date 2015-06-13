package nov;

import java.util.Scanner;

public class in {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t,n,m,count=0,r;
		t=s.nextInt();
		r=t;
		int b[]=new int[t];
		while(t>0)
		{   count=0;
			n=s.nextInt();
			m=s.nextInt();
			while(true)
			{
			if(m>n)
			{
				m=m-n;
				count++;
			}
			else if(m<n)
			{
				n=n-m;
				count++;
			}
			else if(n==m)
				{count++;
				 b[r-t]=count;
				  //System.out.println(count);
				  break;
				}
			}
			t--;
		}
		for(int i=0;i<r;i++)
		{
			System.out.println(b[i]);
		}

	}

}
