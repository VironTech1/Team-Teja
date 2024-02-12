package StringAssignment;
import java.util.Scanner;

public class StringinString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String name = scanner.nextLine();

        System.out.print("Enter other string: ");
        String other = scanner.nextLine();

        int index = name.indexOf(other);
        
        if (index != -1) {
            System.out.println( other+ " found at index: " + index);
        } else {
            System.out.println(other + " not found in the given string.");
        }
        
        scanner.close();
    }
}