package day2;
import java.util.Scanner;
public class NestedIfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);   
		
		System.out.println("1. English");        
		System.out.println("2. Hindi");
		System.out.println("3. Marathi");
		
		System.out.println("Enter Choice");
		int choice = sc.nextInt();
		
		
		if(choice==1)  
		{					  
			System.out.println("Call routed to London");   
		}
		else if(choice ==2)  
		{					  
			System.out.println("Call routed to Delhi");  
		}
		else if(choice==3)
		{					  
			System.out.println("Call routed to Mumbai");   
		}
		else
		{
			System.out.println("Invalid Input");
		}
		

		
		System.out.println("Have anice day ahead!!!");
		sc.close();
	}

}
