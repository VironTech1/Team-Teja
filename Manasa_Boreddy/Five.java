import java.util.Scanner;
public class Five
{
    public static void main(String[] args)
    {
        Scanner five = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = five.nextInt();
        if(n%5 == 0)
        {
            System.out.println("Multiplied by Five");
        }
        else
        {
           System.out.println("Not multiplied by Five"); 
        }
    }
}