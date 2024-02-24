package programs.southen.com;

import java.util.Scanner;

public class Prime2 {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("prime numbers from 1-100 are");
	
	
	for(int i=2; i<=100; i++) {
	if(isPrime(i)) {
		System.out.print(i + " ");
	}
}

}
	
	public static boolean isPrime(int number) {
		
		if(number<=1) {
			return false;
		}
		
		for(int i=2; i<Math.sqrt(number); i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}

}