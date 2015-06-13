import java.util.Scanner;


public class code7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,k,i,j,count=0,tcount=0,p,t=0,t1=0;
		long st,di,mst=1000000000,mdi=1000000000,h,l,mi=1000000000,mi1=1000000000,max=0,max1=0; 
		n=s.nextInt();
		k=s.nextInt();
		long a[]= new long[n];
		long b[]= new long[n];
		long b1[]= new long[n];
        for(i=0;i<n;i++)
        {
        	a[i]=s.nextLong();
        }
        for(i=0;i<n-1;i++)
        {
        	for(j=i+1;j<n;j++)
        	{   t=0;
        	    t1=0;
        		if(a[i]<a[j])
        		{
        			h=a[j];
        			l=a[i];
        		}
        		else if(a[i]>a[j])
        		{
        			h=a[i];
        			l=a[j];
        		}
        		else
        			continue;
        		
        		di=h-l;
        		for(p=0;p<n;p++)
        		{ 
        			if(a[p]<l&&a[p]>=(l-di*(n-2))&&(a[p]-l)%di==0 )
        			{
        				count++;
        				b[t]=a[p];
        				t++;
        				if(a[p]<mi)
        					mi=a[p];
        				
        			}
        		}
        		for(p=0;p<n;p++)
        		{
        			if(a[p]>h&&a[p]<=(h+di*(n-2-count))&&(a[p]-h)%di==0)
        			{    
        				b1[t1]=a[p];
        				t1++;
        				if(a[p]>max)
        					max=a[p];
        				tcount++;
        				if(a[p]<mi1)
        					mi1=a[p];
        			}
        		}
        		
        		for(p=0;p<t-1;p++)
        		{
        			if(b[p]==b[p+1])
        				count--;
        		}
        		for(p=0;p<t1-1;p++)
        		{
        			if(b1[p]==b1[p+1])
        				tcount--;
        		}
        		
        		
        		if((tcount+count)<n-2-k)
        		{
        			continue;
        		}
        		if(count==0)
        		{
        			st=l-(k-((max-h)/di)+t1)*di;
        			
        		}
        		else
        		{
        			st=mi-(k-((max-h)/di)+t1+t-(l-mi)/di)*di;
        		}
        		if(st<mst)
        		{
        			mst=st;
        			mdi=di;
        		}
        		else if(st==mst)
        		{
        			if(di<mdi)
        			{
        				mst=st;
        				mdi=di;
        			}
        		}
        		
        	tcount=0;
        	count=0;
        	mi=1000000000;
        	mi1=1000000000;	
        	}
        }
        for(i=0;i<n;i++)
        {
        	System.out.print(mst+i*mdi+" ");
        }
        
	}

}
