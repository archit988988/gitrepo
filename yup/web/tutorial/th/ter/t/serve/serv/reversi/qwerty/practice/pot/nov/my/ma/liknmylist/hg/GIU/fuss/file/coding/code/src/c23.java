import java.util.Scanner;


public class c23 {

	public static void main(String[] args) {
		


	
				Scanner s = new Scanner(System.in);
				int n,k,i,j,count=0,tcount=0,h,l,waste=0,i1=0;
				long st,di,mst=0,mdi=0;
				n=s.nextInt();
				k=s.nextInt();
				long a[]= new long[n];
		        for(i=0;i<n;i++)
		        {
		        	a[i]=s.nextLong();
		        }
		        for(i=0;i<n-1;i++)
		        {for(j=i+1;j<=i+k+1||j<n;j++)
		        {
		        	di=(a[i+1]-a[i])/(j-i);
		        	if(i==0)
		        		mdi=di;
		        	count=0;
		        	tcount=0;
		        	h=i;
		        	l=i-1;
		        	waste=0;
		        	while(l>=0)
		        	{
		        		if(a[h]-a[l]==(1+waste)*di)
		        		{   h=l;
		        			l--;
		        			
		        			waste=0;
		        		}
		        		else
		        		{
		        			count++;
		        			waste++;
		        			l--;
		        		}
		        		if(count>k)
		        		{
		        			break;
		        		}
		        	}
		        	if(count>k)
		        	{
		        		continue;
		        	}
		        	
		        	
		        		h=i+1;
		        		l=i;
		        		waste=0;
		        	while(h<n)
		        	{
		        		if(a[h]-a[l]==(1+waste)*di)
		        		{
		        			l=h;
		        			h++;
		        			waste=0;
		        		}
		        		
		        		else
		        		{
		        			tcount++;
		        			waste++;
		        			h++;
		        		}
		        		if(tcount+count>k)
		        		{
		        			break;
		        		}
		        	}
		        	if(tcount+count>k)
		        		continue;
		        	st=a[i]-i*di;
		        	if(i1==0)
		        	{
		        		mst=st;
		        		i1++;
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
		        }
		        }
		       for(i=0;i<n;i++)
		       {
		    	   System.out.print(mst+i*mdi+" ");
		       }
		        
			}

		


	}


