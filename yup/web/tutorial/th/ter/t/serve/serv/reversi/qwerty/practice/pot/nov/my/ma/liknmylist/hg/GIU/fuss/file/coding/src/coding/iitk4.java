package coding;

import java.util.Scanner;

public class iitk4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t,n,m=0;
		t=s.nextInt();
		while(t>0)
		{  n=s.nextInt();
		   int a[]=new int[n];
		   for(int i=0;i<n;i++)
		   {
			   a[i]=s.nextInt();
			   if(a[i]>m)
				   m=a[i];
		   }
		   System.out.println(m);
		   m=0;
			t--;
		}

	}

}
