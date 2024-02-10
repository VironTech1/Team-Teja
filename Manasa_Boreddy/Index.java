import java.util.Scanner;
public class Index
{
    public static void main(String[] args)
    {
        Scanner index = new Scanner(System.in);
		int[] num = {10, 20, 40, 60, 70};
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
			System.out.println("Give the num");
			int a = index.nextInt();
			 
			 for(int i=0; i<num.length;i++)
			 {
				 if(num[i]==a)
				 {
					 System.out.println("given number is found at the index " +i);
				 }
				 
				 else if(i==num.length-1)
				 {
					 
					 System.out.print("Number not found");
				 }  
		}								 					 				 
	}
}

