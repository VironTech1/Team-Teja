import java.util.Scanner;
public class StudentMarks
{
 public static void main(String[] args)
 {
    Scanner student = new Scanner(System.in);
    System.out.println("Enter marks:");
    int marks = student.nextInt();
    if (marks >= 95)
    {
        System.out.println("Distinction");
    }
    else if(marks > 90 && marks < 95)
    {
        System.out.println("First Class");
    }
    else if(marks > 80 && marks <= 90)
    {
        System.out.println("Second class");
    }
    else
    {
        System.out.println("Third Class");
    }

 }
}