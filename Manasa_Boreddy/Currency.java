import java.util.Scanner;
public class Currency
{
    public static void main(String[] args)
    {
        Scanner curr = new Scanner(System.in);
        int usdtoinr = 83;
        int cadtoinr = 65;
        System.out.println("Enter in usd: ");
        int usd = curr.nextInt();
        System.out.println("Enter in cad: ");
        int cad = curr.nextInt();
        int usdtoinrconversion = usd * usdtoinr;
        int cadtoinrconversion = cad * cadtoinr;
        System.out.println("conversion from usdtoinr :" +usdtoinrconversion);
        System.out.println("conversion from usdtoinr :" +usdtoinrconversion);
    }
}