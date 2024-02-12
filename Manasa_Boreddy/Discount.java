import java.util.Scanner;
public class Discount
{
 public static void main(String[] args)
 {
    Scanner discount = new Scanner(System.in);
    System.out.println("Enter the original price:");
    double originalPrice = discount.nextInt();
    System.out.println("Enter the discount percentage:");
    double discountPercentage = discount.nextInt();
    double discountAmount = (discountPercentage / 100) * originalPrice;
    double discountedPrice = originalPrice - discountAmount;
    System.out.println("discountAmount" +discountAmount);
    System.out.println("discountPrice" +discountedPrice);
 }
}