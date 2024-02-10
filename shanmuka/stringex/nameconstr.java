package stringex;


import java.util.Scanner;

public class nameconstr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        String[] nameParts = fullName.split("\\s+");
        
        if (nameParts.length == 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[1];
            
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        } else {
            System.out.println("Invalid input. Please enter your full name in the correct format.");
        }
        
        scanner.close();
    }
}

