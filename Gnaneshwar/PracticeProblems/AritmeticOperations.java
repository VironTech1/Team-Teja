import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

    
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        
        double product = num1 * num2;
        System.out.println("Product: " + product);

        
        double difference = num1 - num2;
        System.out.println("Difference: " + difference);

        
        if (num2 != 0.0) {
            
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);

        
            double remainder = num1 % num2;
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

    
        scanner.close();
    }
}
