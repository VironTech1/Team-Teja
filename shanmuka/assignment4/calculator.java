package assignment4;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Weight Conversion (Kg to lbs)");
            System.out.println("6. Distance Conversion (Miles to Km)");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

            performOperation(choice);
        }

        scanner.close();
    }

    public static void performOperation(int choice) {
        Scanner scanner = new Scanner(System.in);

        if (choice == 1) {
            performAddition(scanner);
        } else if (choice == 2) {
            performSubtraction(scanner);
        } else if (choice == 3) {
            performMultiplication(scanner);
        } else if (choice == 4) {
            performDivision(scanner);
        } else if (choice == 5) {
            performWeightConversion(scanner);
        } else if (choice == 6) {
            performDistanceConversion(scanner);
        } else {
            System.out.println("Invalid choice. Please enter a valid option.");
        }

        scanner.close();
    }

    public static void performAddition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.println("Result: " + sum);
    }

    public static void performSubtraction(Scanner scanner) {
        System.out.print("Enter minuend: ");
        double minuend = scanner.nextDouble();
        System.out.print("Enter subtrahend: ");
        double subtrahend = scanner.nextDouble();
        double difference = minuend - subtrahend;
        System.out.println("Result: " + difference);
    }

    public static void performMultiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double factor1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double factor2 = scanner.nextDouble();
        double product = factor1 * factor2;
        System.out.println("Result: " + product);
    }

    public static void performDivision(Scanner scanner) {
        System.out.print("Enter numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double denominator = scanner.nextDouble();
        if (denominator != 0) {
            double quotient = numerator / denominator;
            System.out.println("Result: " + quotient);
        } else {
            System.out.println("Error: Division by zero is undefined.");
        }
    }

    public static void performWeightConversion(Scanner scanner) {
        System.out.print("Enter weight in kilograms: ");
        double weightKg = scanner.nextDouble();
        double weightLbs = weightKg * 2.20462;
        System.out.println("Result: " + weightLbs + " pounds");
    }

    public static void performDistanceConversion(Scanner scanner) {
        System.out.print("Enter distance in miles: ");
        double distanceMiles = scanner.nextDouble();
        double distanceKm = distanceMiles * 1.60934;
        System.out.println("Result: " + distanceKm + " kilometers");
    }
}
