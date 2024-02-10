import java.util.Scanner;
public class Kilobyte
{
    public static void main(String[] args)
    {
        Scanner kilo = new Scanner(System.in);
        System.out.println("Enter in kb: ");
        double kb = kilo.nextInt();
        double mb = kb/1024;
        System.out.println("conversion from mb to kb :" +mb);
        System.out.println("Enter in megabyte: ");
        double megabyte = kilo.nextInt();
        double kilobyte = megabyte*1024;
        double gigabyte = megabyte/1024;
        System.out.println("conversion from mb to kb :" +kilobyte);
        System.out.println("conversion from mb to kb :" +gigabyte);
        

     


    }
}