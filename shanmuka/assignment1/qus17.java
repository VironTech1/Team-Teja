import java.util.Scanner;
//17. Write a program to calculate dicount of given price?

public class  qus17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        if (discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Invalid discount percentage. Please enter a percentage between 0 and 100.");
        } else {
            double discountAmount = originalPrice * (discountPercentage / 100);
            double discountedPrice = originalPrice - discountAmount;
            System.out.println("Discounted Price: $" + discountedPrice);
        }
    }
}
