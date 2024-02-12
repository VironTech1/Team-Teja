import java.util.Scanner;

public class  qus18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter average marks: ");
        double averageMarks = scanner.nextDouble();

        System.out.print("Grade: ");

        if (averageMarks >= 90) {
            System.out.println("Distinction");
        } else if (averageMarks >= 80) {
            System.out.println("First Class");
        } else if (averageMarks >= 70) {
            System.out.println("Second Class");
        } else if (averageMarks >= 60) {
            System.out.println("Third Class");
        } else {
            System.out.println("Fail");
        }

    }
}
