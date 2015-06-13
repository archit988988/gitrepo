import java.util.*;
import java.io.*;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int t,i,count=0,p=0 ,tp;
		int n , k;
	  
		Scanner s = new Scanner(System.in);
		System.out.println("enter a no.");
		t = s.nextInt();
		tp=t;
		  String[] ans = new String[t];
		while(t>0)
		{n = s.nextInt();
		k = s.nextInt();
		int[] a = new int[n];
			for( i =0;i<n;i++)
			{
				a[i] = s.nextInt();
			}
			for(i=0;i<n;i++)
			{
				if(a[i]%2==0)
				{
					count++;
					
				}
				if(count==k)
				{
					break;
				}
			}
			if(i<n)
			{
			 ans[p]="YES";
			}
			else
			{
				 ans[p]="NO";
			}
			t--;
			p++;
			count=0;
				
		}
		for(i=0;i<tp;i++)
		{
		 System.out.println(ans[i]);	
		}
        
	}

}


	


