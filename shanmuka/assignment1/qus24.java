import java.util.Scanner;

public class qus24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double square = number * number;
        System.out.println("The square of " + number + " is: " + square);

    }
}
