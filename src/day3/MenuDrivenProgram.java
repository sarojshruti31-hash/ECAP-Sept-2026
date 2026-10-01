package day3;

import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        int choice;

        do {
            System.out.println("\n******* MENU *******");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            double result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    if (num2 != 0) {
                        result = (double) num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Input");
            }

        } while (choice != 5);

        sc.close();
    }
}