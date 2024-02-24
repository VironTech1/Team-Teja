package exceptions;

import java.util.Scanner;

public class Main {

	private int factorial(int number) throws NegativeIntegerException {
		if (number <= 0) {
			throw new NegativeIntegerException("Entered number should be greater than zero");
		}

		int fact = 1;

		while (number > 0) {
			fact = fact * number;
			number = number - 1;
		}

		return fact;

	}

	public static void main(String[] args) {

		ExceptionClass e = new ExceptionClass();

		e.example(args[0], args[1]);

		Main obj = new Main();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to claculate its factorial: ");

		int n = sc.nextInt();

		try {
			System.out.println("The factorial is: " + obj.factorial(n));
		}

		catch (NegativeIntegerException nie) {
			System.out.println(nie);
		} finally {
			sc.close();
		}
	}
}
