package Assignment3;

import java.util.Scanner;

public class ReverseNum7 {
    public static void main(String[] args) {
       // Java Program to print reverse of a given number
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the number to reverse ");
        int number = scn.nextInt();
        int reverse=0;
        while (number!=0){
            {
                int remainder = number % 10; // gives remainder
                reverse = reverse * 10 + remainder;
                number = number/10; // gives quotient

            }

        }
        System.out.println("Number after reversing is :: "+reverse);
    }
}
