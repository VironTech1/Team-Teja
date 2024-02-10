package assigment3;
//11. Java Program to find armstrong number
import java.util.Scanner;

public class qus11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check for Armstrong: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    public static boolean isArmstrong(int n) {
        int originalNumber, remainder, result = 0, nDigits = 0;

        originalNumber = n;

        while (originalNumber != 0) {
            originalNumber /= 10;
            ++nDigits;
        }

        originalNumber = n;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, nDigits);
            originalNumber /= 10;
        }
        return result == n;
    }
}

//153 is an armstrong number.