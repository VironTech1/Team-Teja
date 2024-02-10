package programs.southen.com;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number to get fibanacci");
		int number = scanner.nextInt();
		
		int a =0;
		int b =1;
		
		for(int i =0; i<number; i++) {
		System.out.print(a+" ");
		int next = a+b;
		a = b;
		b = next;
		}
		

	}

}
