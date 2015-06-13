package coding;

import java.util.Scanner;

public class supre {
	/* Function to merge the two haves arr[l..m] and arr[m+1..r] of array arr[] */
	static void merge(double[][] a, int l, int m, int r)
	{
	    int i, j, k;
	    int n1 = m - l + 1;
	    int n2 =  r - m;
	 
	    /* create temp arrays */
	    double L[][]=new double[n1][2];
	    double R[][]=new double[n2][2];
	 
	    /* Copy data to temp arrays L[] and R[] */
	    for(i = 0; i < n1; i++)
	        {L[i][1] =  a[l + i][4];
	         L[i][0]=a[l+i][3];
	          
	        }
	    for(j = 0; j < n2; j++)
	    { R[j][1] = a[m +1+  j][4];
	    
	    R[j][0] = a[m +1+  j][3];
	    }
	    /* Merge the temp arrays back into arr[l..r]*/
	    i = 0;
	    j = 0;
	    k = l;
	    while (i < n1 && j < n2)
	    {
	        if (L[i][1] <= R[j][1])
	        {
	            a[k][4] = L[i][1];
	            a[k][3] = L[i][0];
	            i++;
	        }
	        else
	        {
	            a[k][4] = R[j][1];
	            a[k][3] = R[j][0];
	            j++;
	        }
	        k++;
	    }
	 
	    /* Copy the remaining elements of L[], if there are any */
	    while (i < n1)
	    {
	        a[k][4] = L[i][1];
	        a[k][3] = L[i][0];
	        i++;
	        k++;
	    }
	 
	    /* Copy the remaining elements of R[], if there are any */
	    while (j < n2)
	    {
	        a[k][4] = R[j][1];
	        a[k][3] = R[j][0];
	        j++;
	        k++;
	    }
	}
	 
	static /* l is for left index and r is right index of the sub-array
	  of arr to be sorted */
	void mergeSort(double[][] a, int l, int r)
	{
	    if (l < r)
	    {
	        int m = l+(r-l)/2; //Same as (l+r)/2, but avoids overflow for large l and h
	        mergeSort(a, l, m);
	        mergeSort(a, m+1, r);
	        merge(a, l, m, r);
	    }
	}
	 
	static double max(double d, double k) { return (d > k)? d : k; }
	 
	// Returns the maximum value that can be put in a knapsack of capacity W
	static double knapSack(int W, double[] b, double[] c, int n)
	{
	   int i, w;
	   double K[][]=new double[n+1][W+1];
	 
	   // Build table K[][] in bottom up manner
	   for (i = 0; i <= n; i++)
	   {
	       for (w = 0; w <= W; w++)
	       {
	           if (i==0 || w==0)
	               K[i][w] = 0;
	           else if (b[i-1] <= w)
	                 K[i][w] = max(c[i-1] + K[i-1][(int) (w-b[i-1])],  K[i-1][w]);
	           else
	                 K[i][w] = K[i-1][w];
	       }
	   }
	 
	   return  K[n][W];
	}
	

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 int t,k,count=0,g=0,num=1,den=1,sum=0,n;
	
	 
	 t=s.nextInt();
	 while(t>0)
		 
	 { n=s.nextInt();
	 k=s.nextInt();
		 double a[][]=new double[n][5];
		double b[]=new double[n];
		double c[]=new double[n];
	    for(int i=0;i<n;i++)
	    {
	    	a[i][0]=s.nextInt();
	    	a[i][1]=s.nextInt();
	    	a[i][2]=s.nextInt();
	    	a[i][3]=a[i][0]*a[i][1];
	    	a[i][4]=a[i][3]/a[i][2];
	    	b[i]=a[i][3];
	    	c[i]=a[i][4];
	    }
	   
//	    for(int i=0;i<n-1;i++)
//	    {
//	    	for(int j=0;j<n-i;j++)
//	    	{
//	    		if(a[j][3]>a[j+1][3])
//	    		{
//	    			int temp
//	    		}
//	    	}
//	    }
	     mergeSort(a,0,n-1);  
	   double ans= knapSack(k,b,c,n-1);
	    System.out.println(ans);
	    
	 
		 t--;
	 }

	}

}
