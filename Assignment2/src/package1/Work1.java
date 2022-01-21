package package1;
import java.util.*;

public class Work1 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		double distance, amount;
		
		System.out.println("-------Welcome to Ola-------");
		
		System.out.println();
		
		System.out.print("Enter distance(in km) from your pickup location to destination : ");
		distance=sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Bike : Base fare = Rs19 | Rate per km = Rs7");
		System.out.println("Auto : Base fare = Rs26 | Rate per km = Rs10");
		System.out.println("Mini : Base fare = Rs60 | Rate per km = Rs16");
		System.out.println("Prime sedan : Base fare = Rs60 | Rate per km = Rs18");
		System.out.print("Enter you choice : ");
		String choice=sc.next();
		
		switch(choice) 
		{
			case "Bike": 
				amount=distance*7+19;
				System.out.println("Amount to pay : Rs"+amount);
				break;
			case "Auto": 
				amount=distance*10+26;
				System.out.println("Amount to pay : Rs"+amount);
				break;
			case "Mini":
				amount=distance*16+60;
				System.out.println("Amount to pay : Rs"+amount);
				break;
			case "Prime Sedan":
				amount=distance*18+60;
				break;
			default: 
				System.out.println("Wrong choice. Please choose one of them: ");
				System.out.println("Bike");
				System.out.println("Auto");
				System.out.println("Mini");
				System.out.println("Prime sedan");
			
		}
		sc.close();
	}
}
