import java.util.Scanner;


public class chef {
	/* Function to merge the two haves arr[l..m] and arr[m+1..r] of array arr[] */
	static void merge(long[] a, int l, int m, int r)
	{
	    int i, j, k;
	    int n1 = m - l + 1;
	    int n2 =  r - m;
	 
	    /* create temp arrays */
	    int L[]=new int[n1];
	    int R[]=new int[n2];
	 
	    /* Copy data to temp arrays L[] and R[] */
	    for(i = 0; i < n1; i++)
	        L[i] = (int) a[l + i];
	    for(j = 0; j < n2; j++)
	        R[j] = (int) a[m + 1+ j];
	 
	    /* Merge the temp arrays back into arr[l..r]*/
	    i = 0;
	    j = 0;
	    k = l;
	    while (i < n1 && j < n2)
	    {
	        if (L[i] <= R[j])
	        {
	            a[k] = L[i];
	            i++;
	        }
	        else
	        {
	            a[k] = R[j];
	            j++;
	        }
	        k++;
	    }
	 
	    /* Copy the remaining elements of L[], if there are any */
	    while (i < n1)
	    {
	        a[k] = L[i];
	        i++;
	        k++;
	    }
	 
	    /* Copy the remaining elements of R[], if there are any */
	    while (j < n2)
	    {
	        a[k] = R[j];
	        j++;
	        k++;
	    }
	}
	 
	/* l is for left index and r is right index of the sub-array
	  of arr to be sorted */
	static void mergeSort(long[] a, int l, int r)
	{
	    if (l < r)
	    {
	        int m = l+(r-l)/2; //Same as (l+r)/2, but avoids overflow for large l and h
	        mergeSort(a, l, m);
	        mergeSort(a, m+1, r);
	        merge(a, l, m, r);
	    }
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,k,i,j,count=0,tcount=0,p,t=0,t1=0,h,l,have=0,waste=0,need=0;
		long st,di,mst=1000000000,mdi=1000000000,mi=1000000000,mi1=1000000000,max=0,max1=0; 
		n=s.nextInt();
		k=s.nextInt();
		long a[]= new long[n];
		long b[]= new long[n];
		long b1[]= new long[n];
        for(i=0;i<n;i++)
        {
        	a[i]=s.nextLong();
        }
        mergeSort(a,0,n-1);
       for(i=0;i<n-k-1;i++)
       {
    	   for(j=i+1;j<=i+k+1;j++)
    	   {
    	   
    		 di=a[j]-a[i];
    		 l=j;
    		 h=j+1;
    		 while(h<n)
    		 {
    			 if((a[h]-a[l])<di)
    			 {
    				 waste++;
    				 h++;
    			 }
    			 else if((a[h]-a[l])==di)
    			 {
    				 have=have+1;
    				 l=h;
    				 h=l+1;
    			 }
    			 else //if(a[h]-a[l]>k)
    			 {
    				 if(((a[h]-a[l])%di)==0)
    				 {
    					 need=need + (int) (((a[h]-a[l])/di)-1);
    					 l=h;
    					 h=l+1;
    				 }
    				 else
    				 {
    					 h++;
    				 }
    				 
    				 
    			 }
    			
    		 }
    		if(have>=(n+j-i-2*k-3)&&need<=(k+1+i-j))
    				{
    			      
    				}
    		   need=0;
        	   have=0;
        	   waste=0;
    	   }
       }
	}

}
