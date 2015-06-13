package ma;

import java.io.InputStream;

import java.util.Scanner;


public class na
{
   public static void main( String[] args )
   {   long n,m,i,j;
       int t,h=0,c=0;
       Scanner s = new Scanner(System.in);
       t= s.nextInt();
	  
	   while(t>0){
	   n= s.nextLong();
	   m= s.nextLong();
	   int[] arr = new int[(int) n];
	   int[][] am = new int[(int) m][2];
	   int[] arr1 = new int[(int) n];
	   int[] flag = new int[(int) n];
	  
	   for(i=0;i<n;i++)
	   {   arr1[(int) i] = (int) i;
		   arr[(int) i]=s.nextInt();
	   }
	  for(i=0;i<m;i++)
	  {
		  am[(int) i][0] = s.nextInt();
		  am[(int) i][1] = s.nextInt();
		  
	  }
	  for(i=0;i<n;i++)
	  {
		 if(arr[(int) i]!=arr1[(int) i])
		 {
			for(j=0;j<m;j++)
			{    if(am[(int) j][0]==am[(int) j][1])
			{
				continue;
			}
				if(arr1[(int) i]==am[(int) j][0]||arr1[(int) i]==am[(int) j][1])
				{
					flag[h] = 1;
					
					break;
				}
				else
					flag[h]=0;
				
				
			}
			h++;
		 }
	  }
	  for(j=0;j<n;j++)
	  {
		  if(flag[(int) j]==0)
			  System.out.println("impossible");
		  break;
	  }
	 if(j==n)
		 System.out.println("possible");
	  t--;
	  h=0;
		  
        }


}
   }





300
5
4
7
8
2
5
9
1
6
3
8
5
2
8
2
1
3
9
4
7
2
9
2
5
6
7
2
9
1
7
3
6
8
3
7
3
5
8
2
4
5
6
2
9
6
5
4
3
2
1
1
2
3
4
5
6
7
8
9
9
8
7
6
5
4
3
2
1
1
2
3
4
5
6
7
8
9
9
8
7
6
5
4
3
2
1
2
3
4
5
6
6
7
9
7
4
7
2
8
5
5
4
7
8
2
5
9
1
6
3
8
5
2
8
2
1
3
9
4
7
2
9
2
5
6
7
2
9
1
7
3
6
8
3
7
3
5
8
2
4
5
6
2
9
6
5
4
3
2
1
1
2
3
4
5
6
7
8
9
9
8
7
6
5
4
3
2
1
1
2
3
4
5
6
7
8
9
9
8
7
6
5
4
3
2
1
2
3
4
5
6
6
7
9
7
4
7
2
8
5
5
4
7
8
2
5
9
1
6
3
8
5
2
8
2
1
3
9
4
7
2
9
2
5
6
7
2
9
1
7
3
6
8
3
7
3
5
8
2
4
5
6
2
9
6
5
4
3
2
1
1
2
3
4
5
6
7
8
9
9
8
7
6
5
4
3
2
1
1
2
3
4
5
6
7
8
9
9
8
7
6
5
4
3
2
1
2
3
4
5
6
6
7
9
7
4
7
2
8
5


