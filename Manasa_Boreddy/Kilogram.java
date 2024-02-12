import java.util.Scanner;
public class Kilogram
{
    public static void main(String[] args)
    {
        Scanner kilo = new Scanner(System.in);
        System.out.println("Enter in kilograms: ");
        double kl = kilo.nextInt();
        double grams = kl*1000;
        double kls = grams/1000;
        System.out.println("kilograms :" +kl);
        System.out.println("no of grams:" +grams);
        System.out.println("no of kilograms:" +kls);

    }
}