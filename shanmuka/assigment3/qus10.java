package assigment3;
//10. Java Program to print prime numbers between 1-100
import java.util.Scanner;

public class qus10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.println("Enter the last number: ");
        int last = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + last + ":");
        
        for (int num = start; num <= last; num++) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
