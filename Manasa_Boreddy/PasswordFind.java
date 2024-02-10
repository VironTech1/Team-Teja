package StringAssignment;
import java.util.Scanner;
public class PasswordFind {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        System.out.println("Password is: " +password);
        boolean capital = false;
        boolean special = false;
       for(int i=0; i<password.length(); i++)
        {
            char ch = password.charAt(i);
         if(ch>= 'A' && ch<= 'Z')
         {
           capital = true;
         }
         else if(ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '_' || ch == '+' || ch == '=' || ch == '[' || ch == ']' || ch == '{' || ch == '}' || ch == '|' || ch == ';' || ch == ':' || ch == '\'' || ch == ',' || ch == '.' || ch == '<' || ch == '>' || ch == '?' || ch == '/')
         {
            special = true;
         }
        }
        if( capital && special)
        {
            System.out.println("Strong password"); 
        }
        else{
            System.out.println("Weak password");
        }
    }
    
}
