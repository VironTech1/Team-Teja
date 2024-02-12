package Assignment1;

import java.util.Scanner;

public class Test {
    Test(int i ){

    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Test test2= new Test(6);
        System.out.println("::To calculate total price of the ornaments::");
        System.out.println("Enter the gold used in grams::");
        double goldInGrams = scanner.nextDouble();
        System.out.println("Enter the no of stones used :: ");
        double noOfStones = scanner.nextDouble();
        double makingCharges = 15;
        double totalGoldRate = (goldInGrams * 5250) + (noOfStones * 1500) + makingCharges;
        System.out.println("Total price of the Gold :: " + totalGoldRate);


    }
}
