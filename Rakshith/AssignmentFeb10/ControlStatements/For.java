package ControlStatements;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
//        for(int i=0; i<=5; i++){
//            System.out.println(" Jai Sree Ram ");
//        }
        System.out.println("Enter the Average marks ");
        int averageMarks= scanner.nextInt();
        int passMarks= 35;
        System.out.println("Enter the student secured marks");
        int studentMarks= scanner.nextInt();

        if (studentMarks > averageMarks ) {
            System.out.println("Student passed with Distinction ");
        }
        else if (studentMarks <= averageMarks && studentMarks > passMarks) {
            System.out.println("Student Passed with First Class");
        }else{
            if(studentMarks==passMarks){
                System.out.println("Student passed");
            }
            else {
                System.out.println("Student Failed");
            }
        }
    }
}
