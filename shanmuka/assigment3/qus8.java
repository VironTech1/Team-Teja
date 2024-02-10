package assigment3;

import java.util.Scanner;

public class  qus8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome: ");
        int num = scanner.nextInt();
        int reverse = 0;
        int num_oper = num;

        while (num_oper != 0) {
            int digit = num_oper % 10;
            reverse = reverse * 10 + digit;
            num_oper = num_oper / 10;
        }
        if (num == reverse) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
