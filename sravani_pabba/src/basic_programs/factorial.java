package basic_programs;
import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int p,i,result=1;
		System.out.println("Give any number");
		p = scanner.nextInt();
		System.out.println("Factorial of a given number is ");
		  for (i=1;i<=p;i++)
		  {
			result = result * i;
		  }
		System.out.println(result);
	}

}
