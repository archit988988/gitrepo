import java.awt.List;
import java.util.*;



		public class ex {

			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
			     int n,m,k,i;
			     n= s.nextInt();
			     m= s.nextInt();
			     k=m;
			     char c[]= new char[m];
			    
			     int j[]= new int[ m];
			     int a[]= new int[ n];
			     int b[]= new int[ n];
			     for(i=0;i<n;i++)
			     {
			    	 a[ i]=s.nextInt();
			    	 b[ i]=a[ i];
			     }
                 for(i=0;i<m;i++)
                 {
                	 c[i]=s.next().charAt(0);
                	 j[i]=s.nextInt();
                 }
			     
			     
			     while(m>0)
			     {
			     c  = s.next().charAt(0);
			     str = s.next().charAt(0);
			     //System.out.println();
			     j=str-'0';
			    // System.out.println(j);
			     if(c[k-m]=='A')
			     {
			    	for(i=0;i<n;i++)
			    	{
			    		if((i-j[k-m])<0)
			    		{
			    			b[i]=a[(n+(i-j[k-m]))];
			    		}
			    		else
			    		{
			    			b[ i]=a[ (i-j[k-m])];
			    		}
			    	}
			     }
			     if(c[k-m]=='C')
			     {
			    	 for(i=0;i<n;i++)
				    	{
				    		if((i+j[k-m])>n-1)
				    		{
				    			b[ i]=a[ ((i+j[k-m])-n)];
				    		}
				    		else
				    		{
				    			b[i]=a[ (i+j[k-m])];
				    		}
				    	}
			     }
			     if(c[k-m]=='R')
			     {   
			    	 System.out.println(b[ (j[k-m]-1)]);
			     }
			     m--;
			     }
			     

			}

		}

	}

}
