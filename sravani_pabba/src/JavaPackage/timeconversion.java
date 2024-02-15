package JavaPackage;
import java.util.Scanner;

public class timeconversion {
	public static void main(String[] args) {
	int h,m,s;	
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number of hours");
	
	h = scanner.nextInt();
	
	//conversion
	m = h * 60;
	s = h * 3600;
	System.out.println("hours to minutes " +m);
	System.out.println("hours to seconds " +s);
	
	
	/* h = m/60;
	h = s/3600;
	System.out.println("hours to minutes " +m);
	System.out.println("hours to seconds " +s); */
	
	

}
}
