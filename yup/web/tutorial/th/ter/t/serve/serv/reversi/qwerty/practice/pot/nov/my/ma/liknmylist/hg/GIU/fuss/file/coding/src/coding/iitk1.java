package coding;

import java.util.Scanner;

public class iitk1 {
 static int count=0,n;
 static int c[];
static int b[];
static int a[][];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int q;
		n=s.nextInt();
		q=s.nextInt();
		 c=new int[n];
		  b=new int[n];
		  a=new int[n-1][2];
		
	
	
		char qu[]=new char[q];
		int qui[][]=new int[q][2];
		for(int i=0;i<n-1;i++)
		{
			a[i][0]=s.nextInt();
			a[i][1]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=s.nextInt();
			c[i]=0;
			
		}
        for(int i=0;i<q;i++)
        {
        	qu[i]=s.next().charAt(0);
        	qui[i][0]=s.nextInt();
        	if(qu[i]=='U')
        		qui[i][1]=s.nextInt();
        }
        
        for(int i=0;i<q;i++)
        {
           if(qu[i]=='U')
           {
        	   b[qui[i][0]-1]= b[qui[i][0]-1]+qui[i][1];
           }
           if(qu[i]=='Q')
           {   for(int y=0;y<n;y++)
        	   c[y]=0;
        	   count=0;
        	   fun(qui[i][0]-1);
        	   System.out.println(count);
           }
        	
        }
        
        
	}
	private static void fun(int i) {
		int px=0;
		for(int h=0;h<a.length;h++)
		{
			if(a[h][0]-1==i)
			{
				px=a[h][1]-1;
		
				fun(px);
			}
			if(c[px]==0)
			{
				if(b[px]==0)
					count++;
			c[px]=1;
			}
		}
		return;
			
		}
		
	}


