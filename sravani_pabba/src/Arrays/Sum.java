package Arrays;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = {5,2,8,1,9,6,4,7};
		int i,sum=0;
		
		for(i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
			
		}
		System.out.println("Sum of the array " + sum);
	}

}
