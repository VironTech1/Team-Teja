//package assignment1;
//4.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers?

import java.util.Scanner;

public class qus4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first_number = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double second_number = scanner.nextDouble();

        double sum = first_number + second_number;
        double product = first_number * second_number;
        double difference = first_number - second_number;
        if (second_number != 0) {
            double quotient = first_number / second_number;
            double remainder = first_number % second_number;

            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Difference: " + difference);
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }

        scanner.close(); 
    }
}
