import java.math.BigInteger;
import java.util.Scanner;


public class i {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i,j,m,t;
		long n,sum=0;
		BigInteger bi;
		t= s.nextInt();
		while(t>0)
		{
		String str = s.next();
		
		m=s.nextInt();
		if(str.length()>8)
		{
			bi = new BigInteger(str);
			
		}
		else
		{
			n=Integer.parseInt(str);
			for(i=1;i<=n/2;i++)
			{
				sum=sum+(((((i*i)%m)*((i*i)%m))%m)*(n%i))%m;
		    }
			for(;i<=n;i++)
			{
				sum=sum+(((i*i)%m)*((i*i)%m))%m;
		    }
			
			//sum= (sum+(((((n*(2*n+1))%m)*(n+1))%m)*(((3*(n*n)%m)+3*n-1)%m)%m)%m);
			//sum= (sum-(((((n/2*(2*n/2+1))%m)*(n/2+1))%m)*(((3*(n/2*n/2)%m)+3*n/2-1)%m)%m)%m);
			sum= sum+((((n*(n+1))%m)*((n*(n+1))%m))%m)/4;
			sum=sum%m;
			System.out.println(sum);
		
		}
		t--;
		}

	}

}
