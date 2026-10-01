package day2;
import java.util.Scanner;

public class IFConditionDemo {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your percentage");
		double percentage = sc.nextDouble();
		
		if(percentage>=40) {
			System.out.println("pass");
		}
		else {
			System.out.println("not pass");
		}
		
		System.out.println("Thankyou");
		sc.close();
		
	}
}