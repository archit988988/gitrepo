package chip;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t,x,y,k,i=0,j,sq,sum=0,ksum=0;
        int a[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317};
        
		t=s.nextInt();
		while(t>0)
		{   i=0;
		    sum=0;
			x=s.nextInt();
			y=s.nextInt();
			k=s.nextInt();
			for(int u=x;u<=y;u++)
			{j=u;
			
			 sq=(int) Math.sqrt(j);
			 i=0;
			while(a[i]<=sq&&ksum<=k&&j>1)
			{
				if(j%a[i]==0)
				{
					ksum++;
					j=j/a[i];
					while(true)
					{
						if(j%a[i]==0)
							{j=j/a[i];
							          
							}
						else
							break;
					}
				}
				i++;
			}
			
			if(j!=1)
				ksum++;
			if(ksum==k)
				sum=sum+1;
			ksum=0;
			
			}	
			System.out.println(sum);
			t--;
		
		}
	}

}
