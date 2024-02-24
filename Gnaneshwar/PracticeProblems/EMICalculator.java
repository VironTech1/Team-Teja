import java.util.Scanner;

public class EMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the loan tenure in years: ");
        int tenure = scanner.nextInt();

        System.out.print("Enter the annual interest rate: ");
        double interestRate = scanner.nextDouble();

        // Monthly interest rate
        double monthlyRate = interestRate / 1200;

        // Number of monthly payments
        int numberOfPayments = tenure * 12;

        // EMI calculation
        double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments))
                / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        System.out.printf("EMI for the loan: %.2f", emi);

        scanner.close();
    }
}
