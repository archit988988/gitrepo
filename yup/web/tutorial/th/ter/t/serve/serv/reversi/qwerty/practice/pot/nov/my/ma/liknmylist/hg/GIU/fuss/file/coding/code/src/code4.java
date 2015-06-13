import java.math.BigInteger;
import java.util.Scanner;


public class code4 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n,i;
		BigInteger k,k1,o;
		o=new BigInteger("720");
		k1 = new BigInteger("1000000007");
		BigInteger l=new BigInteger("1");
		n=s.nextInt();
		if(n<13)
			System.out.println(0);
		else if(n==13||n==14)
		{
			System.out.println(1);
		}
		else
		{
	       for(i=1;i<=6;i++)
	       {    k= new BigInteger(String.valueOf(((n-13)/2)+i));
	    	   l = l.multiply(k);
	    	  // System.out.println(l);
	       }
	       
	       l=l.divide(o);
	       BigInteger bi[]= l.divideAndRemainder(k1);
	       System.out.println(bi[1]);
		}
	}

}
