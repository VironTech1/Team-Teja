package string_ops;

import java.lang.Math;

public class Sample {
	
	
	static void mathProblems() {
		
		System.out.println(Math.PI);
		
		System.out.println(Math.abs(-3.144567));
		
		System.out.println(Math.sqrt(100));
		
	}
	
	

	public static void main(String[] args) {
		
		mathProblems();
		
		StringBuilder sb = new StringBuilder("Hello");

		System.out.println("Object: " + sb);

		sb.append("Hello");

		sb.append(" ");

		sb.append("World");

		System.out.println(sb);

		StringBuffer buff = new StringBuffer("Hello");

		System.out.println("Object: " + buff);

		buff.append(" World");

		buff.append(" ");

		buff.append("! How Are You..");

		System.out.println(buff);

	}

}
