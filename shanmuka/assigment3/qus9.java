package assigment3;
import java.util.Scanner;

public class qus9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check for Prime : ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println("The Given number is not a Prime number.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }

            if (isPrime) {
                System.out.println("The given number is a Prime number.");
            } else {
                System.out.println("The Given number is not a Prime number.");
            }
        }
    }
}
