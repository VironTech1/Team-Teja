package Assignment3;

import java.util.Scanner;

public class Factorial6 {

    public static void main(String[] args) {
        int i;
        int factorial =1;
       Scanner scn= new Scanner(System.in);
        System.out.println("Enter the number to find factorial:: ");
        int number = scn.nextInt();
        for(i=1;i<=number;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+number+" is ::: "+factorial);

    }
}
