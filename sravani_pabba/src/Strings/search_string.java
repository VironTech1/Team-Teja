package Strings;
import java.util.Scanner;

public class search_string {
	
	


	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the string to search ");
	        String str1 = scanner.nextLine();

	        System.out.print("Enter the substring which you want to find find: ");
	        String str2 = scanner.nextLine();

	        int index = str1.indexOf(str2);
	        
	        if (index != -1) {
	            System.out.println("Substring '" + str2 + "' found at index: " + index);
	        } else {
	            System.out.println("Substring '" + str2 + "' not found in the given string.");
	        }
	        
	   

	    }
	}


