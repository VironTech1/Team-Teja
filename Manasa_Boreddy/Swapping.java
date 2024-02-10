import java.util.Scanner;
public class Swapping
{
    public static void main(String a[])
    {
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter the value of ab: ");
        int ab = temp.nextInt();
        System.out.println("Enter the value of cb: ");
        int cb = temp.nextInt();
        System.out.println("Before swapping: ab=" +ab+ ",cb = " +cb);
        int i = ab;
        ab = cb;
        cb = i;
        System.out.println("After swapping: ab=" +ab+ ",cb = " +cb);
    }
}