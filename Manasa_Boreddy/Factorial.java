import java.util.Scanner;
public class Factorial{
    public static void main(String[] args)
    {
        Scanner factorial = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = factorial.nextInt();
        double num = 1;
        for(int i=1; i<=n; i++)
        {
        num = num*i;
        }
        System.out.println("The factorial of " + n + " is " +num);
    }
}