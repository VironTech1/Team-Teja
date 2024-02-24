package Assignment5;

import java.util.*;

public class FiveCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Weight Conversion (kg to lbs)");
            System.out.println("6. Distance Conversion (km to miles)");
            System.out.println("0. Exit");

            System.out.print("Enter your choice (0-6): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double result;

            switch (choice) {
                case 1:
                    result = addOperation();
                    break;
                case 2:
                    result = subtractOperation();
                    break;
                case 3:
                    result = multiplyOperation();
                    break;
                case 4:
                    result = divideOperation();
                    break;
                case 5:
                    result = weightConversion();
                    break;
                case 6:
                    result = distanceConversion();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    Scanner scanner = new Scanner(System.in);

    static double addOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    static double subtractOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    static double multiplyOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    static double divideOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            return dividend / divisor;
        } else {
            System.out.println("Cannot divide by zero. Returning 0.0");
            return 0.0;
        }
    }

    static double weightConversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        double weightInKg = scanner.nextDouble();
        return weightInKg * 2.20462;  // Conversion factor: 1 kg = 2.20462 lbs
    }

    static double distanceConversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double distanceInKm = scanner.nextDouble();
        return distanceInKm * 0.621371;  // Conversion factor: 1 km = 0.621371 miles
    }
}
