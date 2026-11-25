package com.calculator;

import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

        	System.out.println("\n===== SIMPLE CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid choice! Enter a number.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using Calculator!");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            System.out.print("Enter first number: ");

            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input! Enter a number.");
                sc.next();
                System.out.print("Enter first number: ");
            }

            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");

            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input! Enter a number.");
                sc.next();
                System.out.print("Enter second number: ");
            }

            double num2 = sc.nextDouble();

            switch (choice) {

                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;

                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;

                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + divide(num1, num2));
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
            }
        }

        sc.close();
    }
}