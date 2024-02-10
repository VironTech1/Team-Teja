import java.util.Scanner;
//25. Wrtie a program to calculate Gold rate(rate for grm 5250, 10 grms=1 tula) in cluding stones(each stone rate: 1500). Calute the price by mix of gold and stones and making charges will be 10 -18 */

public class qus25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of gold in grams: ");
        double goldWeight = scanner.nextDouble();

        System.out.print("Enter the number of stones: ");
        int numberOfStones = scanner.nextInt();

        double goldRatePerGram = 5250;
        double stoneRatePerStone = 1500;
        double makingChargesPercentage = 10;

        double goldPrice = goldWeight * goldRatePerGram;
        double stonePrice = numberOfStones * stoneRatePerStone;
        double makingCharges = (goldPrice + stonePrice) * (makingChargesPercentage / 100);

        double totalPrice = goldPrice + stonePrice + makingCharges;

        System.out.println("Gold Price: Rs." + goldPrice);
        System.out.println("Stone Price: Rs." + stonePrice);
        System.out.println("Making Charges: Rs." + makingCharges);
        System.out.println("Total Price: Rs." + totalPrice);

    }
}
