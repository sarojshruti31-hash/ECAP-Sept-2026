package day2;

import java.util.Scanner;

public class AdditionOfTwoAges {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first age:");
        int age1 = sc.nextInt();

        System.out.println("Enter second age:");
        int age2 = sc.nextInt();

        System.out.println("Addition of ages = " + (age1 + age2));

        sc.close();
    }
}