package assigment3;

import java.util.Scanner;

//Java Program to Calculate the Sum of first 10 Natural Numbers

public class qus2 {
    public static void main(String[] args) {
        int sum1 = Sum(10);
        System.out.println("Sum : "+sum1);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();
        int sum = Sum(n);
        System.out.println("Sum : "+sum);
    }
    public static int Sum(int n ) {
        return n * (n+1)/2;
    }

    
}
