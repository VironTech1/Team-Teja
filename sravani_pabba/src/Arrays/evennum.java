package Arrays;
import java.util.Scanner;

public class evennum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = {5,2,8,1,9,6,4,7};
		int i;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2 != 0)
					{
				System.out.println(arr[i]);
			
					}
		}
			
	}

}
