package exceptions;

public class ExceptionClass {

//	Scanner sc = new Scanner(System.in);

	void example(String a, String b) {
		try {
			int num = Integer.parseInt(a);
			int div = Integer.parseInt(b);
			int res = num / div;
			System.out.println("The result of dividing 100 by " + div + " is:\n " + res);
			throw new NullPointerException("Just a test");
		} catch (Throwable e) {
			System.out.println("The Program is aborted with: " + e);
		} finally {
			System.out.println("Final Block");
		}
	}
}
