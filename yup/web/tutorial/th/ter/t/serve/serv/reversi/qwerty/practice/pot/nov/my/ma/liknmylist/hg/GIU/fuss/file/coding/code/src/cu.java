import java.util.Scanner;


public class cu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k;
		k=s.nextInt();
		int i,j,t,n,m,max=10000,maxp=10000,sum=0;;
		while(k>0)
		{
			t=s.nextInt();
			n=s.nextInt();
			m=s.nextInt();
			int a[][]=new int[n][m];
			
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					a[i][j]=s.nextInt();
					
					
					
				}
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					if(max<a[i][j])
					{if(max==maxp||max==maxp+1||max==maxp-1)
						max=a[i][j];
						
						
						
					}
					
					
					
					
					
				}
				sum=sum+max;
				
				
				 
				
				
				maxp=max;
				max=10000;
			}
			sum=0;
			maxp=10000;
			if(t>sum)
			{
				System.out.println("YES");
			}
			else
				System.out.println("NO");
			
			
			
			k--;
			
		}

	}

}
