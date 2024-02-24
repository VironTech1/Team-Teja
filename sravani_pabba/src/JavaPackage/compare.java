package JavaPackage;
import java.util.Scanner;

public class compare {
	public static void main(String args[]){
		int p,q;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers");
		p = scanner.nextInt();
		q = scanner.nextInt();
		//System.out.println("Enter the numbers" +p+"," +q);
		if(p>q)
		{
			System.out.println(p + " is greater than" + q);
		}
		if(p==q)
		{
			System.out.println(p + "is equal to" + q);
		}
		if(p<q)
		{
			System.out.println(p + "is less than" + q);
		}
			
		
		
	}
}
