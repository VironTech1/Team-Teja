package assigment3;
//7. Java Program to print reverse of a given number

import java.util.Scanner;

public class qus7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int n = scanner.nextInt();
        int reversed_num = 0;

        while (n!=0) {
            int key = n%10;
            reversed_num = reversed_num * 10 + key;
            n = n/10;
            
        }
        System.out.println("Reverse of " + n + " is: " + reversed_num);
    }

    
}
