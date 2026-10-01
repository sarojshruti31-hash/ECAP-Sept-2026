package day2;

import java.util.Scanner;

public class AdditionTwoHeights {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height 1:");
        double height1 = sc.nextDouble();

        System.out.println("Enter height 2:");
        double height2 = sc.nextDouble();

        double totalHeight = height1 + height2;

        System.out.println("Total height = " + totalHeight);

        sc.close();
    }
}