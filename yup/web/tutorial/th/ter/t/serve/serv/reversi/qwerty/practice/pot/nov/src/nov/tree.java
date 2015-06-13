package nov;

import java.util.Scanner;

public class tree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t,i,m=0,n,k=0,te=1,path,leco,rico,lc,rc,ans = 0,gg,mm;
		t=s.nextInt();
		String str,mo;
		str=s.nextLine();
		int a[]=new int[31];
		int b[]=new int[31];
		char c[][]=new char[t][2];
		int xy[][]=new int[t][2];
		for(i=0;i<t;i++)
		{   str=s.next();
			//c[i][0]=str.charAt(0);
			c[i][1]=str.charAt(1);
			if(c[i][1]!='i')
			{//mo=str.charAt(3)+" ";
			xy[i][0]=s.nextInt();
			//System.out.println(xy[i][0]);
			xy[i][1]=s.nextInt();
			}
		}
		for(i=0;i<t;i++)
		{  path=0;
		   lc=0;
		   rc=0;
			if(c[i][1]=='i')
			{
				k=k+te;
				te=-te;
			}
			else
			{ int j=0;
				while(xy[i][0]!=1)
				{   
					xy[i][0]=xy[i][0]/2;
					a[j]=xy[i][0];
					j++;
					lc++;
				}
				while(xy[i][1]!=1)
				{
					xy[i][1]=xy[i][1]/2;
					rc++;
				}
				if(lc%2==k)
				{
					leco=0;
				}
				else
					leco=1;
				if(rc%2==k)
				{
					rico=0;
				}
				else
					rico=1;
				
				if(leco==rico)
				{
				
				if(c[i][1]=='b')
				{
				  if(leco==0)
				  {
					  ans=2+path/2;
				  }
				  else
					  ans=(path/2)+1;
				}
				if(c[i][1]=='r')
				{
				  if(leco==1)
				  {
					  ans=2+path/2;
					 // System.out.println(ans);
				  }
				  else
					  ans=(path/2)+1;
				 // System.out.println(ans);
				}
				
				}
				else
					{
					
					ans=1+path/2;
					//System.out.println(ans);
					}
			}
			System.out.println(ans);
		}
			
	}

}
