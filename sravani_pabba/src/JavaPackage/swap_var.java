package JavaPackage;
import java.util.Scanner;

public class swap_var {
	public static void main(String args[]){
		int p,q,temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Before Swapping  variables are ");
		p = scanner.nextInt();
		q = scanner.nextInt();
		
	//	System.out.println("After Swapping variables are " +p, +q);
		temp = p;
		p = q ;
		q = temp;
		
		System.out.println("After Swapping  variables are " +p+"," +q);
		
	
		
	

}
}
