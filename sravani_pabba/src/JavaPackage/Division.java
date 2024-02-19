package JavaPackage;
import java.util.Scanner;

public class Division {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number :");
		int p = scanner.nextInt();
		System.out.println("enter the second number :");
		float q = scanner.nextInt();
		if(q!=0) {
			
			float s = p/q;

		
		System.out.println("Division of two numbers = " + s );
		}
		else {
			
			System.out.println("Division by zero is infinity");
		}
	}

}
