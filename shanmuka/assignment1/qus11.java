import java.util.Scanner;
//11. Write a program to calculate kilo meters to meters and cm and vic versa

public class qus11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion direction:");
        System.out.println("1. Kilometers to Meters and Centimeters");
        System.out.println("2. Meters and Centimeters to Kilometers");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter distance in kilometers: ");
                double kilometers = scanner.nextDouble();

                double meters = kilometers * 1000; 
                double remainingMeters = meters % 1000;
                double centimeters = remainingMeters * 100;
        
                System.out.println(kilometers + " kilometers is equal to " + (int) meters + " meters and " + (int) centimeters + " centimeters.");                break;

            case 2:
                System.out.print("Enter distance in meters: ");
                double meter_s = scanner.nextDouble();

                System.out.print("Enter remaining distance in centimeters: ");
                double centimeter_s = scanner.nextDouble();

                double totalMeters = meter_s + centimeter_s;  
                System.out.println(""+totalMeters);
                double kilometer_s = totalMeters / 1000;  
        
                System.out.println(meter_s + " meters and " + centimeter_s + " centimeters is equal to " + kilometer_s + " kilometers.");            
                break;

            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }


}
