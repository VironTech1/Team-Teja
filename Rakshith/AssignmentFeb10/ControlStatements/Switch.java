package ControlStatements;

import java.util.Scanner;

public class Switch {



    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the value1 ::");
        int value1= scanner.nextInt();
        System.out.println("Enter the value2 ::");
        int value2= scanner.nextInt();

        System.out.println("Enter the option::: ");
        int option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("Addition ::"+ (value1+value2));
                break;
            case 2:
                System.out.println("Subtraction ::"+ (value1-value2));
                break;
            case 3:
                System.out.println("multiplication ::"+ (value1*value2));
                break;
            default:
                System.out.println("happy java");
        }
    }
}
