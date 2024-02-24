package Assignment3;

import java.util.Scanner;

public class Palindrome8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome ");
        int number = scn.nextInt();
        System.out.println("Given number is :: " + number);

        int reverse = 0;
        int numberD = number;

        while (numberD != 0) {
            {

                int remainder = numberD % 10; // gives remainder
                reverse = reverse * 10 + remainder; //
                numberD = numberD / 10; // gives quotient

            }
        }
        System.out.println("Number after reversing is :: " + reverse);

        if (reverse == number) {
            System.out.println("Given number1 is palindrome:");

        } else {
            System.out.println("Number is not palindrome:");
        }


    }

}
