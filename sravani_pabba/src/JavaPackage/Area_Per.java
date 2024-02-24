package JavaPackage;
import java.util.Scanner;

public class Area_Per {
	public static void main(String[] args) {
		double p,q,r;
		int l,w,a,b,c,s,d;
	
	
		double pi = 3.14;
		
		Scanner scanner = new Scanner(System.in);
    // Area and perm of circle
		
	    System.out.println("Enter the radius = ");
	    p = scanner.nextInt();
	    q = (pi * p * p);
	   
	    System.out.println("Area of the circle is  " + q);
	    
	 
	    r = (2 * pi * p);
	   
	    System.out.println("Perimeter of the circle is  " + r);
	    
	  // Area and perm of Rectangle
	    System.out.println("Enter the length and width = ");
	    l = scanner.nextInt();
	    w = scanner.nextInt();
	    a = l * w;
	    
	    System.out.println("Area of the rectangle is  " + a);
	    b= 2 * (l+ w);
	    System.out.println("Perimeter of the rectangle is  " + b);
	    
	 // Area and perm of Square
	    
	    System.out.println("Enter the value of the side = ");
	    s = scanner.nextInt();
	    
	    c = s * s;
	    System.out.println("Area of the square is  " + c);
	    d= 4 * s;
	    System.out.println("Perimeter of the square is  " + d);
	    
	    
		
	}

}
