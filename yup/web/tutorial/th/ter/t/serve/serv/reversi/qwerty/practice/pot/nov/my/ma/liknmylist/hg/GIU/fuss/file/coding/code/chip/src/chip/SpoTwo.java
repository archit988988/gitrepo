package chip;
import java.math.BigInteger;
import java.util.*;
class SpoTwo{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int testcase,n,answer;
    BigInteger bs,b2,bb,bn,an;
    b2 = new BigInteger("2");
    bb=new BigInteger("1000000007");
    long bin;
    String s;
    testcase=sc.nextInt();
    for(int i=0;i<testcase;i++){
        n=sc.nextInt();
       
        s=Integer.toBinaryString(n);
       // n=Integer.parseInt(s,2);
        //s=Integer.toString(n*2);
        bs=new BigInteger(s.replace('1', '2'));
        an = b2.modPow(bs,bb);
        
        //answer=(int)Math.pow(2,bin*2);
        System.out.println(an);
    }
    }
}