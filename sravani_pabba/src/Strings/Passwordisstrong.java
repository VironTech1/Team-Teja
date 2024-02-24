package Strings;
import java.util.Scanner;

public class Passwordisstrong {




    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password ");
        String password = scanner.nextLine();
        System.out.println("Password is " +password);
        boolean caps = false;
        boolean special = false;
        
       for(int i=0; i<password.length(); i++)
        {
    	   char ch = password.charAt(i);
    	   if (ch >= 33 && ch <= 47 || ch >= 58 && ch <= 64 || ch >= 91 && ch <= 96 || ch >= 123 && ch <= 126) {
    	        special = true;
    	    } else if (ch >= 65 && ch <= 90) {
    	        caps = true;
    	    }
        }
        if( caps && special)
        {
            System.out.println("Strong password"); 
        }
        else
        {
            System.out.println("Weak password");
        }
        
        
    }
    
}

