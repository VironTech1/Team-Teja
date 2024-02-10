import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        System.out.println("Enter the value of b: ");
        System.out.println("Enter the value of c: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("Average of three numbers:" +avg);
    }
}