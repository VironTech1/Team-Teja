package Assignment3;

import java.util.Scanner;

public class Math45 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       /* System.out.println("Enter the table value:: ");
        int number = scn.nextInt();*/
        int num = 5;
        int start = 1;
        int end = 10;
        System.out.println("Mathematical table for the 5 ");
        while (start <= end) {
            System.out.println(num + " * " + start + " = " + num * start);
            start++;
        }
        System.out.println();
        System.out.println("******* To print 1-10 tables *********");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Table for " + i + " is ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }

    }
}
