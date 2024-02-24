package basic_programs;
import java.util.Scanner;

public class sumofnatural {
	public static void main(String[] args) {
		int p,result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		
		p = scanner.nextInt();
		result = (p * (p+1))/2;
		System.out.println("The sum of 10 Natural numbers are " + result);
	}
	

}
