import java.util.Scanner;


public class code2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	     int n,m,i,j,val=0;
	     char c;
	     n= s.nextInt();
	     m= s.nextInt();
	     int a[]= new int[ n];
	     int b[]= new int[ n];
	     for(i=0;i<n;i++)
	     {
	    	 a[i]=s.nextInt();
	    	 
	     }
	     char str;
	     
	     while(m>0)
	     {
	     c  = s.next().charAt(0);
	     j = s.nextInt();
	     //System.out.println();
	    
	    // System.out.println(j);
	     if(c=='A')
	     {
	    	val=(val-j)%n;
	     }
	     if(c=='C')
	     {
	    	val=(val+j)%n;
	     }
	     if(c=='R')
	     {   
	    	 if(val+j-1<0)
	    	 {
	    		 System.out.println(a[n+(val+j-1)]);
	    	 }
	    	// System.out.println(a[(j-1+(val%n))]);
	    	 else if(val+j-1>n-1)
	    	 {
	    		 System.out.println(a[val+j-1-n]);
	    	 }
	    	 else
	    	 {
	    		 System.out.println(a[(j-1+(val))]);
	    	 }
	     }
	     m--;
	     }
	   // System.out.println((-100%3)); 

	}

}
