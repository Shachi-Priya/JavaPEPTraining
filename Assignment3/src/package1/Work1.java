package package1;
import java.util.*;

public class Work1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int guests;
		System.out.print("Enter number of guests are coming in this party : ");
		guests=sc.nextInt();
		String[] arrGuests=new String[guests];
		
		System.out.println("Enter name of the Guests :");
		for(int i=0;i<guests;i++)
		{
			arrGuests[i]=sc.next();
		}
		
		System.out.println();
		System.out.println("Today's host is Shachi\n");
		System.out.println("-----Party started-----\n");
		
		Hello:
	         for (int i = 0; i <guests ; i++) 
	         {
	        	 if(arrGuests[i].equals("Shachi"))
	        		 continue Hello;    
	             System.out.println("Hello "+arrGuests[i]);
	         }
		
		System.out.println();
		System.out.println("-----Party closed-----\n");
		
        GoodBye:
        	 for (int i = 0; i <guests ; i++) 
	         {
	        	 if(arrGuests[i].equals("Shachi"))
	        		 break GoodBye;    
	             System.out.println("GoodBye "+arrGuests[i]);
	         }

	}

}
