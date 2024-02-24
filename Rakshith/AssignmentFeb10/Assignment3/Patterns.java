package Assignment3;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the value of n :: ");
        int n = scn.nextInt();
        for(int i=1; i<=5; i++){
            for (int j=1;j<=i;j++){

                    System.out.print(j);
            }
            System.out.println("");


        }
        System.out.println("To print stars ******");
        for(int i=1; i<=5; i++){
            for (int j=1;j<=i;j++){

                System.out.print("*");
            }
            System.out.println("");


        }
    }
}
