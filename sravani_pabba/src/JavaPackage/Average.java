package JavaPackage;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		int p,q,r;
		float s;
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		p = scanner.nextInt();
		q = scanner.nextInt();
		r = scanner.nextInt();
		
		s = (p + q + r)/3;
		System.out.println("Average of the numbers is " +s);
		
		
	}

}
