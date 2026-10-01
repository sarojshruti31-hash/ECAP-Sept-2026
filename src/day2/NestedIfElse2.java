package day2;
import java.util.Scanner;

	public class NestedIfElse2 {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();

	        if (age >= 18) {

	            if (age >= 21) {
	                System.out.println("You are an adult and age is 21 or above.");
	            } else {
	                System.out.println("You are an adult but below 21.");
	            }

	        } else {
	            System.out.println("You are a minor.");
	        }

	        sc.close();
	    }
	}

