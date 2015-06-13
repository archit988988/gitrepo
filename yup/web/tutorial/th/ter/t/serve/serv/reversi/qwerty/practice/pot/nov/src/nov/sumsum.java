package nov;

import java.util.Scanner;

public class sumsum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,i,j,q;
		n=s.nextInt();
		int n1[]=new int[n];
		int nsum[]=new int[n];
		nsum[0]=0;
		n1[0]=s.nextInt();
		nsum[0]=n1[0];
		for(i=1;i<n;i++)
		{
			n1[i]=s.nextInt();
			nsum[i]=nsum[i-1]+n1[i];
		}
		int n2[][]=new int[n][3];
		for(i=0;i<n;i++)
		{
			n2[i][0]=s.nextInt();
			n2[i][1]=s.nextInt();
			
			//n2[i][2]=nsum[n2[i][1]]-nsum[n2[i][0]];
			
			
		}
		q=s.nextInt();
		int a[][]=new int[q][3];
		for(i=0;i<q;i++)
		{
			a[i][0]=s.nextInt();
			a[i][1]=s.nextInt();
			a[i][2]=s.nextInt();
		}
		
				

	}

}
