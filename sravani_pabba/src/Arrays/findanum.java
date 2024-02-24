package Arrays;
import java.util.Scanner;
public class findanum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int p;
		int[] arr = {5,7,2,4,9,3,10,12};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
			System.out.println("give any number");
			 p = scanner.nextInt();
			 
			 for(int i=0; i<arr.length;i++)
			 {
				 if(arr[i]==p)
				 {
					 System.out.println("number found at the index " +i);
				 }
				 
				 else if(i==arr.length-1)
				 {
					 
					 System.out.print("Number not found");
				 }
			 }
				
				 
					 
				 
			 }
			
			
		}
		
		
	



