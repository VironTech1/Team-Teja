package Arrays;
import java.util.Scanner;

public class Maxmin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = {5,2,8,1,9,6,4,7};
		int i,max = arr[0],min = arr[0];
	
		for(i=1;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				//System.out.println(max);
			}
			if(arr[i] < min)
			{
				min = arr[i];
				//System.out.println(min);
			}
		}

	
	System.out.println("Maximum num " + max);
	System.out.println("Minimum num " + min);
}
}
