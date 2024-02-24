package Strings;
import java.util.Scanner;

public class String_palindrome {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string ");
	        String str1 = scanner.nextLine();
	        String str2 = "";

	        for (int i = str1.length() - 1; i >= 0; i--) {
	            str2 = str2 + str1.charAt(i);
	        }
	        System.out.println("Reversed string: " + str2);

	        boolean flag = true;
	        for (int i = 0; i < str1.length(); i++) {
	            if (str1.charAt(i) != str2.charAt(i)) {
	                flag = false;
	                break;
	            }
	        }

	        if (flag) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }

	        
	    }
}

