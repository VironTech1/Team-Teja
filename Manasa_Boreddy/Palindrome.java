import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args)
    {
        Scanner palindrome = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = palindrome.nextInt();
        int originalnum = n;
        int revnum = 0;
        while(n != 0)
        {
            int d = n%10;
            revnum = revnum*10 + d;
            n = n/10;
        }
        if (originalnum == revnum)
        {
        System.out.println(revnum+ " The given number is a palindrome");
        }
        else
        {
           System.out.println(revnum+ " The given number is not a palindrome");  
        }
    }
}