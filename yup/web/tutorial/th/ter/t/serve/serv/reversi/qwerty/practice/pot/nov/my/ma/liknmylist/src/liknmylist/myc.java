package liknmylist;

import java.util.Scanner;

public class myc {
    public static void search()
    {Scanner s = new Scanner(System.in);
	myll link = new myll();
    	System.out.println("enter the no. u want to search for");
		int f=s.nextInt();
		if(link.find(f)==0)
		{
			System.out.print("nahh!! this list dont have it");
		}
		else
			System.out.println("no. found at position :  "+link.find(f));
		
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		myll link = new myll();
		int d;
		char c='y';
		while(c=='y')
		{
		
		d=s.nextInt();
		System.out.println("want to enter more?: 'y' for yes : 'n' for no.");
		c=s.next().charAt(0);
		link.add(d);
		
		}
		System.out.println("list completed going to print it");
		while(link.h!=null)
		{
			System.out.println(link.h.data);
			link.h=link.h.next;
		}
		while(true)
		{
			System.out.println("want to search? press y else n");
			c=s.next().charAt(0);
			if(c=='y')
				search();
			else 
				break;
		}
		
		
		
	}

}
