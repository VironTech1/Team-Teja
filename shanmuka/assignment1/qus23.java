import java.util.Scanner;

public class qus23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println(number + " is a multiple of 5.");
        } else {
            System.out.println(number + " is not a multiple of 5.");
        }
    }
}
