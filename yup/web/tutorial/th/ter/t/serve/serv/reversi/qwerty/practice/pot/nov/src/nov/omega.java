package nov;

import java.util.Scanner;

public class omega {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t,i,n,j;
		n=s.nextInt();
		int a[]=new int[n];
		int sum[]=new int[n];
		//String str[]=new String[n];
		String str;
		String r = s.nextLine();
		char c ;
		for(i=0;i<n;i++)
		{ //  System.out.println(n);
			str=s.nextLine();
			int l =str.length();
			j=0;
			
			c=str.charAt(0);
			if(c=='b')
				j=j+5;
			if(c=='o'||c=='t')
				j=j+6;
			sum[i]=0;
		    while(j<l)
		    {
		    	if(str.charAt(j)=='o')
		    	{
		    		if(c=='b')
		    		{
		    			sum[i]=sum[i]+6;
		    		
		    		}
		    		if(c=='t')
		    		{
		    			sum[i]=sum[i]+8;
		    			
		    		}
		    		j=j+6;
		    		c='o';
		    		continue;
		    	}
		    	if(str.charAt(j)=='b')
		    	{
		    		if(c=='t')
		    		{
		    			sum[i]=sum[i]+2;
		    		}
		    		if(c=='o')
		    		{
		    			sum[i]=sum[i]+6;
		    		}
		    		j=j+5;
		    		c='b';
		    		continue;
		    	}
		    	if(str.charAt(j)=='t')
		    	{
		    		if(c=='b')
		    		{
		    			sum[i]=sum[i]+2;
		    		}
		    		if(c=='o')
		    		{
		    			sum[i]=sum[i]+8;
		    		}
		    		j=j+6;
		    		c='t';
		    		continue;
		    	}
		    }
		    
		}
		
		for(i=0;i<n;i++)
		{
			System.out.println(sum[i]);
		}
		

	}

}
