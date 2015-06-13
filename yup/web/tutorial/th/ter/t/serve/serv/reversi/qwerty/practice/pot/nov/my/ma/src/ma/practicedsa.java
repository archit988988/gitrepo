package ma;
import java.util.Scanner;

public class practicedsa {
    public void swap(int[]a,int i,int j)
    {
    	int k;
    	k=a[i];
    	a[i]=a[j];
    	a[j]=k;
    }
    public static int max(int[]a,int n, int u)
    {  int largest = a[u];
    	for(int i =u;i<n;i++) {
    		
    		            if(a[i] > largest) {
    		
    		                largest = a[i];
    		
    		            }
    		
    		        }
    	return largest;

    }
	public static void main(String[] args) {
		practicedsa q = new practicedsa();
    	int i,j,n;
		char ch;
		long starttime=0, endtime=0;
		
		Scanner s = new Scanner(System.in);
		n= s.nextInt();
		int[] a = new int[n];
		int[] y = new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			y[i]=s.nextInt();
		}
       // System.out.println("input method");
        //ch = s.next().charAt(0);

		
		
		
		
		
         starttime = System.nanoTime();
        	
        	for(i=0;i<n;i++)
        	{
        		for(j=0;j<n-i-1;j++)
        		{
        			if(y[j]<y[j+1])
        			{
        				q.swap(y,j,j+1);
        			}
        		}
        	} 
        	endtime = System.nanoTime();
        	 System.out.println("buble sort  "+ (endtime-starttime));
        
        
        
      /*  for(i=0;i<n;i++)
    	{
    		
    		
    			
    			
    		     System.out.println(a[i]);
    			
    		
    	}*/     	  
        
       
       
       
    	   
    	    int max1=max(a,n,0);
    	    starttime = System.nanoTime();
    	   int[] c = new int[max1];
    	   int[] b = new int[n];
    	   for(i=0;i<max1;i++)
    	   {
    		   c[i]=0;
    	   }
    	   for(i=0;i<n;i++)
    	   {
    		   c[a[i]-1]=c[a[i]-1] + 1;
    	   }
    	   for(i=1;i<max1;i++)
    	   {
    		   c[i]=c[i]+c[i-1];
    	   }
    	   for(i=n-1;i>=0;i--)
    	   {
    		   b[c[a[i]-1]-1]= a[i];
    		   c[a[i]-1]=c[a[i]-1]-1;
    	   }
    	   endtime = System.nanoTime();
    	   System.out.println("count sort  "+ (endtime-starttime));
    	   
    	   
    	   for(i=0;i<n;i++)
    	   {    
    		   for(j=i;j<n-1;j++)
    		   {
    			   int max2 = max(a,n,i);
    			  
    		   }
    	   }
    	   
    	
       
	}

}
