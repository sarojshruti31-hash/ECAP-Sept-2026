package day2;

import java.util.Scanner;

public class AddHeightOfTwoPeople {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age of person 1:");
        int age1 = sc.nextInt();

        System.out.println("Enter age of person 2:");
        int age2 = sc.nextInt();

        int total = age1 + age2;

        System.out.println("Total age = " + total);

        sc.close();
    }
}