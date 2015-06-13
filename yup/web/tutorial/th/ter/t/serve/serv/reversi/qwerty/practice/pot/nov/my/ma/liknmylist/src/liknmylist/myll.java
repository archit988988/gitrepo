package liknmylist;

public class myll {
    node h ;
    node t;
    node r;
    public void add(int nd)
    {   node nn= new node(nd);
    	if(t==null)
    	{
    		h=nn;
    		t=nn;
    	}
    	else
    	{
    		t.next=nn;
    		t=nn;
    	}
    	r=h;
    }
   
    
    int count=0;
    public int find(int f)
    { // System.out.println(r.data);
    	while(r!=null)
    	{  count++;
    		if(r.data==f)
    		{
    			
    			break;
    		}
    	  r=r.next;	
    	}
    	if(r==null)
    		return 0;
    	else
    		return count;
    	
    }
    
    
}
