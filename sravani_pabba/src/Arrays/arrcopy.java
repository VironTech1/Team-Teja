package Arrays;
import java.util.Scanner;

public class arrcopy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] arr = {1,3,5,7,2,4,6,8};
		int [] s = new int[arr.length];
		int i;
		
		for(i=0;i<arr.length;i++)
		{
			s[i] = arr[i];
			
		}
		
		System.out.println("first array elements");
		
		for(int num : arr) {
			System.out.print(num + " ");
			
		}
		System.out.println();
		
		System.out.println("Second array elements");
		for(int num : s) {
			System.out.print(num +  " ");
			
		}
}
}
