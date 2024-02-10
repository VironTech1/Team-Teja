import java.util.Scanner;
public class Compare
{
    public static void main(String[] args)
    {
        Scanner comp = new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        int a = comp.nextInt();
        System.out.println("Enter the value for b: ");
        int b = comp.nextInt();
        if (a == b)
        {
            System.out.println(a+ "is equal to" +b);
        }
        else if (a < b)
        {
            System.out.println(a+ "is less than" +b);
        }
        else
        {
            System.out.println(a+ "is greater than" +b);
        }

    }
}
