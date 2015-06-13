package coding;

import java.util.Scanner;

public class fucky {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m,n,i;
        
        
        
        	n=s.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
        	{
        		a[i]=s.nextInt();
        		
        	}
        	m=s.nextInt();
        	int a1[][]=new int[m][4];
        	for(i=0;i<m;i++)
        	{
        		a1[i][0]=s.nextInt();
        		a1[i][1]=s.nextInt();
        		a1[i][2]=s.nextInt();
        		if(a1[i][0]==1)
        		a1[i][3]=s.nextInt();
        	}
        	for(i=0;i<m;i++)
        	{    if(a1[i][0]==1)
        	{
        		for(int j=a1[i][1]-1;j<=a1[i][2]-1;j++)
        		{
        			if(a[j]%a1[i][3]==0)
        				a[j]=a[j]/a1[i][3];
        				
        		}
        	}
        	else
        	{
        	  a[a1[i][1]-1]=a1[i][2];
        	}
        	}
          for(i=0;i<n;i++)
          {
        	  System.out.print(a[i]+" ");
          }
     
	}
}