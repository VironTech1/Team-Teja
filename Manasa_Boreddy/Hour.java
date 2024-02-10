import java.util.Scanner;
public class Hour
{
    public static void main(String[] args)
    {
        Scanner minu = new Scanner(System.in);
        System.out.println("Enter in hours: ");
        double Hr = minu.nextInt();
        double m = Hr*60;
        double sec = m*60;
        double hrs = m/60;
        System.out.println("The no of Hours :" +Hr);
        System.out.println("no of minutes:" +m);
        System.out.println("no of seconds:" +sec);
        System.out.println("no of hours:" +hrs);

    }
}