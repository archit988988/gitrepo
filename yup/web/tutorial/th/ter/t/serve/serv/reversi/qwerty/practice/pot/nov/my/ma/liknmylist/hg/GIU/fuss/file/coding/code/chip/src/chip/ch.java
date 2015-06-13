package chip;

import java.util.Scanner;

public class ch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t,n=0,x,y,i,sum=0,xt=0,yt=0;
		t=s.nextInt();
		while(t>0)
		{   n=0;
			x=s.nextInt();
			y=s.nextInt();
			if(y/10>x/10)
			{n=(y/10-x/10-1);
		
			for(i=x;i<=(x/10+1)*10-1;i++)
			{  int j=i;
				while(j!=0)
				{
					if((j%10)%2==0)
					{
						xt=xt+(j%10)*2;
						j=j/10;
					}
					else
					{
						xt=xt+j%10;
						j=j/10;
					}
					
				}
				sum=sum+xt%10;
				xt=0;
			}
			for(i=y;i>=(y/10)*10;i--)
			{  int j=i;
				while(j!=0)
				{
					if((j%10)%2==0)
					{
						xt=xt+(j%10)*2;
						j=j/10;
					}
					else
					{
						xt=xt+j%10;
						j=j/10;
					}
					
				}
				sum=sum+xt%10;
				xt=0;
			}
			}
			else
				{for(i=y;i>=x;i--)
				{  int j=i;
					while(j!=0)
					{
						if((j%10)%2==0)
						{
							xt=xt+(j%10)*2;
							j=j/10;
						}
						else
						{
							xt=xt+j%10;
							j=j/10;
						}
						
					}
					sum=sum+xt%10;
					xt=0;
				}
				}
			sum=sum+n*45;
			System.out.println(sum);
			sum=0;
			
			t--;
		}

	}

}
