package StringAssignment;
import java.util.Scanner;

public class StringPalindrome { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a word: "); 
        String input = scanner.nextLine();

        if (isPalindrome(input)) { 
            System.out.println(input + " is a palindrome!"); 
        } else {
            System.out.println(input + " is not a palindrome."); 
        }
    }

    public static boolean isPalindrome(String str) { 
        String reversed = ""; 

        for (int i = str.length() - 1; i >= 0; i--) { 
            reversed += str.charAt(i); 
        }

        return str.equals(reversed); 
    }
}