import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner fibonacci = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = fibonacci.nextInt();
        int ft = 0, st = 1;
        for(int i=0; i<=n; i++)
        {
            System.out.println(ft+ " ");
            int nt = ft+st;
            ft = st;
            st = nt;
        }
        
    }
}