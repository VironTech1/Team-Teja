package programs.southen.com;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number to convert binary");
		int number = scanner.nextInt();
		
		String s = " ";
		
		while(number>0) {
			
			
			s= String.valueOf(number%2) + s;
			number /=2;
			
		}
		System.out.println(s);
		
	}

}
