import java.util.Scanner;
public class Maximum
{
    public static void main(String[] args)
    {
        Scanner maximum = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = maximum.nextInt();
        int b = maximum.nextInt();
        int c = maximum.nextInt();
        int maxnum = Math.max(Math.max(a, b), c);
        System.out.println("The maximum of three nums is:" +maxnum);
    }
}