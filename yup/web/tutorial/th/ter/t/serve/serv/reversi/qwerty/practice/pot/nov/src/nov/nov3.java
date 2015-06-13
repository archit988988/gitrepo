package nov;

import java.util.Scanner;

public class nov3 {

	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int t,n,m=0,i,r,le;
      t=s.nextInt();
      
      String str;
      while(t>0)
      {   t--;
    	  m=0;
          int flag=0;
          int f1=0,f2=0;
    	  str = s.next();
    	  int l=str.length();
    	  for(i=0;i<l/2;i++)
    	  {
    		  if(str.charAt(i)==str.charAt(l-1-i))
    		  {
    			  m++;
    		  }
    		  else
    			  break;
    	  }
    	  if(i==l/2)
    	  {
    		  System.out.println("YES");
    		  continue;
    	  }
    	  
    	  if(str.charAt(m)==str.charAt(l-2-m))
    		  le=0;
    	  else
    		  le=1;
    	  if(str.charAt(m+1)==str.charAt(l-1-m))
    		  r=0;
    	  else
    		  r=1;
    	  if(le==1&&r==1)
    	  {
    		  System.out.println("NO");
    		  continue;
    	  }
    	  if(le==0&&r==1)
    	  {
    		  for(i=m;i<l-1-m;i++)
    		  {
    			  if(str.charAt(i)!=str.charAt(l-2-i))
    			  {
    				  flag=1;
    				  break;
    			  }
    		  }
    		  if(flag==1)
    			  System.out.println("NO");
    		  else
    			  System.out.println("YES");
    		  
    	  }
    	  if(le==1&&r==0)
    	  {
    		  for(i=m+1;i<l-m;i++)
    		  {
    			  if(str.charAt(i)!=str.charAt(l-i))
    			  {
    				  flag=1;
    				  break;
    			  }
    		  }
    		 
    		  if(flag==1)
    			  System.out.println("NO");
    		  else
    			  System.out.println("YES");
    		  
    	  }
    	  if(le==0&&r==0)
    	  {
    		  for(i=m+1;i<l-m;i++)
    		  {
    			  if(str.charAt(i)!=str.charAt(l-i))
    			  {
    				  f1=1;
    				  break;
    			  }
    		  }
    		  for(i=m;i<l-1-m;i++)
    		  {
    			  if(str.charAt(i)!=str.charAt(l-2-i))
    			  {
    				  f2=1;
    				  break;
    			  }
    		  }
    		  if(f1==1&&f2==1)
    			  System.out.println("NO");
    		  else
    			  System.out.println("YES");
    		  
    	  }
    	  
      }

	}

}
