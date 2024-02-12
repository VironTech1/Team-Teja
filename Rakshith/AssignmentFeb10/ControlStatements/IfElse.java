package ControlStatements;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Class Time");
        double classTime= scanner.nextDouble();
        System.out.println("Enter the Class End time");
        double classEnd = scanner.nextDouble();

        if(classTime >= 9.00 && classTime < 17.00){
            System.out.println("This is the Class Timings **********");
        } else if(classEnd > 17.00)  {
            System.out.println("Class completed long back");
        }else{
            System.out.println("Enjoy your holiday");
        }

    }
}
