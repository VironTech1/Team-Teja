import java.util.Scanner;
public class Binary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int binary[]=new int[10];
		int k=0;
		System.out.println("Enter the number for binary conversion");
		int num=sc.nextInt();
		while(num!=0)
		{
			int digit=num%2;
			binary[k]=digit;
			num=num/2;
			k++;
		}
		
		for(int i=k-1;i>=0;i--)
		{
			System.out.print(binary[i]+" ");
		}
    }
}