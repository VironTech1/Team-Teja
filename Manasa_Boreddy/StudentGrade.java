
import java.util.Scanner;

public class StudentGrade
{
 Scanner scan = new Scanner(System.in);    
 public void studentdetails(){
 System.out.println("Details of a student");
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter the Id of student: ");
 int id = scan.nextInt();
 System.out.println("Enter the name of student: ");
 String name = scan.nextLine();
 scan.nextLine();
}
}

class course extends StudentGrade
{
    public void coursedetails(){
 System.out.println("Courses registered");
 System.out.println("Enter the first course taken: ");
 String firstCourse = scan.nextLine();
 System.out.println("Enter the second course taken: ");
 String secondCourse = scan.nextLine();
 System.out.println("Enter the third course taken: ");
 String thirdCourse = scan.nextLine();
}
}

class grade extends course{
    public void gradedetails(){
 System.out.println("Enter the grade point for first course: ");
float firstCourseGrade = scan.nextFloat();
 System.out.println("Enter the grade point for second course: ");
 float secondCourseGrade = scan.nextFloat();
 System.out.println("Enter the grade point for third course: ");
 float thirdCourseGrade = scan.nextFloat(); 
}
}
