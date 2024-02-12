import java.util.Scanner;
//12. Write a program to calculate Hours to minutes & seconds and vic versa.

public class qus12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion direction:");
        System.out.println("1. Hours to Minutes and Seconds");
        System.out.println("2. Minutes and Seconds to Hours");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter time in hours: ");
                double hours = scanner.nextDouble();

                convertHoursToMinutesAndSeconds(hours);
                break;

            case 2:
                System.out.print("Enter time in minutes: ");
                double minutes = scanner.nextDouble();

                System.out.print("Enter remaining time in seconds: ");
                double seconds = scanner.nextDouble();

                convertMinutesAndSecondsToHours(minutes, seconds);
                break;

            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }

    }

    public static void convertHoursToMinutesAndSeconds(double hours) {
        int totalMinutes = (int) (hours * 60);  
        int remainingMinutes = totalMinutes % 60;
        int totalSeconds = remainingMinutes * 60;

        System.out.println(hours + " hours is equal to " + totalMinutes + " minutes and " + totalSeconds + " seconds.");
    }

    public static void convertMinutesAndSecondsToHours(double minutes, double seconds) {
        double totalMinutes = minutes + seconds / 60;  
        double hours = totalMinutes / 60;  

        System.out.println(minutes + " minutes and " + seconds + " seconds is equal to " + hours + " hours.");
    }
}
