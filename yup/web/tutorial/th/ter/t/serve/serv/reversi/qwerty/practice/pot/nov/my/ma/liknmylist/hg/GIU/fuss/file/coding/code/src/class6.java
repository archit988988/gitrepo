import java.util.Scanner;


public class class6 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,m,i,j,v=0,k,l,temp,p;
		n= s.nextInt();
		m=s.nextInt();
		long a[]= new long[n];
		long b[][]=new long[n][n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextLong();
		}
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					v++;
				}
			}
		}
		p=v;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{b[i][j]=0;
				if(a[i]<a[j])
				{
					b[i][j]=-1;
				}
				else if(a[i]>a[j])
				{
					b[i][j]=+1;
				}
				
					
			}
		}
		while(m>0){
			
		
		i=s.nextInt();
		j=s.nextInt();
		for(k=0;k<j-1;k++)
		{
			v=(int) (v-b[i-1][k]);
		}
		for(k=i-1;k<n;k++)
		{
			v=(int) (v+b[k][j-1]);
		}
		System.out.println(v);
		v=p;
      m--;
      
	}

}
}