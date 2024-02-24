package Arrays;
import java.util.Scanner;

public class Dupelement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] arr = {1,3,5,1,7,2,4,6};
		int i,j;
		System.out.println("duplicate elements in the array");
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;i++)
			{
				if(arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
					break;
				}
			}
			
		

}
	}
}
