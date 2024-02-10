import java.util.Scanner;
public class Square{
    public static void main(String[] args)
    {
        Scanner square = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = square.nextInt();
        int num = n*n;
        System.out.println("The square of " + n + " is " +num);
    }
}