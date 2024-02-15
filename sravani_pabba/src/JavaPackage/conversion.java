package JavaPackage;
import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
		int k,m,r;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the kilometres" );
		k = scanner.nextInt();

		//conversion
		m = 1000 * k;
		
		
		System.out.println(" kilometres to metres coversion is "  +m );
	    
		r = 100000 * k;
		
		System.out.println(" kilometres to centimetres coversion is "  +r );

}
}
