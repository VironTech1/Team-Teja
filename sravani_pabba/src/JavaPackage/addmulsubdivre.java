package JavaPackage;
import java.util.Scanner;

public class addmulsubdivre {
	
	public static void main(String[] args){
		int p,q,r,s,t,u,v;
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Enter the first number");
		 p = scanner.nextInt();
		 System.out.println("Enter the second number");
		 q = scanner.nextInt(); 
		 r = p + q;
		 System.out.println("Sum = " + r);
		 
		 System.out.println("\nEnter the first number");
		 p = scanner.nextInt();
		 System.out.println("Enter the second number");
		 q = scanner.nextInt();
		 s = p * q ;
		 System.out.println("Multiplication = " + s);
		 
		 
		 System.out.println("\nEnter the first number");
		 p = scanner.nextInt();
		 System.out.println("Enter the second number");
		 q = scanner.nextInt();
		 t = p - q ;
		 System.out.println("Subtraction = " + t);
		 
		 System.out.println("\nEnter the first number");
		 p = scanner.nextInt();
		 System.out.println("Enter the second number");
		 q = scanner.nextInt();
		 if(q!=0) {
		 u = p / q ;
		 System.out.println("Division = " + u);
		          }
		 else {
			 System.out.println("Division by zero is infinity");
			 
		      }
		 
		 
		 System.out.println("Enter the first number");
		 p = scanner.nextInt();
		 System.out.println("Enter the second number");
		 q = scanner.nextInt(); 
		 v = p % q;
		 System.out.println("Remainder = " + v);
		 
		 
		 
		 
	
	}

}
