import java.util.Scanner;
public class CurrentBill
{
 public static void main(String[] args)
 {
    Scanner current = new Scanner(System.in);
    System.out.println("Enter no of units:");
    int units = current.nextInt();
    if (units <= 100)
    {
        System.out.println("The price of current bill is 3rs");
    }
    else if(units > 101 && units <= 200)
    {
        System.out.println("The price of current bill is 4rs");
    }
    else if(units > 201 && units <= 300)
    {
        System.out.println("The price of current bill is 5rs");
    }
    else if(units > 301)
    {
        System.out.println("The price of current bill is 6rs");
    }

 }
}