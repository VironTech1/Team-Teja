package basic_programs;
import java.util.Scanner;


public class fivetable {
	public static void main(String[] Args) {
		int p=5,i,result=1;
		System.out.println("The five table is ");
		for(i=1;i<=20;i++) {
			
			result = p * i;
			System .out.println( p + "*" + i + "=" + result);
			
		}
	}

}
