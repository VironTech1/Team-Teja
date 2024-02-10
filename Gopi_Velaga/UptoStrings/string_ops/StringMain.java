package string_ops;

import java.io.IOException;
import java.io.PrintStream;

public class StringMain {
	
	public static void method(int i) {
		System.out.println("Int"+i);
	}
	
	public static void method(double i) {
		System.out.println(i);
	}
	
	public static void method(Integer i) {
		System.out.println(i);
	}

	public static void main(String[] args) throws IOException {
		
		method(10);
		
		PrintStream ps = new PrintStream(System.out);
		
		ps.println("Printing using the PrintStream object");
		
		StringOperations obj = new StringOperations();
		
//		System.out.println("Read ");
//		
//		int i = System.in.read();
//		
//		System.out.println("i : "+i);
		
		
		String str = "abcd";
		
		System.out.println(obj.reverse(str));
		
		String str1 = "abcba";
		
		System.out.println(obj.palindrome(str1) ? "Palindrome" : "Not a Palindrome");
		
		System.out.println(obj.search("Hello World","Hello") ? "Found" : "Not Found");
		
		String[] names = obj.splitNames("GopiChand Velaga");
		
		System.out.println("First Name: "+ names[0]);
		
		System.out.println("Last Name: "+ names[1]);
		
		System.out.println(obj.checkPassword("Gopi@1234") ? "Password is Strong" : "Password is not Strong");


	}

}
