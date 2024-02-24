package MethodOverloading;
import java.util.Scanner;



class sum
{
	
	public int sum(int a, int b)
	{
	return a + b;
	}
}


public class calculator 
{
	
	public static void main(String[] args ) 
	{
		sum s =new sum();
		Scanner scanner = new Scanner(System.in);
		
		int a,b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		
		
		int result = s.sum(a, b);
		
		System.out.println(result);
		
	}

}
