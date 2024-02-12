package assigment3;
//12. Java Program to print Fibonacci series

import java.util.Scanner;

public class qus12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int num = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println("Fibonacci series up to " + num + " terms:");
    }

    
}
