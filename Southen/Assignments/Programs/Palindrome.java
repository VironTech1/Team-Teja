package programs.southen.com;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number to get check palindrome or not");
		int number = scanner.nextInt();
		int reverseNumber = 0;
		int original = number;
		
		
		while(number>0) {
			
			reverseNumber = reverseNumber*10 + number%10;
			number /= 10;
			
			
		}
		
		if(original == reverseNumber) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
