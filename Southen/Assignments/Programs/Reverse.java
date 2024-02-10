package programs.southen.com;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number to get factorial");
		int number = scanner.nextInt();
		int reverseNumber = 0;
		
		
		while(number>0) {
			
			reverseNumber = reverseNumber*10 + number%10;
			number /= 10;
			
			
		}
		System.out.println("the reversof an number is " + reverseNumber);

	}

}
