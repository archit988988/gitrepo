package coding;

import java.util.Scanner;
import java.math.*;

public class v {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
         int t;
         t=s.nextInt();
         int i,j,n,f=0,max,maxind=0,minind=0,min,count=0,r;
         
         while(t>0)
         {n=s.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
        	{
        		a[i]=s.nextInt();
        	}
        	while(true)
        	{   max=a[0];
        	    min=a[0];
        	    maxind=0;
        	    minind=0;
        		for(i=1;i<n;i++)
        		{   if(a[0]!=a[i])
        			f=1;
        			if(a[i]>max)
        			{   max=a[i];
        				maxind=i;
        			}
        			if(a[i]<min)
        			{   min=a[i];
        				minind=i;
        			}
        			
        		}
        		if(f==0)
        			break;
        		else if((a[maxind]-a[minind])%2!=0)
    			{
    				count=-1;
    				break;
    			}
        		else
        		{   if((a[maxind]-a[minind])%2==0)
        			r=(a[maxind]-a[minind])/2;
        		   else
        		{
        			r=(a[maxind]-a[minind])/2+1;
        		}
        			a[maxind]=a[maxind]-r;
        			a[minind]=a[minind]+r;
        			count++;
        		}
        		
        		
        		
        		System.out.println(count);
        	}
        	f=0;
        	System.out.println(count);
        	count=0;
        	maxind=0;
        	minind=0;
        	 t--;
         }
	}

}
