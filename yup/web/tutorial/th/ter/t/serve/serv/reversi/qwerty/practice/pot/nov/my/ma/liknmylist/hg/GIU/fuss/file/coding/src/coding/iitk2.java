package coding;

import java.util.Scanner;
public class iitk2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		str=s.next();
		int i,j,l,maxf=0,c=0,mc=0;
		char maxa=0;
		int a[]=new int[26];
		for(i=0;i<26;i++)
		{
			a[i]=0;
		}
		l=str.length();
		for(i=0;i<26;i++)
		{
		  for(j=0;j<l;j++)
		  {
			  if(str.charAt(j)==(i+97))
			  {  c++;
			  if(c>mc)
				  mc=c;
			  }
			  else
			  {
				  c=0;
			  }
			  
		  }
		  a[i]=mc;
		  mc=0;
		  c=0;
		}
       for(i=25;i>=0;i--)
       {
    	   if(a[i]>=maxf)
    	   {
    		   maxf=a[i];
    		   maxa=(char) (i+97);
    	   }
       }
       
       System.out.println(maxa);
       System.out.println(maxf);
	}

}
