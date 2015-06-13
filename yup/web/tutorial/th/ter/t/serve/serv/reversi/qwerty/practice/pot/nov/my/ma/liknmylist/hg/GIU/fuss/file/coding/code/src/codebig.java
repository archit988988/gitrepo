import java.math.BigInteger;
import java.util.Scanner;


public class codebig {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		int t,j;
		t = s.nextInt();
		int k=0;
		BigInteger two = new BigInteger("2");
		BigInteger one = new BigInteger("1");
		BigInteger bi[] = new BigInteger[1000];
		BigInteger i;
		while(t>0)
		{   
			str=s.next();
			if(str.length()<16)
			{
				BigInteger n = new BigInteger(str);
				BigInteger m = n;
				i=n.mod(two);
				while(i.compareTo(BigInteger.ZERO)==0)
				{
					bi[k]=two;
					k++;
					n=n.divide(two);
				}
					one=m.divide(two);
				for(i=new BigInteger("3");i.compareTo(one)!=1;i=i.add(two) )
				{
					if(n.mod(i).compareTo(BigInteger.ZERO)==0)
							{
                                bi[k]= i;
                                k++;
                                n=n.divide(i);
                                i=i.subtract(two);
                                
                                
							}
				}
				
				if(k==0)
				{
					System.out.println("1");
					System.out.println(str);
					
					
				}
				else
					{
		               System.out.println(k);
		               for(j=0;j<k;j++)
		               {
		            	   System.out.println(bi[j]);
		               }
					}
				
				
			}
			else{
				System.out.println("1");
				System.out.println(str);
			}
			
			t--;
			k=0;
		}

	}

}
