package coding;

import java.util.Scanner;

public class fuck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t,n,i,f2=0,f3=0;
        t=s.nextInt();
        while(t>0)
        {
        	n=s.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
        	{
        		a[i]=s.nextInt();
        		if(a[i]==2)
        			f2=1;
        		if(a[i]==3)
        			f3=1;
        	}
        	System.out.println(f2+f3);
        	f3=0;
        	f2=0;
        	t--;
        }
	}

}
