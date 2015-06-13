package nov;

import java.util.Scanner;

public class marathon {

	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  int t,n,q,i,le,ri;
	  t=s.nextInt();
	  while(t>0)
	  {
		  n=s.nextInt();
		  // a[]=new int[n];
		  long a[]=new long[n];
		  a[0]=s.nextInt();
		   //sum[0]=a[0];
		  for(i=1;i<n;i++)
		  {
			  a[i]=s.nextInt();
			  a[i]=a[i-1]+a[i];
			  
		  }
		  q=s.nextInt();
		  //int qa[][]=new int[q][2];
		  for(i=0;i<q;i++)
		  {
			  le=s.nextInt();
			  ri=s.nextInt();
			  System.out.println(a[ri]-a[le]);
			  
		  }
		  
		  
		  
		  
		  
		  t--;
		  
	  }

	}

}
