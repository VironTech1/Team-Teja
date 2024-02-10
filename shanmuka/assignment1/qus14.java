import java.util.Scanner;
//14. Write a program to calculate Currency for diiferent countries.


public class qus14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Choose the conversion direction
        System.out.println("Choose conversion direction:");
        System.out.println("1. USD to EUR");
        System.out.println("2. EUR to USD");
        System.out.println("3. USD to INR");
        System.out.println("4. INR to USD");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

                System.out.print("Enter amount in USD: ");
                double usdAmount = scanner.nextDouble();

               //(assuming 1 USD = 0.85 EUR)
                convertUSDtoEUR(usdAmount);
                break;

            case 2:
                System.out.print("Enter amount in EUR: ");
                double eurAmount = scanner.nextDouble();

                //(assuming 1 USD = 0.85 EUR)
                convertEURtoUSD(eurAmount);
                break;

            case 3:
                System.out.print("Enter amount in USD: ");
                double usdAmount2 = scanner.nextDouble();

                //  (assuming 1 USD = 75 INR)
                convertUSDtoINR(usdAmount2);
                break;

            case 4:
             
                System.out.print("Enter amount in INR: ");
                double inrAmount = scanner.nextDouble();

                //  (assuming 1 USD = 75 INR)
                convertINRtoUSD(inrAmount);
                break;

            default:
                System.out.println("Invalid choice. Please choose 1, 2, 3, or 4.");
        }

    }

    public static void convertUSDtoEUR(double usdAmount) {
        double eurAmount = usdAmount * 0.85;  //  1 USD = 0.85 EUR
        System.out.println(usdAmount + " USD is equal to " + eurAmount + " EUR.");
    }

    public static void convertEURtoUSD(double eurAmount) {
        double usdAmount = eurAmount / 0.85;  //  1 USD = 0.85 EUR
        System.out.println(eurAmount + " EUR is equal to " + usdAmount + " USD.");
    }

    public static void convertUSDtoINR(double usdAmount) {
        double inrAmount = usdAmount * 75;  //  1 USD = 75 INR
        System.out.println(usdAmount + " USD is equal to " + inrAmount + " INR.");
    }

    public static void convertINRtoUSD(double inrAmount) {
        double usdAmount = inrAmount / 75;  //  1 USD = 75 INR
        System.out.println(inrAmount + " INR is equal to " + usdAmount + " USD.");
    }
}
