import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Calculate the average of the three numbers
        double average = (number1 + number2 + number3) / 3;

        // Print the result
        System.out.println("The average of the three numbers is: " + average);
    }
}
