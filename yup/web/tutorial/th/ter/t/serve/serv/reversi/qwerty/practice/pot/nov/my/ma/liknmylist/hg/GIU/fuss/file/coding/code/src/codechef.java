import java.util.Scanner;


public class codechef {
   
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 int n,t,i,j,count=0;
	 t=s.nextInt();
	 while(t>0)
	 {
		count=0; 
	 
	 n = s.nextInt();
	 int rc[]= new int[n];
	 int cc[]=new int[n];
	 String str[]= new String[n];
	 
	
	 for( i = 0;i<n;i++)
	 {  rc[i]=0;
		cc[i]=0;
		
			str[i]=s.next();
		
	 }

	 for( i = n-1;i>=0;i--)
	 {   
		for( j=n-1;j>=0;j--)
		{
		
		  
			  
				  
		  {
			  if(str[i].charAt(j)=='.')
			  {   if(rc[j]==0&&cc[i]==0)
				count++;  
			 
			  else
				  rc[j]=1;
			      cc[i]=1;
		  }}
		}
	 }
	 System.out.println(count);
	 
	 
	 }
	}

}
