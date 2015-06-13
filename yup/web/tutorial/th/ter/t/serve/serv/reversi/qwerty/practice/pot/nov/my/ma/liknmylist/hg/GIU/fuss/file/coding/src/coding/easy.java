package coding;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class easy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t,n,i,sum=0;
		t=s.nextInt();
		while(t>0)
		{   n=s.nextInt();
		    int a[]=new int[n];
		    for(i=0;i<n;i++)
		    {  
		    	a[i]=s.nextInt();
		    }
		    Arrays.sort(a);
		  //  for(i=0;i<n;i++)
		    //	System.out.print(" "+a[i]);
		    for(i=n-1;i>=0;i=i-2)
		    {
		    	sum=sum+a[i];
		    }
		    	
		    System.out.println(sum);
		    sum=0;
			t--;
		}

	}

}
