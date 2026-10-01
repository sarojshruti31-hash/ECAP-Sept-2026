package day2;
import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your percentage");
		double percentage = sc.nextDouble();
		
		if(percentage >=75.0) {
			System.out.println("DIST");	
		}
		else if(percentage >= 60) {
			System.out.println("First Class");
		}
		else if(percentage >= 40) {
			System.out.println("Pass Class");
		}
		else {
			System.out.println("Not Pass");
		}
		System.out.println("Thankyou");
		sc.close();
	}

}
