package StringAssignment;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String inputString = scanner.nextLine();
        StringBuilder reversed = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i)); 
        }
        
        System.out.println("Reversed string: " + reversed.toString());
        
        scanner.close();
    }
}