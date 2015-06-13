package code;

import java.util.Scanner;

public class coder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t1;
		long i,j,v;
		int t = s.nextInt();
	     t1= t;
		String str;
		//int store[] = new int[t];
		
		
		
		while(t>0)
		{
        str= s.next();
        char c;
        j=str.length();
        if(str.charAt(0)=='r')
        {
        	v=4;
        }
        else
        {
        	v=2;
        }
        for(i=1;i<j;i++)
        {
        	if((i-1)%2==0)
        	{
        		if(str.charAt((int) i)=='r')
        		{
        			v=(2*v+1)%1000000007;
        		}
        		else
        		{
        			v=(2*v-1)%1000000007;
        		}
        		
        	}
        	else
        	{
        		if(str.charAt((int) i)=='r')
        		{
        			v=(2*v+2)%1000000007;
        		}
        		else
        		{
        			v=(2*v)%1000000007;
        		}
        		
        		
        		
        		
        	}
        	
        }
        System.out.println(v%(1000000000+7));
        v=0;
        t--;
	}
  
	//   System.out.println(store[t]%(1000000000+7));
  
		
}
}