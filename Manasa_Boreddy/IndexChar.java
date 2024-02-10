package StringAssignment;
import java.util.Scanner;
public class IndexChar {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Given name: " +name);
        char find = 'a';
        boolean found = false;
        for(int i = 0; i<name.length(); i++)
        {
            if(find == name.charAt(i))
            {
                System.out.println("Found at: " +i);
                found = true;  
            }
        }
            if(!found)
            {
                System.out.println("Not found");
            }  
        }


    }

