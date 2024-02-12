import java.util.Scanner;
public class Minimum
{
    public static void main(String[] args)
    {
        Scanner minimum = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = minimum.nextInt();
        int b = minimum.nextInt();
        int c = minimum.nextInt();
        int minnum = Math.min(Math.min(a, b), c);
        System.out.println("The minimum of three nums is:" +minnum);
    }
}