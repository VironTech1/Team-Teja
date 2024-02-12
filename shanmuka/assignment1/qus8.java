import java.util.Scanner;
//8. Write a Java program to swap two variables.

public class qus8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of the first variable: ");
        int first_Variable = scanner.nextInt();

        System.out.print("Enter the value of the second variable: ");
        int second_Variable = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First Variable: " + first_Variable);
        System.out.println("Second Variable: " + second_Variable);


        int temp = first_Variable;
        first_Variable = second_Variable;
        second_Variable = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("First Variable: " + first_Variable);
        System.out.println("Second Variable: " + second_Variable);

    }

}
