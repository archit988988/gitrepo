import java.util.Scanner;
import java.math.*;

public class code5 {

	public static void main(String[] args) {
	 Scanner s= new Scanner(System.in);
	 String str;
	 int k=0,u;
	 long a[]= new long[1000];
	 long n,j,i=2;
	 u=s.nextInt();
	 while(u>0)
	 {k=0;
	 i=2;
	 str=s.next();
	 if(str.length()<=11)
	 {
		 n=Long.parseLong(str);
	
		  j=n;
		  if(n==2)
		  {
			  System.out.println(1);
				 System.out.println(2);
		  }
	
		  for(i=2;i<=Math.sqrt(n);i++)
		  {
			  if(n%i==0)
			  {
				  a[k]= i;
				  k++;
				  n=n/i;
				  i--;
				  
			  }
		  }
		  a[k]=n;
		  if(k==0)
		  {
			  System.out.println(1);
				 System.out.println(str);
		  }
		  
		  else
		  {
		 System.out.println(k+1);
		 for(i=0;i<=k;i++)
		 {
			 System.out.println(a[(int) i]);
		 }
		  }
	 }
	 else 
	 {
		 System.out.println(1);
		 System.out.println(str);
	}
	 u--;

	}

}
}