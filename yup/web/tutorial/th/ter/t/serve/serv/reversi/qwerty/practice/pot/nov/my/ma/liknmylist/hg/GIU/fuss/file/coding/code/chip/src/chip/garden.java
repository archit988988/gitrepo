package chip;

import java.util.Scanner;

public class garden {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		   int t,n,m,i,j,sum=0,f1,f2,f3,f4,ff=0,l=1;
		   String str;
		   
		   t=s.nextInt();
		   while(t>0)
		   {
			   sum=0;
			   ff=0;
			   l=1;
			   n=s.nextInt();
			   m=s.nextInt();
			   
			   char a[][]=new char[n][m];
			   
			   for(i=0;i<n;i++)
			   {   str=s.next();
				   for(j=0;j<m;j++)
				   {
				   a[i][j]=str.charAt(j);
				   
				   }
	           }
			   
			   for(i=0;i<n;i++)
			   {
				   for(j=0;j<m;j++)
				   {
				     l=1;
				     f1=0;f2=0;f3=0;f4=0;ff=0;
				     while(ff==0)
				     {    f1=0;f2=0;f3=0;f4=0;
				    	 if(i-l>=0&&j-l>=0)
				    	 {
				    		 if(a[i][j-l]==a[i][j]&&a[i-l][j-l]==a[i][j]&&a[i-l][j]==a[i][j])
				    		 {
				    			 sum=sum+1;
				    			// System.out.println(sum+" "+l);
				    		 }
				    	 }
				    	 else
				    		 f1=1;
				    	 if(i-l>=0&&j+l<m)
				    	 {
				    		 if(a[i-l][j+l]==a[i][j]&&a[i][j+l]==a[i][j]&&a[i-l][j]==a[i][j])
				    		 {
				    			 sum=sum+1;
				    			 //System.out.println(sum+" "+l);
				    		 }
				    	 }
				    	 else
				    		 f2=1; 
				    	 if(i+l<n&&j+l<m)
					    	 {
					    		 if(a[i][j+l]==a[i][j]&&a[i+l][j+l]==a[i][j]&&a[i+l][j]==a[i][j])
					    		 {
					    			 sum=sum+1;
					    			// System.out.println(sum+" "+l);
					    		 }
					    	 }
					    	 else
					    		 f3=1; 
				    	 if(i+l<n&&j-l>=0)
						    	 {
						    		 if(a[i][j-l]==a[i][j]&&a[i+l][j-l]==a[i][j]&&a[i+l][j]==a[i][j])
						    		 {
						    			 sum=sum+1;
						    			// System.out.println(sum+" "+l);
						    		 }
						    	 }
						    	 else
						    		 f4=1;
				    	 if(f1==1&&f2==1&&f3==1&&f4==1)
				    	 {
				    		 ff=1;
				    	 }
				    	 l++;
				    	 
				    	 
				     }
				   }
	           }
			   
			   sum=sum/4;
			   System.out.println(sum);
			   
			   
            t--;
		   }
}
}