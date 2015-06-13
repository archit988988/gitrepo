package chip;

import java.util.Scanner;

public class sie {

	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   int t,n,m,i,sum=0;
	   int c[]=new int[100];
	   int d[]=new int[100];
	   t=s.nextInt();
	   while(t>0)
	   {   for(i=0;i<100;i++)
	   {
		   c[i]=0;
		   d[i]=0;
	   }
		   n=s.nextInt();
		   m=s.nextInt();
		   int a[][]=new int[n][2];
		   int b[][]=new int[m][2];
		   for(i=0;i<n;i++)
		   {
			   a[i][0]=s.nextInt();
			   a[i][1]=s.nextInt();
			   c[a[i][1]-1]=c[a[i][1]-1]+a[i][0];
		   }
		   
		   for(i=0;i<m;i++)
		   {
			   b[i][0]=s.nextInt();
			   b[i][1]=s.nextInt();
			   d[b[i][1]-1]=d[b[i][1]-1]+b[i][0];
		   }
		   for(i=0;i<100;i++)
		   {
			   if(c[i]<d[i])
			   {
				   sum=sum+d[i]-c[i];
			   }
		   }
		   System.out.println(sum);
		   sum=0;
		   
		   t--;
	   }
	   

	}

}
