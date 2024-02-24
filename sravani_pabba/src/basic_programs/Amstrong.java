package basic_programs;
import java.util.Scanner;

public class Amstrong {
	

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a number ");

	        
	        int number = scanner.nextInt();
	        
	        int originalNumber = number;
	        int numberOfDigits = 0;
	        int temp = number;
	        while (temp != 0) {
	            temp /= 10;
	            numberOfDigits++;
	        }
	        
	        int sum = 0;
	        while (number != 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, numberOfDigits);
	            number /= 10;
	        }

	        if (originalNumber == sum) {
	            System.out.println(originalNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNumber + " is not an Armstrong number.");
	        }

		}



}
	
