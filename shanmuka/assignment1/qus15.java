import java.util.Scanner;
//15. Write a program to calculate Kb to MB and GB and vic versa

public class qus15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion direction:");
        System.out.println("1. Kilobytes to Megabytes and Gigabytes");
        System.out.println("2. Megabytes and Gigabytes to Kilobytes");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter storage size in kilobytes: ");
            double kilobytes = scanner.nextDouble();

            convertKilobytesToMegabytesAndGigabytes(kilobytes);
        } else if (choice == 2) {
            System.out.print("Enter storage size in megabytes: ");
            double megabytes = scanner.nextDouble();

            System.out.print("Enter storage size in gigabytes: ");
            double gigabytes = scanner.nextDouble();

            convertMegabytesAndGigabytesToKilobytes(megabytes, gigabytes);
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }

    }

    public static void convertKilobytesToMegabytesAndGigabytes(double kilobytes) {
        double megabytes = kilobytes / 1024.0;          // 1 megabyte = 1024 kilobytes
        double gigabytes = kilobytes / (1024.0 * 1024.0); // 1 gigabyte = 1024 megabytes

        System.out.println(kilobytes + " kilobytes is equal to " + megabytes + " megabytes and " + gigabytes + " gigabytes.");
    }

    public static void convertMegabytesAndGigabytesToKilobytes(double megabytes, double gigabytes) {
        double totalKilobytes = megabytes * 1024 + gigabytes * 1024 * 1024;

        System.out.println(megabytes + " megabytes and " + gigabytes + " gigabytes is equal to " + totalKilobytes + " kilobytes.");
    }
}
