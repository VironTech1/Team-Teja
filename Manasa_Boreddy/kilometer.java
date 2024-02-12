import java.util.Scanner;
public class Kilometer
{
    public static void main(String[] args)
    {
        Scanner kilo = new Scanner(System.in);
        System.out.println("Enter in kilometers: ");
        double km = kilo.nextInt();
        double m = km*1000;
        double cm = m*100;
        double kms = m/1000;
        System.out.println("The length of kilometeres:" +km);
        System.out.println("length in meters:" +m);
        System.out.println("length in centimeters:" +cm);
        System.out.println("length in centimeters:" +kms);

    }
}