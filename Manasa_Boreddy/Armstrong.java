import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner armstrong = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = armstrong.nextInt();
        int orgnum = num;
        int noOfDigits = 0;
        int a = num;
        while(a != 0)
        {
            a /= 10;
            noOfDigits++;
        }
        int sum = 0;
        while(num != 0)
        {
            int digit = num%10;
            sum += Math.pow(digit, noOfDigits);
            num /= 10;
        }
        if(orgnum == sum)
        {
            System.out.println(orgnum+ " is a armstrong num");
        }
        else{
            System.out.println(orgnum+ " is not a armstrong num");
        }
    }
}