import java.util.Scanner;
public class OddEven
{
    public static void main(String[] args)
    {
        Scanner oddeven = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = oddeven.nextInt();
        if(n%2 == 0)
        {
            System.out.println("Given number is even");
        }
        else
        {
           System.out.println("Given number is odd"); 
        }
    }
}
