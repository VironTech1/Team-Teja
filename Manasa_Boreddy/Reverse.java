import java.util.Scanner;
public class Reverse{
    public static void main(String[] args)
    {
        Scanner reverse = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = reverse.nextInt();
        double revnum = 0;
        while(n != 0)
        {
            int d = n%10;
            revnum = revnum*10 + d;
            n = n/10;
        }
        System.out.println("The reverse no is " +revnum);
    }
}