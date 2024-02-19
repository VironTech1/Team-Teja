package Arrays;
import java.util.Scanner;

public class swaptwonums {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] arr = {1,3,5,1,7,2,4,6};
		int i,j,temp;
		i = scanner.nextInt();
		j = scanner.nextInt();
		
		for (i=0;i<arr.length;i++)
		{
		temp = arr[i];
		arr[i] = arr[j] ;
		arr[j]= temp;
		}
		
		
}
}
