package basic_programs;
import java.util.Scanner;

public class fibonacci {
	
	    public static void main(String[] args)
	    {
	        Scanner fibonacci = new Scanner(System.in);
	        System.out.println("Enter n value: ");
	        int n = fibonacci.nextInt();
	        int fn = 0, sn = 1;
	        for(int i=0; i<=n; i++)
	        {
	            System.out.println(fn+ " ");
	            int result = fn+sn;
	            fn = sn;
	            sn = result;
	        }
	        
	    }
	}






/*reverse and palindrome
		int rn=0;
		System.out.println("Enter number");
		int digit=sc.nextInt();
		int num=digit;
		while (digit != 0) {
          int d = digit % 10;
          rn = rn * 10 + d;
          digit /= 10;
      }
		System.out.println(rn);
		if(num==rn)
		System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome"); */