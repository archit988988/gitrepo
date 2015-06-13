import java.util.Scanner;


public class code3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,m,i,j,v=0,k,l,temp;
		n= s.nextInt();
		m=s.nextInt();
		long a[]= new long[n];
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
		l=v;
		while(m>0)
		{
			i=s.nextInt();
			j=s.nextInt();
			if(i>j)
			{
				temp=i;
				i=j;
				j=temp;
			}
			if(a[i-1]>a[j-1])
			{
				v--;
			}
			else if(a[i-1]<a[j-1])
			{
				v++;
			}
			
			for(k=i;k<j-1;k++)
			{
				if(a[i-1]>a[k]&&a[j-1]<a[k])
				{
					v=v-2;
				}
				else if(a[i-1]<a[k]&&a[j-1]>a[k])
				{
					v=v+2;
				}
				
			
			}
			System.out.println(v);
			v=l;
			m--;
		}

	}

}
