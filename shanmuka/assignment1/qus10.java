import java.util.Scanner;
//10.Write a program to calculate EMI for given loan amount(Ex: Amount : 1,00,000 Tenure : 5 yrs, intrerest : EmI for month :17,093 with 1 % interest  )

public class qus10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the loan tenure in years: ");
        int tenureInYears = scanner.nextInt();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        // Calculate EMI
        double monthlyInterestRate = (annualInterestRate / 12) / 100;

        // Convert tenure from years to months
        int numberOfPayments = tenureInYears * 12;

        // Calculate EMI using the formula
        double emi = (loanAmount * monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments))
                / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);


        // Print the EMI
        System.out.println("EMI for the loan: " + emi);

    }

}
