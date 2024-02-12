import java.util.Scanner;
public class Gold
{
    public static void main(String[] args)
    {
        Scanner gold = new Scanner(System.in);
        int rateOfGold = 5250;
        int eachStone = 1500;
        int makingCharges = 15;
        System.out.println("Enter the grams of gold chain: ");
        int grams = gold.nextInt();
        System.out.println("Enter the no of stones in chain: ");
        int stones = gold.nextInt();
        double price = (grams*rateOfGold) + (stones*eachStone) + makingCharges;
        System.out.println("The price of gold chain:" +price);

    }
}