package day2;
import java.util.Scanner;
public class CheckAdultMinor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Minor");
		}
		System.out.println("Thankyou");
		sc.close();
		
	}

}
