import java.util.Scanner;
//13. Write a program to calculate Kilo grams into grams and vic versa
public class qus13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion direction:");
        System.out.println("1. Kilograms to Grams");
        System.out.println("2. Grams to Kilograms");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter weight in kilograms: ");
                double kilograms = scanner.nextDouble();

                convertKilogramsToGrams(kilograms);
                break;

            case 2:
                System.out.print("Enter weight in grams: ");
                double grams = scanner.nextDouble();

                convertGramsToKilograms(grams);
                break;

            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }

    }

    public static void convertKilogramsToGrams(double kilograms) {
        double grams = kilograms * 1000;  
        System.out.println(kilograms + " kilograms is equal to " + grams + " grams.");
    }

    public static void convertGramsToKilograms(double grams) {
        double kilograms = grams / 1000;  
        System.out.println(grams + " grams is equal to " + kilograms + " kilograms.");
    }
}
