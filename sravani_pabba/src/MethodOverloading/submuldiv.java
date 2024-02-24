package MethodOverloading;
import java.util.Scanner;

class calculation
{
	int sub(int a , int b) {
		return a - b;
	}
	
	int mul(int a , int b) {
		return a * b;
	}
	
	int div(int a , int b) {
		return a / b;
	}
}


public class submuldiv {
	
	public static void main(String[] args)
	{
		calculation c = new calculation();
	    Scanner scanner = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the values of a and b");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		int result = c.sub(a, b);
		System.out.println(result);
		
	}

}
