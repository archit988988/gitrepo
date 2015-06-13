package nov;

import java.util.Scanner;

public class chale {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t,n=0,m,i;
		String str;
		t=s.nextInt();
		while(t>0)
		{  
		  str=s.next();
		  m=str.length();
		  int c[]= new int[26];
		  for(i=0;i<26;i++)
		  {
			  c[i]=0;
		  }
		  n=0;
		  for(i=0;i<m;i++)
		  {
			  if(c[str.charAt(i)-97]==0)
			  {  c[str.charAt(i)-97]=1;
				  n++;
				  
			  }
			  if(n==26)
				  break;
			  
		  }
		  
		  System.out.println(n);
		  System.out.println(Math.pow(2,40));
			
			t--;
		}

	}

}
