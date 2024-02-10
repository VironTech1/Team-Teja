package assigment3;
//6.Java Program to factorial of a given number.

import java.util.Scanner;

public class qus6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Factorial of " + n + " is: " + result);

    }

    }