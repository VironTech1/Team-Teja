package StringAssignment;
import java.util.Scanner;

public class NameFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        String[] firstlast = name.split("\\s+");
        
        if (firstlast.length == 2) {
            String firstName = firstlast[0];
            String lastName = firstlast[1];
            
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        } else {
            System.out.println("Invalid input");
        }
        
        scanner.close();
        }
}