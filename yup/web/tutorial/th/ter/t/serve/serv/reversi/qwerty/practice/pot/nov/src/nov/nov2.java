package nov;

import java.util.Scanner;

public class nov2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t,n = 0,i;
		t=s.nextInt();
		long num,k,x;
		double ans,den;
		long h[]=new long[40];
		h[0]=1;
		for(i=1;i<=39;i++)
		{
			h[i]=h[i-1]+(long) Math.pow(2,i);
			
		}
		
		
		while(t>0)
		{   t--;
			x=s.nextLong();
			k=s.nextLong();
			for(i=0;i<39;i++)
			{
				if(k>=h[i]&&k<=h[i+1])
				{
					n=i+1;
					break;
				}
			}
	        if(k==1)
	        	{System.out.println(x/2);
	        	continue;
	        	}
			den=Math.pow(2, n+1);
			//System.out.println(den);
			
			k=k-h[n-1];
				
			
				num=1+2*(k-1);
			
			
			
	
			
			ans=num/den;
			
		
			System.out.println(ans*x);
			
		}

	}

}
