package programs.southen.com;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number to check armstrong");
		int number = scanner.nextInt();
		int temp =number;
		int r, sum = 0;
		
		
		while(number>0) {
			
			r = number%10;
			number /= 10;
			sum = sum + (r*r*r);
		}
		
		if(temp == sum) {
			System.out.println("it is armstrong");
		}
		else {
			System.out.println("it is not armstrong");
		}
	}

}
